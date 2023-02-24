package com.dq.springboot_recruit.websocket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Component;
/**
 *
 * @author yuanli
 * @date 2023/2/23 16:39
 */

@Component
@ServerEndpoint("/websocket/{id}")
public class WebServerSocket {
	private static int onlineCount = 0; // 在线人数
	private Session session;
	private String usid; // 用户id
	//存放每一个客户端对应的WebSocket对象
	private static CopyOnWriteArrayList<WebServerSocket> webSocketSet = new CopyOnWriteArrayList<WebServerSocket>();
	/*当以后连接上来时
	 * @param session
	 * @param usid
	 */
	@OnOpen
	public void onOp(Session session, @PathParam("id")String usid) {
			this.session = session;
			this.usid = usid;
			webSocketSet.add(this);
			addOnlineCount(); // 当前在线人数+1
			sendMessage("连接websocket服务器成功...");
			System.out.println("有新用户id为"+ usid +"的用户上线了，当前在线用户人数为 :" + onlineCount);
	}

	/*
	 * 当有连接断开时
	 */
	@OnClose
	public void onClose() {
		webSocketSet.remove(this) ; //从在线用户列表中移除当前用户
		subOnlineCount(); // 在线人数-1
		System.out.println("有用户id为"+ usid +"的用户下线了，当前在线用户人数为:" + onlineCount);
	}

	/*
	 *接收客户端消息的方法
	 * @param msg
	 * @param session
	 */
	@OnMessage
	public void onMessage(String msg, Session session) {
		System.out.println ("收到来自"+ usid + "的信息"+ msg);
		//群发信息
		for (WebServerSocket wss : webSocketSet) {
			wss.sendMessage(msg);
		}
	}


	/*
	 *出错了
	 * @param session
	 * @param error
	 */
	@OnError
	public void onError(Session session, Throwable error) {
		error.printStackTrace();
	}

	/*
	 *发送信息给客户端
	 * @param msg
	 */
	public void sendMessage(String msg) {
		try {
			this.session.getBasicRemote().sendText(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static synchronized void addOnlineCount() {
		WebServerSocket.onlineCount++;
	}

	private static synchronized void subOnlineCount() {
		WebServerSocket.onlineCount--;
	}

	public static int getOnlineCount() {
		return WebServerSocket.onlineCount;
	}

	/*根据用户id获取链接对象
	 * @param usid
	 * @return
	 */
	public static WebServerSocket getWebSocket(String usid) {
		if (webSocketSet.isEmpty()) {
			return null;
		}
		for (WebServerSocket wss: webSocketSet) {
			if (usid.equals(wss.usid)) {
				return wss;
			}
		}
		return null;
	}
}
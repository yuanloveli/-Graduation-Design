package com.dq.springboot_recruit.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月9日 下午4:08:21
*/
@Configuration
public class WebSocketConfig {
	@Bean
	public ServerEndpointExporter serverEndPointExporter() {
		return new ServerEndpointExporter();
	}
}
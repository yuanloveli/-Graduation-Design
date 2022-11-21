function openWebSocket(id) {
	var socket;
	if (typeof (WebSocket) == undefined){
		alert("对不起，您的浏览器不支持WebSocket通信");
		return;
	}
	//连接到websocket服务器
	socket = new WebSocket("ws://127.0.0.1:8080/websocket/" + id);
	
	socket.onopen = function() {
		console.info("Socket已经连接...");
	}
	
	socket.onclose = function() {
		console.info("Socket已经断幵...");
	}
	
	socket.onerror = function() {
		console.info ("Socket访问服务器失败...");
	}
	
	socket.onmessage = function(msg) {
		if (msg.data == "100") {//规定，如果响应的值是100,则说明是挤退信息
			alert ("对不起，您已经在其它地方登录，若非本人操作，请及时修改密码...");
			location.href="login/loginout";
		} else {
			console.info(msg);
		}
	}
}
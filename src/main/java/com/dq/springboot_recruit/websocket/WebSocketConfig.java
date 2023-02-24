package com.dq.springboot_recruit.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
/**
 *
 * @author yuanli
 * @date 2023/2/23 15:33
 */

@Configuration
public class WebSocketConfig {
	@Bean
	public ServerEndpointExporter serverEndPointExporter() {
		return new ServerEndpointExporter();
	}
}
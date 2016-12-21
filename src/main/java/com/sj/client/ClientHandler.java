package com.sj.client;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientHandler extends IoHandlerAdapter{

	private static Logger logger = LoggerFactory.getLogger(ClientHandler.class);  
	  
    @Override  
    public void messageReceived(IoSession session, Object message)  
            throws Exception {  
        String msg = message.toString();  
        logger.info("客户端接收到的信息为：" + msg);  
    }  
  
    @Override  
    public void exceptionCaught(IoSession session, Throwable cause)  
            throws Exception {  
        logger.error("客户端发生异常...", cause);  
    }  
}

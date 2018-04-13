package com.jimmy.ws.impl;

import com.jimmy.ws.IHelloService;
/**
 * http://127.0.0.1:8080/webservice-provider/services/HelloService?wsdl
 * @author jimmy
 *
 */
public class HelloServiceImpl implements IHelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("服务提供方sayHello:" + name);
		return "provider="+name;
	}

}

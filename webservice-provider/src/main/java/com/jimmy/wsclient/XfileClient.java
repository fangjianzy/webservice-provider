package com.jimmy.wsclient;

import java.net.MalformedURLException;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import com.jimmy.ws.IHelloService;

/**
 * 模拟一个webservice的客户端进行调用
 * @author jimmy
 *
 */
public class XfileClient {
	/**
	* @param args
	* @throws MalformedURLException 
	*/
	public static void main(String[] args) throws MalformedURLException {
		Service service = new ObjectServiceFactory().create(IHelloService.class);  
        XFireProxyFactory factory = new XFireProxyFactory(XFireFactory.newInstance().getXFire());  
        String url = "http://127.0.0.1:8080/webservice-provider/services/HelloService";  
        IHelloService helloService = (IHelloService) factory.create(service,url);  
        System.out.println("调用方打印===>"+helloService.sayHello("jimmy"));
	}
}

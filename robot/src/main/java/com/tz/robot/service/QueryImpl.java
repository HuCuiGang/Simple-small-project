package com.tz.robot.service;


import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
public class QueryImpl implements Query{
	public String getMessage(String str){
		String url="http://www.tuling123.com/openapi/api?key=";
		String key="65b74c964b5b4ee69ce989fb5496c58b";
		String finallyUrl= url+key+"&info="+str;
		StringBuffer sb=new StringBuffer();
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		URLConnection connection=null;
		try {
			URL url1 = new URL(finallyUrl);//创建连接对象
			connection=url1.openConnection();//打开连接
			
			is =connection.getInputStream();
			ir =new InputStreamReader(is);
			br=new BufferedReader(ir);
			String line="";
			
			while((line=br.readLine())!=null){
				sb.append(line);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					if(br!=null){
					br.close();
					}
					if(ir!=null){
						ir.close();
					}
					if(is!=null){
						is.close();
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		return sb.toString();
	}
	
/*	public static void main(String[] args) {
		String message=getMessage("你好");
		System.out.append(message);
	}*/
}

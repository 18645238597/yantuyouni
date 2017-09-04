/**
 * 
 */
package com.yantu.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * 2017-8-27上午9:37:52 用来发送短信验证码
 */
public class SMSverification {
	/**
	 * 返回一个map集合，保存验证码code和发送短信的状态码result
	 * 
	 * @param phone
	 * @return map
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public static HashMap<String, String> getMsgStatus(String phone)
			throws UnsupportedEncodingException, IOException {
		HashMap<String, String> map = new HashMap<String, String>();
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://gbk.sms.webchinese.cn");
		post.addRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=gbk");// 在头文件中设置转码
		String code = varificationCode();
		NameValuePair[] data = {
				new NameValuePair("uid", "yantuyouni"),
				new NameValuePair("key", "yantuyouni"),
				new NameValuePair("smsMob", phone),
				new NameValuePair("smsText", phone + "用户您好，欢迎加入沿途有你。验证码："
						+ code + "。") };
		post.setRequestBody(data);
		client.executeMethod(post);
		Header[] headers = post.getResponseHeaders();
		int statusCode = post.getStatusCode();
		System.out.println("statusCode===========" + statusCode);
		for (Header header : headers) {
			System.out.println(header.toString());
		}
		String result = new String(post.getResponseBodyAsString().getBytes(
				"gbk"));
		System.out.println("返回的状态消息========" + result);
		map.put("code", code);
		map.put("result", result) ;
		return map;

	}

	/**
	 * 生成四位随机数
	 * 
	 * @return
	 */
	public static String varificationCode() {
		String code = "";
		int i = (int) ((Math.random() * 9 + 1) * 1000);// 生成一个四位的随机数
		code = String.valueOf(i);// Integer.toString(i);
		return code;
	}
}

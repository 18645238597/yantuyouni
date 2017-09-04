/**
 * 
 */
package com.yantu.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.yantu.util.SMSverification;

/**
 * 2017-8-27上午10:30:31
 * 
 */
public class SMStest {
	public static void main(String[] args) {
		try {
			SMSverification.getMsgStatus("15545096668");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

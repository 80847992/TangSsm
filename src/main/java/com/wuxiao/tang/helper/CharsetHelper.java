package com.wuxiao.tang.helper;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 字符检查工具
 * @author Administrator
 *
 */
public class CharsetHelper {
	
	private static String charset = "UTF-8";

	/**
	 * 转换编码
	 * @param str
	 * @return
	 */
	public static String trans(String str){
		try {
			if (StringHelper.isNullOrEmpty(str)){
				return str;
			}
			str = URLDecoder.decode(str,charset);
			str = str.trim();
			if (!isCharset(str)){
				str = new String(str.getBytes("iso-8859-1"),charset);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 检查字符编码
	 * @param str
	 * @return
	 */
	public static boolean isCharset(String str){
		if (str == null || str.length() == 0){
			return true;
		}
		System.out.print("check charset is "+charset);
		boolean isCharset = false;
		try {
			isCharset = new String(str.getBytes(charset),charset).equals(str);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} finally{
			try {
				if (isCharset){
					System.out.println(" for: ["+str+"] result: "+isCharset);
				}else{
					System.out.println(" for: ["+(new String(str.getBytes("iso-8859-1"),charset))+"] result: "+isCharset);
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}			
		}
		
		return isCharset;
	}

}

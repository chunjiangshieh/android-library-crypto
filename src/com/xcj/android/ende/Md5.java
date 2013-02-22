package com.xcj.android.ende;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密
 * 非对称加密，无法解密
 * @author chunjiang.shieh
 *
 */
public class Md5 {


	/**
	 * MD5加密后的字节以十六进制形式字符串返回
	 * @param cleartext
	 * @return
	 */
	public static String toMd5(String cleartext) {  
		return toMd5(cleartext.getBytes());  
	}  

	public static String toMd5(ByteArrayOutputStream baos){
		return toMd5(baos.toByteArray());  
	}

	public static String toMd5(byte[] data){
		try {
			// Create MD5 Hash  
			MessageDigest digest = MessageDigest.getInstance("MD5");  
			digest.update(data);  
			byte messageDigest[] = digest.digest();  
			return HexUtil.toHex(messageDigest);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return "";  
	}

}

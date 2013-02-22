package com.xcj.android.ende;
/**
 *   SHA1 hash（SHA1 校验码）
 *   保证文件完整性
 * @author chunjiang.shieh
 *
 */
public class SHA1 {
	
	public static String digest(String content) {
		try {
			byte[] b = content.getBytes("utf-8");
			SHA1Digest digest = new SHA1Digest();
			byte[] out = new byte[digest.getDigestSize()];
			digest.update(b, 0, b.length);
			digest.doFinal(out,0);
			String shaHaxStr = new String(Hex.encode(out));
			return shaHaxStr;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

}

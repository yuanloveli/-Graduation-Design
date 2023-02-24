package com.dq.springboot_recruit.util;

/**
 *
 * @author yuanli
 * @date 2023/2/23 17:16
 */


public class StringUtil {
	
	public static boolean checkNull(String ... strs) {
		if (strs == null || strs.length <= 0) {
			return true;
		} else {
			for (String str : strs) {
				if (str == null || "".equals(str) || "null".equals(str)) {
					return true;
				}
			}
			return false;
		}
	}
}

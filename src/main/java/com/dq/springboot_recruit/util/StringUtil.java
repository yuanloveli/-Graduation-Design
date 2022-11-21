package com.dq.springboot_recruit.util;

/**
* @author 作者:dq
* @version 创建时间：2021年5月8日 上午11:11:03
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

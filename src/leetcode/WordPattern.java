package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		String strValue = "";
		Map<String, String> maps = new LinkedHashMap<>();
		String[] strArr = str.split(" ");
		String[] mapKeys = new String[maps.size()];
		String[] mapValues = new String[maps.size()];
		//pattern长度与结果str不一致的情况
		if(strArr.length != pattern.length()) {
			return false;
		}
		//判断str是否符合规则
		for(int i=0;i<pattern.length();i++) {
			if(maps.size()>0 && maps.get(pattern.charAt(i)+"") != null)
				if(!maps.get(pattern.charAt(i)+"").equals(strArr[i])) {
					return false;
				}
			maps.put(pattern.charAt(i)+"", strArr[i]+"");
		}
		//判断pattern是否符合规则
		for(String key:maps.keySet()) {
			if(strValue.equals(maps.get(key)+"")) {
				return false;
			}
			strValue = maps.get(key)+"";
		}
		return true;
	}
	public static void main(String[] args) {
		String pattern1 = "abba";
		String str1 = "dog cat cat dog";
		String pattern2 = "abba";
		String str2 = "dog cat cat fish";
		String pattern3 = "aaaa";
		String str3 = "dog cat cat dog";
		String pattern4 = "abba";
		String str4 = "dog dog dog dog";
		String pattern6 = "aaa";
		String str6 = "aa aa aa aa";
		String pattern7 = "jquery";
		String str7 = "jquery";
//		boolean result1 = new WordPattern().wordPattern(pattern1, str1);
//		System.out.println(result1);
//		boolean result2 = new WordPattern().wordPattern(pattern2, str2);
//		System.out.println(result2);
//		boolean result3 = new WordPattern().wordPattern(pattern3, str3);
//		System.out.println(result3);
//		boolean result4 = new WordPattern().wordPattern(pattern4, str4);
//		System.out.println(result4);
//		boolean result5 = new WordPattern().wordPattern(pattern5, str5);
//		System.out.println(result5);
//		boolean result6 = new WordPattern().wordPattern(pattern6, str6);
//		System.out.println(result6);
//		boolean result7 = new WordPattern().wordPattern(pattern6, str7);
//		System.out.println(result7);
//		Map<String, String> maps = new LinkedHashMap<>();
//		System.out.println(maps.get("a"));
	}

}

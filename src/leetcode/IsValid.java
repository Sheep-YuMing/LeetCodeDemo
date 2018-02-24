package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 有效的括号
 * @author ChaiYuming
 *
 */
public class IsValid {
	public boolean isValid(String s) {
		if(s.length()%2 > 0 || s.length() <= 0) {
			return false;
		}
		String bracketHalfL = "";
		String bracketHalfR = "";
		int strListIndex = -1;
		List<String> strList = new ArrayList<String>();
		String[] bracketArr = new String[s.length()];
		Map<String, String> bracketMap = new HashMap<String, String>();
		bracketMap.put(")", "(");
		bracketMap.put("]", "[");
		bracketMap.put("}", "{");
		//将字符串转为数组
		for(int i=0;i<s.length();i++)
			bracketArr[i] = s.charAt(i)+"";
		for(int i=0;i<s.length();i++) {
			System.out.println(strList.toString());
			if(strList.size()>0 && 
					(bracketMap.get(bracketArr[i])==null?"":bracketMap.get(bracketArr[i])).equals(strList.get(strListIndex))) {
				strList.remove(strListIndex);
				strListIndex--;
			}
			if(bracketMap.containsValue(bracketArr[i])) {
				strList.add(bracketArr[i]);
				strListIndex++;
			}
		}
		if(strList.size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		String bracketExampleA = "(){}[]";
		String bracketExampleB = "({)}[]";
		String bracketExampleC = "([){}]";
		String bracketExampleD = ")(";
		String bracketExampleE = "(";
		String bracketExampleF = ")";
		String bracketExampleG = "";
		String bracketExampleH = "(])";
		String bracketExampleI = "]";
//		System.out.println(new IsValid().isValid(bracketExampleA));
//		System.out.println(new IsValid().isValid(bracketExampleB));
//		System.out.println(new IsValid().isValid(bracketExampleC));
//		System.out.println(new IsValid().isValid(bracketExampleD));
//		System.out.println(new IsValid().isValid(bracketExampleE));
//		System.out.println(new IsValid().isValid(bracketExampleF));
//		System.out.println(new IsValid().isValid(bracketExampleG));
//		System.out.println(new IsValid().isValid(bracketExampleH));
		System.out.println(new IsValid().isValid(bracketExampleI));
	}

}

package leetcode;

import java.util.regex.Pattern;

/**
 * 将int数字反转
 * @author ChaiYuming
 *
 */
public class Reverse {

	public int reverse(int x) {
		StringBuffer sbRes = new StringBuffer();
		StringBuffer sb = new StringBuffer(String.valueOf(x));
		String regEx = "^[0-9]*$";
		String symbol = "";
		if(!Pattern.compile(regEx).matcher(sb.toString().substring(0, 1)).matches()) {
			symbol = sb.toString().substring(0, 1);
			sb.delete(0, 1);
		}
		System.out.println(sb.toString());
		for(int i=sb.length()-1;i>0;i--) {
			sbRes.append(sb.subSequence(i-1, i));
		}
		sbRes.insert(0,symbol+(sb.substring(sb.length()-1)));
		try {
			return Integer.parseInt(sbRes.toString());
		} catch (Exception e) {
			return 0;
		}
	}
	public static void main(String[] args) {
		int int1 = 123;
		int int2 = -123;
		int int3 = 120;
		int int4 = 1534236469;
		System.out.println(new Reverse().reverse(int4));
	}
}

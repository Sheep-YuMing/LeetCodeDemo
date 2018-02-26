package leetcode;

/**
 * 验证回文字符串 Ⅱ
 * @author ChaiYuming
 *
 */
public class ValidPalindrome {
	public boolean isSymmetric(String s) {
		if(s.length() > 50000) {
			return false;
		}
		if((s.charAt(s.length()-1)+"").equals(s.charAt(0)+"")) {
			return true;
		}else {
			StringBuffer sb = new StringBuffer();
			for(int i=s.length()-1;i>=0;i--) {
				if(String.valueOf(s.charAt(0)+"").equals(String.valueOf(s.charAt(i)+""))) {
					break;
				}
				sb.append(s.charAt(i)+"");
			}
			System.out.println(sb.toString().length()==0?"该字符串为回文":"你可以删除"+sb.toString()+"字符");
			return false;
		}
	}
	public static void main(String[] args) {
		String s1 = "abczsdasa";
		String s2 = "abczasds";
		String s3 = "aba";
		String s4 = "deeee";
		boolean res = new ValidPalindrome().isSymmetric(s4);
		System.out.println(res);
	}

}
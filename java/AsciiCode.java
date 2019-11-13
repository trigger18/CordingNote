package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atzAtZ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("알파벳 소문자, 대문자, 공백, 숫자만 입력하시오.");
		System.out.println("(단,  1 이상 25이하의 자연수)");
		String str = br.readLine();
		String[] sarr = str.split(" ");
		String res = "";
		char[] s = sarr[0].toCharArray();
		int num = Integer.parseInt(sarr[1]);
		for (int i = 0; i < s.length; i++) {
			if (i != 0) {
				res += " ";
			}
			int n = s[i];
			if (n==122 ) {
				n = (char) (n + num -58);
			} else if (n == 90) {
				n = (char) (n + num + 6);
			}else {
				n = (char) (n + num);
			}
			res += (char)n;
		}
		System.out.print(res);
	}// end main()
}// end class

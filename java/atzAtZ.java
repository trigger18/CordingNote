import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtZatz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("알파벳 소문자, 대문자, 공백, 숫자만 입력하시오.");
		System.out.println("(단,  1 이상 25이하의 자연수)");
		String str = br.readLine();
		String[] sarr = str.split(" ");
		String res = "";
		String abc = sarr[0];
		int num = Integer.parseInt(sarr[1]);
		res = solution(abc, num);
		System.out.print(res);
	}// end main()

	public static String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				answer += (char) ch;
			} else if (((ch + n) <= 'Z' && (ch + n) >= 'A') || ((ch + n) <= 'z' && (ch + n) >= 'a')) {
				answer += (char) (ch + n);
			} else if ((ch + n) > 'z' || (ch + n) > 'Z') {
				answer += (char) (ch + n - 26);
			}
		}
		return answer;
	}
}// end class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToUp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("try hello world를 입력하시오.");
		String str = br.readLine();
		String[] arr = str.split(" ");
		String res = solution(arr);
		System.out.print(res);
	}// end main()
	public static String solution(String[] str) {
		String answer = "";	
		for (int i = 0; i < str.length; i++) {
			if(i != 0) {
				answer += " "; 
			}
			for (int j = 0; j < str[i].length(); j++) {
				if (j % 2 == 0) {
					answer += Character.toString(str[i].charAt(j)).toUpperCase();
				} else {
					answer += Character.toString(str[i].charAt(j)).toLowerCase();
				}
			}
		}
		return answer;
	}// end solution()
}// end class

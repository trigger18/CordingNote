import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberReg {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("4, 6자리 정수를 입력하시오.");
		System.out.println("(단,  알파벳, 5 또는 7자리 입력시 false 출력)");
		String str = br.readLine();
		boolean res = solution(str);
		System.out.print(res);
	}// end main()

	public static boolean solution(String s) {
		boolean answer = true;
		Pattern pattern = Pattern.compile("^[0-9]{4}$");
		Matcher mat = pattern.matcher(s);
		Pattern pattern1 = Pattern.compile("^[0-9]{6}$");
		Matcher mat1 = pattern1.matcher(s);
		if (!mat.find() && !mat1.find()) {
			return answer = false;
		} else {
			return answer;
		}
	}// end solution()
}// end class

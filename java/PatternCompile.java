import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordLength {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("알파벳으로만 이루어진 단어를 입력하시오");
		System.out.println("(단, 10자 이하만 가능합니다.)");
		String str = br.readLine();
		int lang = str.length();
		Pattern pattern = Pattern.compile("^[a-zA-Z].{1,9}$");
		Matcher mat = pattern.matcher(str);
		if (mat.find()) {
			System.out.print(lang);
		} else {
			System.out.println("10자리가 넘었습니다 or 알파벳만 입력하시오");
		}
	}// end main()
}// end class

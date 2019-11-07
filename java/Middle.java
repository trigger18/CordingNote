import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Middle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 알파벳을 입력하시오");
		String str = br.readLine();
		String res = center(str);
		System.out.println("값 : " + res);
	}// end main()
	
	public static String center(String str) {
		int wcnt = str.length();
		int a =wcnt/2;
		String c = str.substring(a, a+1);
		return c;
	}// end center()
}// end class

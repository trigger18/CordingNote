import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Total {
	public static void main(String[] arge) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("영문이름을 입력하세요 : ");
		String str = bf.readLine();
		String str1 = str.toLowerCase();
		String[] num = str1.split(" ");
		String res = change(num[0], num[1]);
		System.out.println(res);
	}//end main
	public static String change(String a, String b) {
		a = a.substring(0,1).toUpperCase() + a.substring(1);
		b = b.substring(0,1).toUpperCase() + b.substring(1);
		return a + " " + b;
	}//end change()
}// end class	
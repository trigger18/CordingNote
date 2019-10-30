import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하시요 : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int a = 0; a < i + 1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < num-1; i++) {
			for (int j =0; j <= i+1; j++) {
				System.out.print(" ");
			}
			for (int a = 0; a < num-1-i ; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end main()
}// end class

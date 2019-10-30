import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하시요: " );
		String str = bf.readLine();
		int num = Integer.parseInt(str);
		for (int i = 1; i <= num; i++) {
			int[] a;
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}// end main()
}// end class

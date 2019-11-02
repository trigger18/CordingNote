import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sosu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하시요 : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int sum = 0;
		for (int i = 1; i <= num  / 2; i++) {
			sum += i;
		}
		if (sum == num) {
			System.out.printf("%s(은)는 완전수입니다.", num);
		} else {
			System.out.printf("%s(은)는 완전수가 아니다.", num);
		}
	}// end main()
}// end class

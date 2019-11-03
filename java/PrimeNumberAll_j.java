package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jong {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하세요 : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		for (int j = 2; j <= num; j++) {
			int cnt = 0;
			for (int n = 2; n <= j; n++) {
				if (j % n == 0) {
					cnt++;
				}
			}
			if (cnt == 1)
				System.out.printf("%d ", j);
		}
	}// end main()
}// end class

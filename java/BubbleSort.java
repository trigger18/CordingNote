

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 숫자를 입력하세요.");
		System.out.println("(단, 숫자사이는 ','로 구분해 주세요.)");
		String str = br.readLine();
		String[] strArr = str.split(",");
		int[] num = new int[strArr.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(strArr[i]);
		}

		for (int a = 0; a < num.length-1; a++) {
			for (int b = 0; b < num.length - a-1; b++) {
				if (num[b] > num[b + 1]) {
					int temp;
					temp = num[b];
					num[b] = num[b + 1];
					num[b + 1] = temp;
				}
			}
		}
		for (int j : num) {
			System.out.print(j + " ");
		}
	}// end main()
}// end class

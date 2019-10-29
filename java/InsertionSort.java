import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {
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

		for (int i = 0; i < num.length - 1; i++) {
			int key;
			for (int j = i; j >= 0; j--) {
				key = num[j + 1];
				if (num[j] > key) {
					num[j + 1] = num[j];
					num[j] = key;
				}
			}
		}
		for (int a : num) {
			System.out.print(a + " ");
		}
	}// end main()
}// end class

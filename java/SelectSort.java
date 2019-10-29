import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArr = str.split(",");
		int[] num = new int[strArr.length];
		for (int i = 0; i < num.length-1; i++) {
			num[i] = Integer.parseInt(strArr[i]);
		}
		System.out.println();
		for (int j = 0; j < num.length; j++) {
			for (int i = j + 1; i < num.length; i++) {
				if (num[j] >= num[i]) {
					int temp;
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
			System.out.print(num[j]+ " ");
		}
	}// end main()
}// end class

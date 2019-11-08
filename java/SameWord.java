import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SameWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 수를 연속중복해서 입력하시오.");
		System.out.println("(단, 정수사이 한칸 띄기)");
		String str = br.readLine();
		String[] num = str.split(" ");
		for (int j = 0; j < num.length - 1; j++) {
			if (num[j].equals(num[j + 1])) {
				num[j] = " ";
			}
		}
		for (int s = 0; s < num.length; s++) {
			if (!(num[s].equals(" "))){
				System.out.print(num[s] + " ");
			}
		}
	}// end main()
}// end class

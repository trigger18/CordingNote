import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하세요 : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int[] pna = new int[num];
		for (int j = 1; j <= num; j++) {
			pna[j - 1] = j;
		}
		for (int n = 2; n <= num; n++) {
			for (int i = 0; i < pna.length; i++) {
				if (pna[i] == 1) {
					pna[i] = 0;
				} else if (pna[i] % n == 0) {
					if (pna[i] != n) {
						pna[i] = 0;
					}
				}
			}
		}
		System.out.println("1부터 " + num + "까지의 소수는 : ");
		for (int g : pna) {
			if (g != 0) {
				System.out.print(g + ", ");
			}
		}
	}// end main()
}// end class

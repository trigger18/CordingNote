import java.util.Random;

public class ComplementOf2 {
	public static void main(String[] args) {
		int bin[] = new int[8];
		int i;
		for (i = 0; i < 8; i++) {
			Random random = new Random();
			bin[i] = random.nextInt(2);
		} 
		if (bin[0] + bin[1] + bin[2] + bin[3] + bin[4] + bin[5] + bin[6] == 0) {
			bin[7] = 1;
		}
		int bo1[] = new int[8];
		int bo2[] = new int[8];
		int J = 0;
		int N = 7;
		int C = 1;
		for (J = 0; J <= N; J++) {
			bo1[J] = 1 - bin[J];
		}
		J = N; 
		while (J >= 0) { 
			bo2[J] = 1;
			if (bo1[J] == C) {
				bo2[J] = 0;
			}
			C = bo1[J] * C;
			J--;
		}

		for (i = 0; i < 8; i++) {
			System.out.print(bin[i]);
		}
		System.out.println(" 자동 발생한 2진수");
		for (i = 0; i < 8; i++) {
			System.out.print(bo2[i]);
		}
		System.out.println(" 2의 보수");
	}// end main()
}// end class

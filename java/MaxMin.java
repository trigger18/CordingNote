import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		try {
			while (true) {
				System.out.print("첫 번째 수를 입력하세오 : ");
				a = scan.nextInt();
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해야 합니다.");
		}
		try {
			while (true) {
				System.out.print("두 번째 수를 입력하세오 : ");
				b = scan.nextInt();
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해야 합니다.");
		}
		scan.close();
		int big, small; // 큰수 작은수 넣어줄 변수
		int mok, na; // 몫 나머지
		int GCM, LCM; // 최대공약수, 최소공배수
		if (a >= b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		while (true) {
			mok = big / small;
			na = big - mok * small;// big%small
			if (na == 0) {
				GCM = small;
				LCM = (a * b) / GCM;
				System.out.println(a + "와 " + b + "의 최대공약수 : " + GCM);
				System.out.println(a + "와 " + b + "의 최소공배수 : " + LCM);
				break;
			}
			big = small;
			small = na;
		}
	}// end main()
}// end class

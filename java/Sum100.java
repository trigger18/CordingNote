package exam;

import java.util.Scanner;

public class Sum100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한개의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.printf("1부터 %d의 총합은 %d입니다.", num, sum);
	}// end main()
}// end class

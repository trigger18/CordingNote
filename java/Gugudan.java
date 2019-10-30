package exam;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한개의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println(num + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d \n", num, i, num * i);
		}
	}// end main()
}// end class

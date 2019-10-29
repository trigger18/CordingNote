import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <a; i++) {
			for(int j=0; j<a-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end main()
}// end class

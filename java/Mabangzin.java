import java.util.Scanner;

public class Mabangzin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 숫자를 입력하시오 : ");
		int mbz = sc.nextInt();
		int[][] arr = new int[mbz][mbz];
		// 시작 위치 임의 지정
		int row = 0;
		int col = mbz / 2;
		for (int i = 1; i < mbz * mbz; i++) {
			arr[row][col] = i;
			if (i % 5 == 0) {
				row++;
				if (row == 5) {
					row = 0;
				}
			} else {
				row--;
				col++;
				if (row == -1) {
					row = 4;
				}
				if (col == 5) {
					col = 0;
				}
			}
		}
		for (int j = 0; j < mbz; j++) {
			for (int k = 0; k < mbz; k++) {
				System.out.printf("%3d", arr[j][k]);
			}
			System.out.println();
		}
	}// end main()
}// end class

import java.util.Scanner;

public class Arr3D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 숫자를 입력하시오 : ");
		int cnt = sc.nextInt();
		int[][][] arr = new int[3][3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = cnt++;
				}
			}
		}
		for (int a = 0; a < arr.length; a++) {
			System.out.printf("%d층 배열\n", a + 1);
			for (int b = 0; b < arr[a].length; b++) {
				for (int arr3d : arr[a][b]) {
					System.out.print(arr3d + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}// end main()
}// end class

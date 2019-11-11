package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HT {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 수를 연속중복해서 입력하시오.");
		System.out.println("(단, 정수사이 한칸 띄기)");
		String str = br.readLine();
		String[] arr = str.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		// 배열을 리스트로 변환
		HashSet<String> arrHash = new HashSet<String>(arrList);
		// HashSet에 arrNum 데이터 삽입 | 바로 출력가능
		String[] arrRs = arrHash.toArray(new String[arrHash.size()]);
		// 중복이 제거된 HashSet을 다시 배열에 삽입
		for (int i = 0; i < arrRs.length; i++) {
			System.out.print(arrRs[i] + " ");
		}
	}// end main()
}// end class

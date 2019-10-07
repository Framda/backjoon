/*
[문제]
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

[입력]
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

[출력]
두 번째로 큰 정수를 출력한다.
*/
package level2;

import java.util.Scanner;

public class threeNumber {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String[] nums = input.split(" ");
		
		int A = Integer.parseInt(nums[0]);
		int B = Integer.parseInt(nums[1]);
		int C = Integer.parseInt(nums[2]);
		
		
		if(B == C && B != A) {
			System.out.println(B);
		}else if(A == C && C != B) {
			System.out.println(C);
		}else if(A == B && C != A) {
			System.out.println(A);
		}else if((B>A && A>C) || C>A && A>B) {
			System.out.println(A);
		}else if((A>B && B>C) || C>B && B>A) {
			System.out.println(B);
		}else {
			System.out.println(C);
		}
		
	}
}

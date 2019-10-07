/*
[문제]
A B 를 입력받고 A+B를 출력하세요

*/

package level3;

import java.util.Scanner;

public class sum7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int repeatNum = scan.nextInt();
		
		int sum = 0;
		int[] sumCase = new int[repeatNum];
		
		for(int i=0; i<repeatNum;i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			sum = num1 + num2;
			sumCase[i] = sum;
		}
		
		for(int i=1; i<=repeatNum;i++) {
			System.out.println("Case #" + i + ": " +sumCase[i-1]);
		}

	}

}

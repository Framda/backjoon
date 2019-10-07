/*
[문제]
1부터 명시된 수까지의 합을 출력한다 
*/

package level3;

import java.util.Scanner;

public class sumToNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=num;i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}

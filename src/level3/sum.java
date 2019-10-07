/*
[입력]
5
1 3
2 4
3 5
1 3 
2 3
[출력]
4
6
8
4
5 
*/
package level3;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int repeatNum = scan.nextInt();
		
		int sum = 0;
		for(int i=0; i<repeatNum;i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1 + num2;
			System.out.println(sum);
		}
		
	}
}

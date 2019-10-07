package level4;

import java.util.Scanner;

public class sum5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			int sum = num1 + num2;
			if(sum == 0) {
				break;
			}
			
			System.out.println(sum);
		}
	}
}

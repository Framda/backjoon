package Y2019D0930;

import java.util.Scanner;

public class Pactorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 1;
		while(n>0) {
			sum *= n;
			n--;
		}
		System.out.println(sum);
	}
}
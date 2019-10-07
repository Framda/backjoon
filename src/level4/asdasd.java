package level4;

import java.util.Scanner;

public class asdasd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int C = 0;
		int A = num / 10;
		int B = num - (A*10);
		if(A+B<10) { C = (B*10) + (A + B); } else{C = (B*10) + ((A+B)-10);}
		
		System.out.println(C);
	}
}

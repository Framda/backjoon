package level5;

import java.util.Scanner;

public class DivideResult {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		for(int i=0; i<10;i++) {
			int a = scan.nextInt();
			int R = a % 42;
			
			A[i] = R;
		}
		int F =10;
		for(int n=0; n<10; n++) {
			for(int m=n+1; m<10; m++) {
				if(A[n] == A[m]) {
					F--;
					break;
				}
			}
		}
		System.out.println(F);
	}
}
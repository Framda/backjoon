package level5;

import java.util.Scanner;

public class SumThreeNumCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		char[] N = String.valueOf(A * B * C).toCharArray();
		int[] M = new int[N.length];
		int[] O = new int[10];
		int k = 0;
		for(int i=0; i<N.length;i++) {
			k = 0;
			M[i] = Integer.parseInt(String.valueOf(N[i]));
			while(k != 10) {
				if(M[i] == k) {
					O[M[i]] = O[M[i]] + 1;
				} 
				k++;
			}
		}
		for(int i=0; i<10;i++) {
			System.out.println(O[i]);
		}
	}
}
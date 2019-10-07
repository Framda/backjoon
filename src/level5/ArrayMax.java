package level5;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int[] NS = new int[9];
		int max = NS[0];
		int nth = 0;
		for(int i=0; i<NS.length;i++) {
			NS[i] = scan.nextInt();
			if(NS[i] > max) {
				max = NS[i];
				nth = i;
			}
		}
		System.out.println(max);
		System.out.println(nth + 1);
	}
}
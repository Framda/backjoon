package level5;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();
		int[] N = new int[R];
		int MAX = N[0];
		int AVG = 0;
		for(int i=0; i<R;i++) N[i] = scan.nextInt();
		for(int i=0; i<R;i++) if(N[i]>MAX) MAX = N[i];
		for(int i=0; i<R;i++) N[i] = N[i]/(MAX*100);
		for(int i=0; i<R;i++) AVG += N[i];
		System.out.println(AVG/R);
		
	}
}
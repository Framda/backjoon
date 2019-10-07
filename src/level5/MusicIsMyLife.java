package level5;

import java.util.Scanner;

public class MusicIsMyLife {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 8;
		int result = 0;
		int[] n = new int[8];
		for(int i=0; i<8;i++) {
			n[i] = scan.nextInt();
		}
		for(int i=0; i<7;i++) {
			if(n[i]>n[i+1]) {
				result++;
			}
		}
		if(result == 0) System.out.println("ascending");
		else if (result == 7) System.out.println("descending");
		else System.out.println("mixed");
	}
}
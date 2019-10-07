package level5;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rn = Integer.parseInt(scan.nextLine());
		String[] SN = scan.nextLine().split(" ");
		int MIN = Integer.parseInt(SN[0]);
		int MAX = Integer.parseInt(SN[0]);
		for(int i=0; i<rn;i++) {
			int IN = Integer.parseInt(SN[i]);
			if(IN < MIN) MIN = IN;
		}
		for(int i=0; i<rn;i++) {
			int IN = Integer.parseInt(SN[i]);
			if(IN > MAX) MAX = IN;
		}
		System.out.println(MIN+ " " + MAX);
	}
}
package level3;

import java.util.Scanner;

public class rats {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int star = scan.nextInt();
		
		for(int m=0; m<star;m++) {
			for(int k=1; k<star-m;k++) {
				System.out.print(" ");
			}
 			for(int n=0; n<=m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

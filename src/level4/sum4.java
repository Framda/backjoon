package level4;

import java.util.Scanner;

public class sum4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A + B);
		}
	}
}
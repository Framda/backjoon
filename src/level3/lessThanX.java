package level3;

import java.util.Scanner;

public class lessThanX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] num = scan.nextLine().split(" ");
		int N = Integer.parseInt(num[0]);
		int X = Integer.parseInt(num[1]);
		

		String[] nums = scan.nextLine().split(" ");
		for(int i=0; i<N;i++) {
			if(X > Integer.parseInt(nums[i])) {
				System.out.println(Integer.parseInt(nums[i]));
			}
		} 
		
	}

}

package Y2019D0920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ContinuousSum {
	public static void main(String [] args) throws Exception {
		Reader reader = new InputStreamReader(System.in);
		String[] br = new BufferedReader(reader).readLine().split(" ");
		
		int[] num = new int[br.length];
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<br.length;i++) {
			num[i] = Integer.parseInt(br[i]);
		}
		
		int sum = 0;
		for(int i=0; i<num.length-1; i++) {
			if(num[i] * num[i+1] > 0) {
				sum +=num[i];
			} else {
				list.add(sum + num[i]);
			}
		}
		System.out.println();
	}
}
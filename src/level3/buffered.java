package level3;

import java.io.*;

public class buffered {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeatNum = Integer.parseInt(br.readLine());
		int[] nums = new int[repeatNum];
		int sum = 0;

		for(int i=0; i<repeatNum;i++) {
			String[] num = br.readLine().split(" ");
			
			
			sum = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
			nums[i] = sum;
		}
		for(int value : nums) {
			bw.write(value+"\n");//출력
		}

		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();//스트림을 닫음
	}
}

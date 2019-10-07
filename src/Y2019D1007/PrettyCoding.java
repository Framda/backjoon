package Y2019D1007;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrettyCoding {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineLength = Integer.parseInt(br.readLine());
		String[] NI = br.readLine().split(" ");
		String[] TI = br.readLine().split(" ");
		
		int[] nowIndent = new int[lineLength];
		int[] targetIndent = new int[lineLength];
		int[] calc = new int[lineLength];
		int answer = 0;
		for(int i=0;i<lineLength;i++) {
			nowIndent[i] = Integer.parseInt(NI[i]);
			targetIndent[i] = Integer.parseInt(TI[i]);
			calc[i] = targetIndent[i] - nowIndent[i];
		}
		for(int i=0;i<lineLength;i++) {
				if(calc[i]>0) {
					while(calc[i]!=0) {
						for(int j=i+1; j<lineLength-1;j++) {
							if(calc[i]*calc[j] > 0) {
								calc[j]--;
								System.out.println("J calc: "+calc[j]);
							} else {
								calc[i]--;
								System.out.println("min"+calc[i]);
								answer++;
								break;
							}
						}
					}
				}else if (calc[i]<0) {
					while(calc[i]!=0) {
						for(int j=i+1; j<lineLength-1;j++) {
							if(calc[i]*calc[j] > 0) {
								calc[j]++;
							} else {
								calc[i]++;
								answer++;
								break;
							}
						}
						calc[i]++;
						answer++;
					}
				}
		}
		
		
		System.out.println(answer);
		
	}
}
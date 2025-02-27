/*
[문제]
"45분 일찍 알람 맞추기"
이 방법은 단순하다. 원래 맞춰져있는 알람을 45분 앞서는 시간으로 바꾸는 것이다.
현재 상근이가 맞춰논 알람 시각이 주어졌을 때, "45분 일찍 알람 맞추기"를사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
그리고 이것은 현재 상근이가 맞춰놓은 알람 시간 H시 M분을 의미한다.
입력 시간은 24시간 표현을 사용한다. 
24시간 표현에서 하루의 시작은 0:0(자정)이고
끝은 23:59(다음날 자정 1분 전)이다.
시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

[출력]
첫째 줄에 상근이가 창영이의 방법을 사용할 때
맞춰야 하는 알람 시간을 출력한다.
(입력과 같은 형태로 출력하면 된다.)
*/
package level2;

import java.util.Scanner;

public class noticWatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String set = scan.nextLine();
		String[] time = set.split(" ");
		
		int H = Integer.parseInt(time[0]);
		int M = Integer.parseInt(time[1]);
		
		if(M < 45 && H - 1 > 0) {
			System.out.print(H - 1 + " ");
			System.out.print(((M + 60) - 45));
		} else if (H-1 > 0) {
			System.out.print(H + " ");
			System.out.print(M-45);
		} else {
			System.out.print(H+23 + " ");
			System.out.print(((M + 60) - 45));
		}
		
	}
}

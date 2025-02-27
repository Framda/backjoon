/*
[문제]
두 정수 A와 B가 주어졌을 때,
A와 B를 비교하는 프로그램을 작성하시오.
[입력]
첫째 줄에 A와 B가 주어진다.
A와 B는 공백 한 칸으로 구분되어져 있다
[출력]
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
*/
package level2;

import java.util.Scanner;

public class numberCompare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String inputNum = scan.nextLine();
		String[] num = inputNum.split(" ");
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);
		
		if (A > B) {
			System.out.println(">");
		}
		
		if (A < B) {
			System.out.println("<");
		}
		
		if (A == B) {
			System.out.println("==");
		}
		
	}
}

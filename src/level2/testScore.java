/*
[문제]
시험 점수를 입력받아 
90 ~ 100점은 A
80 ~ 89점은 B
70 ~ 79점은 C
60 ~ 69점은 D
나머지 점수는 F를
출력하는 프로그램을 작성하시오.

[입력]
첫째 줄에 시험 점수가 주어진다.
시험 점수는 0보다 크거나 같고
100보다 작거나 같은 정수이다.
[출력]
시험 성적을 출력한다.
*/
package level2;

import java.util.Scanner;

public class testScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String[] rank = {"A","A","B","C","D","E"};
		
		for(int i=0; i<5; i++) {
			if(100-(i*10)<= score) {
				System.out.println(rank[i]);
				break;
			}
		}
		if(score < 60) {
			System.out.println("F");
		}
	}

}

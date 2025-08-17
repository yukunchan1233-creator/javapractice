package basic;

import java.util.Scanner;

public class Basic27_ifif {

	public static void main(String[] args) {
		// 중첩if - if문에 if문을 사용할 수 있다
		// 점수와 학년을 입력받아 60점 이상이면 합격
		// 미만이면 불합격을 출력하시오. 단 4학년인 경우 70점 이상이어야 합격이다.
		// 학년 1 2 3 4 중 입력하고, 점수는 0-100점 사이로 입력한다.

		// 점수입력(0-100) : 65
		// 학년입력(1-4) : 4
		// 불합격 입니다.

		Scanner sc = new Scanner(System.in);
		// 변수

		int score, year;
		// 데이터 입력
		System.out.print("점수입력(0-100) : ");
		score = sc.nextInt();
		System.out.print("학년입력(1-4) : ");
		year = sc.nextInt();

		if (score >= 60) {
			if (year != 4) { // 1,2,3 학년 //if() year ==1 || year ==2 || year=3---?
				System.out.println("합격");
			} else if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}
	}
}

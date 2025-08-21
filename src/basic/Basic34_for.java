package basic;

import java.util.Scanner;

public class Basic34_for {

	public static void main(String[] args) {
		// 1부터 100까지 출력하는 프로그램을 작성하시오
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + " ");
		}
		System.out.println();

		// 1부터 100까지 숫자 중에서 홀수만 출력하는 프로그램을 for()문으로 작성하시오
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 1부터 100까지 숫자 중에서 짝수만 출력하는 프로그램을 for()문으로 작성하시오
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 1부터 100까지의 숫자 중에서 홀수의 합과 짝수의 합을 출력하시오 -for() //짝수합계변수(to) 홀수합계변수(te) 생성 생각 못함
		int to = 0, te = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				to = to + i;
			}
			if (i % 2 != 0) {
				te = te + i;
			}
		}
		System.out.println("홀수의 합 = " + to);
		System.out.println("짝수의 합 = " + te);

		// 출력예시 : 1+2+3+4+5 = 15 for문으로
		int hap = 0;
		for (int i = 1; i <= 5; i++) {
			hap = hap + i;
			if (i <= 4) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}

		}
		System.out.print(hap); // 15라는 합계는 1번만 출력되야 하니까 for문 밖에 타이핑하는것.

		// 키보드로 부터 국어 점수 3개를 입력받아 국어전체총점과 국어 전체평균을 출력하시오. //변수 어떻게 설정할지 먼저 생각하기
		// for문으로
		// 1번째 국어점수 입력 : 80
		// 2번째 국어점수 입력 : 80
		// 3번째 국어점수 입력 : 80
		// 국어 전체총점 : 240
		// 국어 전체평균 : 80.0
		System.out.println();
		int kor = 0;
		int tkor = 0;
		double tave = 0.0;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.print(i + "번째 국어점수 입력 : ");
			kor = sc.nextInt(); // 국어점수입력
			tkor = tkor + kor; // 국어전체총점 누적
		}

		tave = tkor / 3.0; // // 국어전체평균
		System.out.println("국어 전체총점 : " + tkor);
		System.out.println("국어 전체평균 : " + tave);

	}

}

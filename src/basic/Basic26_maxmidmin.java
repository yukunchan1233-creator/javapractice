package basic;

import java.util.Scanner;

public class Basic26_maxmidmin {

	public static void main(String[] args) {
		// 3개의 정수값을 입력받아 최대값 중간값 최소값을 출력하시오
		Scanner sc = new Scanner(System.in);

		// 변수
		int a, b, c;
		int max, mid, min;

		// 데이터 입력
		System.out.print("3개의 정수 값 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// 계산, 조건 처리
		if (a >= b && a >= c) {
			max = a;
		} else if (b >= a && b >= c) {
			max = b;
		} else {
			max = c;
		}

		if (a <= b && a <= c) {
			min = a;
		} else if (b <= a && b <= c) {
			min = b;
		} else {
			min = c;
		}

		if (a != max && a != min) { // 중간값은 max min 이후에 구해야겠지.
			mid = a;
		} else if (b != max && b != min) {
			mid = b;
		} else {
			mid = c;
		}
		// 중간값 구하는 또다른 논리 a+b+c - max-min 출력
		// 실기테스트 회사 -- 이처럼 어려운 시험을 냄. 쇼핑몰을 만들어라 이렇게 안함. 수학, 산수문제 // 배열까지가 기초임
		// cal 필기(쉬운 기초 문법) 영작문 면접.

		// 출력
		System.out.println("최대값 : " + max);
		System.out.println("중간값 : " + mid);
		System.out.println("최소값 : " + min);
	}
}

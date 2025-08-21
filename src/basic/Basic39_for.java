package basic;

import java.util.Scanner;

public class Basic39_for {

	public static void main(String[] args) {
		// 키보드로 부터 N개의 무작위 정수중에서 1-100사이의 정수 5개를 찾아서 //합계저장변수 //몇번째카운트변수 //
		// 합계를 출력하시오
		// 정수 : 10 1번
		// 정수 : -10 더하면 안됨
		// 정수 : 20 2번
		// 정수 : 30 3번
		// 정수 : 200 더하면 안됨
		// 정수 : 50 4번
		// 정수 : -70 더하면 안됨
		// 정수 : 10 5번째 정수 찾음.
		// 합계 : 120 더하면 안됨.

		int me = 0;
		int count = 0; // 카운트
		int sum = 0; // 합계
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("정수 : ");
			me = sc.nextInt();
			if (me >= 1 && me <= 100) {
				sum = sum + me;
				count = count + 1;
				if (count == 5) {
					break;
				}
			} else {
				continue;
			}
		}
		System.out.println("합계 : " + sum);

		// 강사님 답안
//		double me = 0;
//		int count = 0; // 카운트
//		int sum = 0; // 합계
//		Scanner sc = new Scanner(System.in);
//
//		for (;;) {
//			System.out.print("정수 : ");
//			me = sc.nextDouble();
//			if (me >= 1 && me <= 100) {
//				sum = sum + (int) me;
//				count = count + 1;
//				if (count >= 5) {
//					break;
//				}
//			} else {
//				continue;
//			}
//
//		}
//		System.out.println("합계 : " + sum);

	}

}

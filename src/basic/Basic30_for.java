package basic;

import java.util.Scanner;

public class Basic30_for {

	public static void main(String[] args) {
		// 가위(1) 바위(2) 보(3) 게임.

		// 컴퓨터가 무작위의 가위, 바위, 보 중에 한개의 숫자를 만들어야한다. : 1
		// 가위(1) 바위(2) 보(3) 숫자 입력하기 : 2
		// com 1 2 3
		// me
		// 1 0 -1 -2 컴이기긴거 -1 2 / 0 비김 / -2 1 내가이김.
		// 2 1 0 -1
		// 3 2 1 0
		// [출력] 당신 승리 or 컴퓨터 승리 or 비겼습니다. -- 위의경우 당신승리
		// 게임 끝나고 나서 한게임 더? [y/n] : y
		// y이면 다시실행, n이면 게임 종료 메세지를 띄운다.

		// 변수의 범위
		// 지역변수 : 선언된 블럭 안에서만 사용할 수 있는 변수
		// 전역변수 : 프로그램전체에서 사용할 수 있는 변수

		int com = 0;
		int me = 0;
		int countc = 0;
		int countm = 0;
		int countb = 0;
		int totcount = 0;
		Scanner sc = new Scanner(System.in); // if while 블럭 안에서 사용할 수 있음.

		for (;;) {
			com = (int) (Math.random() * 3) + 1; // 0
			// int me =sc.~~ //지역변수라서 밖에서 사용 불가함.
			System.out.print("가위(1) 바위(2) 보(3) 입력 :");
			me = sc.nextInt();
			if ((me - com) == -1 || (me - com) == 2) {
				System.out.println("컴퓨터가 승리");
				countc = countc + 1; // 지역변수로 설정하면 안됨. 포문 밖에 전역변수로 설정해야 포문안에서도 사용가능하니까.
			} else if ((me - com) == 0) {
				System.out.println("비김");
				countb = countb + 1;
			} else {
				System.out.println("당신 승리");
				countm = countm + 1;
			}

			if (countm >= 3 || countc >= 3) {
				if (countm > countc) {
					totcount = countm + countc + countb;
					System.out.println();
					System.out.println("총" + totcount + "판 중 " + " 3선 최종 내가 승리");
					break;

//			System.out.print("한게임 더? : [y/n] : ");
//			String yn = sc.next();
//			if (yn.equals("y")) {
//				continue;
//			} else {
//				System.out.println("게임을 종료합니다.");
//				break;
				} else {
					totcount = countm + countb + countc;
					System.out.println();
					System.out.println("총" + totcount + "판 중 " + "5판 3선 최종 컴퓨터가 승리");
					break;
				}
			}
		}
	}

	// Scanner sc = new Scanner(System.in);
	// boolean flag = true;
	// while(flag)
	// 컴퓨터는 무작위
	/*
	 * 
	 * 내숫자 - 컴 숫자를 빼준다
	 * 
	 *
	 */

}

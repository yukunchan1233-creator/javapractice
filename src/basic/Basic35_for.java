package basic;

import java.util.Scanner;

public class Basic35_for {

	public static void main(String[] args) {
		// 무한 반복문
		// for문과 Scanner 클래스를 이용하여 예금, 출금, 조회, 종료
		// 기능을 제공하는 코드를 작성해 보자

		// 1. 예금 | 2.출금 | 3.잔고 | 4.종료 //4누를때 까지 2줄를 무한반복 // 예금액 출금액 변수
		// 메뉴선택 : 1
		// 예금액 입력 : 10
		// 1. 예금 | 2.출금 | 3.잔고 | 4.종료
		// 메뉴선택 : 2
		// 출금액 입력 : 5
		// 1. 예금 | 2.출금 | 3.잔고 | 4.종료
		// 메뉴선택 : 3
		// 현재잔액 : 5
		// 1. 예금 | 2.출금 | 3.잔고 | 4.종료
		// 메뉴선택 : 4
		// 프로그램 종료

		int won = 0;
		int menu = 0;
		// int tot = 0;
		Scanner sc = new Scanner(System.in);

		for (;;) { // 무한반복 초기값 중간값 증가치를 적지않으면
			System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.print("메뉴선택 : ");
			menu = sc.nextInt();
			if (menu == 4) {
				break; // for문을 빠져나가라.
			}
			switch (menu) {
			case 1:
				System.out.print("예금액 입력: ");
				won = won + sc.nextInt(); // 캬
				// tot = tot + won;
				break; // switch-case블록을 벗어나라
			case 2:
				System.out.print("출금액 입력: ");
				won = won - sc.nextInt();
				// tot = tot - won;
				break;
			case 3:
				System.out.println("현재잔액: " + won);
				break;
			}
		} // for문 중괄호
		System.out.println("프로그램 종료"); // break없으면 위에서 무한반복해서 출력못하니가 엑박뜸.
	}

}

package basic;

import java.util.Scanner;

public class Basic_random {

	public static void main(String[] args) {
		// 업다운 게임 만들기
		// 컴퓨터는 무작위의 숫자 1-100중에서 한개를 만든다 --무작위숫자변수 , 스캐너변수
		// 나는 그 숫자를 맞추면 되는데
		// 몇번에 맞췄는지 출력해보자==--카운트하는 변수

		int com = 0; // 컴퓨터에서 무작위 숫자 저장변수
		int me = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		com = (int) (Math.random() * 100) + 1; // com 에 무작위 숫자 들어감.

		for (;;) {
			System.out.print("컴퓨터 생각을 맞추세요. 정수 값 입력 : ");
			me = sc.nextInt();
			cnt = cnt + 1;
			if (me > com) {
				System.out.println("down");
			} else if (me < com) {
				System.out.println("up");
			} else {
				System.out.println("right");
				System.out.println(cnt + "번째 맞추었습니다.");
				System.out.print("한판 더??[y/n]");
				String yn = sc.next();
				if (yn.equals("y")) { // else문안에 if문을 또 쓸수있음.
					cnt = 0; // 카운트 0으로 초기화 해야함.
					com = (int) (Math.random() * 100) + 1; // 무작위의 숫자를 다시 만들어라. 컨티뉴 뒤에만들면 안되지
					continue; // for문을 다시 실행한다.
				} else {
					break;
				}
				// else에 넣었는데for문을 나갈수 있네 break는 반복문을 나가라 //countine는 for문으로 다시가라
			}
		}

		// 숫자를 맞추면 몇번째 맞췀 메세지, 500투입후 다시 할게요 y/n
		// y이면 게임 처음부터 실행, n을 누르면 프로그램 종료되게
	}
}

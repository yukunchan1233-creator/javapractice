package basic;

public class Basic37_random {

	public static void main(String[] args) {
		// java.lang.Math 클래스
		// Math 클래스는 수학에서 자주 사용하는 상수들과 메서드들을 미리 구현해 놓은 클래스 이다.
		// Math클래스의 모든 메서드는 클래스, 즉 static 메서드 이므로
		// 객체를 생성하지 않고도 바로 사용할 수 있다.

		// 임의의 정수 만들기 : Math.random(); ---프로젝트할때 인증시 무작위 숫자 6개 만들기.
		// 이메일로 무작위의 문자열로 인증하기
		// 0.0보다 크거나 같고 1.0보다 작은 임의 숫자를 만들때 사용한다.
		// 임의의 문자 말들기 : UUID

		System.out.println(Math.random()); // 0.0 <= M < 1.0
		System.out.println(Math.random() * 10); // 0.0 <= M < 10
		System.out.println((int) (Math.random() * 10) + 1); // 1 <= M < 11
		System.out.println((int) (Math.random() * 6) + 1); // 1 <= M <= 6
		System.out.println((int) (Math.random() * 45) + 1); // 1 <= M <= 45

		// 핸드폰 인증번호(1~9) 6자리 무작위 만들기

		for (int i = 1; i <= 6; i++) {
			System.out.print((int) (Math.random() * 9) + 1);
			System.out.print(" ");
		}
		System.out.println();

		// 주사위 숫자 6개 무작위 만들기
	}

}

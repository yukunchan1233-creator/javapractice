package basic;

import java.util.Scanner;

public class Basic29_switch {

	public static void main(String[] args) {
		// 키보드로부터 숫자 2개를 입력받아서
		// 산술연산(+,-,*,/,%)중 하나를 선택하면 계산이 되어 출력하는 계산기를 만들어 보자.

		// 정수 입력 : 20
		// 정수 입력 : 10
		// 계산기 기호선택(+,-,*,/,%) : *
		// 곱셈결과 : 200

		Scanner sc = new Scanner(System.in); // 이거 해석 정리하기

		// 변수선언
		int x, y;
		String cal; // char 쓰면 안됨
		int result = 0;
		String presult = ""; // 문자열 + 숫자 =문자열 !!!!!!!!!!!!!1 // String 초기화.

		// 데이터입력
		System.out.print("정수 입력 : ");
		x = sc.nextInt();
		System.out.print("정수 입력 : ");
		y = sc.nextInt();
		System.out.print("계산기 기호선택(+,-,*,/,%) : ");
		cal = sc.next();

		// 조건식, 처리 프로그램 작성
//		if (cal.equals("+")) { // cal == "+" 가 아님
//								// String타입 선언변수와 문자열이 같은지 비교할 때는 ==을 사용하는 것이 아니라.equals() 메서드를 사용한다.
//			result = x + y;
//			presult = "덧셈 결과: " + result; // 문자열 + 숫자 = 문자열
//		} else if (cal.equals("-")) {
//			result = x - y;
//			presult = "뺄셈 결과: " + result;
//		} else if (cal.equals("*")) {
//			result = x * y;
//			presult = "곱셈 결과: " + result;
//		} else if (cal.equals("/")) {
//			result = x / y;
//			presult = "나눗셈 결과: " + result;
//		} else if (cal.equals("%")) {
//			result = x % y;
//			presult = "나머지 결과: " + result;
//		}

		switch (cal) {
		case "+":
			result = x + y;
			presult = "덧셈 결과 : " + result;
			break;
		case "-":
			result = x - y;
			presult = "뺄셈 결과 : " + result;
			break;
		case "*":
			result = x * y;
			presult = "곱셈 결과 : " + result;
			break;
		case "/":
			result = x / y;
			presult = "나눗셈 결과 : " + result;
			break;
		case "%":
			result = x % y;
			presult = "나머지 결과 : " + result;
			break;
		default:
			System.out.println("기호선택을 다시 하세요");
		}

		// 출력 -- 출력을 한번으로만 하게 유도
		System.out.println(presult);
	}

}

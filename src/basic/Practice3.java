package basic;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		String cal;
		int result;

		System.out.print("정수 입력 : ");
		x = sc.nextInt();
		System.out.print("정수 입력 : ");
		y = sc.nextInt();
		System.out.println("계산기 기호선택(+,-,*,/,)");
		cal = sc.next();
		result = 0;
		String presult = "";

		switch (cal) {
		case "+":
			result = x + y;
			presult = "덧셈 결과"; // presult = "덧셈결과 :"+result -----문자열+정수 = 문자열
			break;
		// Java는 + 연산자에서 피연산자 중 하나라도 문자열이면, 문자열 결합 연산으로 동작합니다.
		// 그래서 presult + result는 "덧셈 결과" + 5 → "덧셈 결과5"가 됩니다.
		case "-":
			result = x - y;
			presult = "뺄셈 결과";
			break;
		case "*":
			result = x * y;
			presult = "곱셈 결과";
			break;
		case "/":
			result = x / y;
			presult = "나눗셈 결과";
			break;
		case "%":
			result = x % y;
			presult = "나머지 결과";
			break;
		default:
			System.out.println("기호선택을 다시하세요");
		}
		System.out.println(presult + result); // sysout(presult)

	}

}

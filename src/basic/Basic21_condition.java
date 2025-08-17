package basic;

import java.util.Scanner;

public class Basic21_condition {

	public static void main(String[] args) {
		// 제어(조건)문
		// 프로그램의 흐름은 위에서 아래로 순차적으로 진행이 되는데
		// 필요에 따라 프로그램의 흐름을 바꾸고 싶을 때 사용한다 = 제어문
		// 제어문의 종류 : 조건문, 반복문
		// 조건문 : 조건식에 따라 다른 실행문을 실행하기 위해 사용한다. // 조건식은 참, 거짓중 하나를 계산해 주는것.
		// 종류 : if, if else, 다중 if-else, switch 문 --for문은 아님.

		// 단순 if문

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int score = sc.nextInt();

		// score가 80이상이면 합격을 출력하시오.
		// 삼항연산자로 한다면 :
		String result = (score >= 80) ? "합격" : "불합격"; // 이걸 if문으로
		System.out.println(result);

		if (score >= 80) { // 이상 >= 이하 <= 미만<
			System.out.println("합격");
		}
		if (score < 80) {
			System.out.println("불합격"); // if 참이던 거짓이던 실행 위에서 아래로 실행되니까.
		}

		// if~else 문 위에것을 쉽게
		if (score >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 여러개의 조건처리 = > 다중 if-else ..위에건 조건2개 --- 단순 if를 여러개써도 됨.

//		score가 90 이상이면 A
//		score가 80 이상이면 B
//		score가 70 이상이면 C
//		score가 60 이상이면 D
//		그렇지 않으면 F
		if (score >= 90 && score <= 100) { // 조건이 참이면 A를 출력한 후에 다음 문장을 실행한다
			System.out.println("A학점");
		}
		if (score >= 80 && score <= 89) { //
			System.out.println("B학점");
		}
		if (score >= 70 && score <= 79) {
			System.out.println("C학점");
		}
		if (score >= 60 && score <= 69) {
			System.out.println("D학점");
		}
		if (score < 60) {
			System.out.println("F학점");
		}

		// 다중if-else 문으로 바꾸기 //위에거 충족시 아래로 빠져나감. --
		// 더좋은이유. 다물어볼필요없으니까 위에것만 물어보고 충족되면 빠져나가서 다음블록을 실행시킴.
		if (score >= 90 && score <= 100) { // 조건이 참이면 블럭{}을 실행 후 if 문을 빠져나간 후 다음 실행문을 실행한다.
			System.out.println("A학점");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B학점");
		} else if (score >= 70 && score <= 79) {
			System.out.println("C학점");
		} else if (score >= 60 && score <= 69) {
			System.out.println("D학점");
		} else { // 여기 score <60 안해도됨.
			System.out.println("F학점");
		}

		if (score >= 90) { // &&없어도 괜찮음.
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else { // 여기 score <60 안해도됨.
			System.out.println("F학점");
		}
	}
}

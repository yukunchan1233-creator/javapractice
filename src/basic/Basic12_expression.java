package basic;

import java.util.Scanner;

public class Basic12_expression {

	public static void main(String[] args) {
		// 나누기(/)와 나머지(%) 응용
		// 10의 자리와 1의 자리 분리
		
		//69라는 숫자의 1의 자리와 10의 자리를 분리시키시오
		System.out.println("10의 자리 : "+ (69/10)); //몫 6
		System.out.println("1의 자리 : " + (69%10)); //나머지9
		
		//홀수인지, 짝수인지 판단할 수 있다.
		
		System.out.println("69%2"); //2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		//키보드로 부터 정수값을 입력 받아서 짝수이면 true, 홀수이면 false를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값: ");  //콘솔창에 칠수있게 먼저쳐주기  //next 위에는 쳐야함.
		int score = sc.nextInt(); 
		int rest = score%2;
		boolean result = rest==0;
		System.out.println("result :"+result);  // 불린없애고  시스아웃 (    : rest==0)해도됨.
		
	}
}

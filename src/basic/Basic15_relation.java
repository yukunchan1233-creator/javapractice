package basic;

import java.util.Scanner;

public class Basic15_relation {

	public static void main(String[] args) {
		/*
		 키보드로 부터 정수값을 입력받아 80-90 사이이거나 7의 배수이면 true
		   아니면 false를 출력하시오
		 (설계)입력한 정수가 80이상 그리고 90이하여야하거나 7의 배수  둘중의 하나라도 충족하면 true 아니면 false.
		 */
		// 짧고 가독성 좋게 만들기.
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		int a = sc.nextInt();
		System.out.println((a >= 80 && a <= 90) || ( a%7 == 0 ));
		
		/*강사답안
		 * Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		int a = sc.nextInt();
		boolean result = (a >= 80 && a <= 90) || ( a%7 == 0 );
		sysout ("result =" + result);
		
		 *강사답안2
		 *Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		int a = sc.nextInt();
		boolean b = (a >= 80 && a <= 90)
		boolean c = ( a%7 == 0 )
		boolean result = b || c
		System.out.println("result =" + result );
		
		 *
		 */
	}

}

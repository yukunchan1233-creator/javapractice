package basic;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		//키보드로부터 정수를 입력 받아 가장 큰 값을 출력하시오
		//입력예시
		// 정수입력:  70 100 50
		//출력예시
		//가장 큰 값은 100입니다.
		
		//변수선언
		int a,b,c ;   // int a=0,b=0,c=0;  --뭐.. 결과는 같음..
		int max;	  // int max=0;
		Scanner sc = new Scanner(System.in);
		
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		
		
		  max = (a>b)?a:b;              //누적형변수 + 삼항연산자
			max = (max>c)?max:c;
			System.out.printf("가장 큰 값은 %d 입니다", max);
		
	}
}
 
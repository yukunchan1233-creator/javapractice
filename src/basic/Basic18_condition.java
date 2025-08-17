package basic;

import java.util.Scanner;

public class Basic18_condition {

	public static void main(String[] args) {
		// 키보드로부터 정수를 입력 받아 가장 큰 값을 출력하시오
		// 입력예시
		// 정수 입력 : 70 100 50 
		//출력예시
		//가장 큰 값은 100 입니다.
		
		//변수선언
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");      
		int a = sc.nextInt();
		//System.out.print("정수 입력 : ");  //이렇게  하면 각자 숫자 받을수 있게 가능
		int b = sc.nextInt();
		//System.out.print("정수 입력 : ");
		int c = sc.nextInt();
		
		int max = (a>b)?a:b;              //누적형변수 + 삼항연산자
		max = (max>c)?max:c;
		System.out.printf("가장 큰 값은 %d 입니다", max);
		//sysoutprintln("가장 큰 값은" + max + "입니다")
				

	}

}

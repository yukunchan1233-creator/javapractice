package basic;

import java.util.Scanner; //ctrl shift o 되면 까먹어도 자동으로 쳐짐.

public class Basic14_relation {

	public static void main(String[] args) {
		//키보드로부터 정수값을 입력 받아서 입력 받은 값이 90-100사이면 true
		//(생각순서,설계먼저--숨은뜻 생각하고 인수분해하기.)
		//scanner , nextint , 변수a에 입력받은값 저장.
		//그렇지 않으면 false를 출력하시오
		//a가 90-100사이(인수분해 해서 명령어를 사용할 생각을 해야한다.) --------설계하고 코딩시작.
				//ㄴ a는 90이상이여야 한다./ 그리고/ a는 100이하여야 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 : ");
		int a = sc.nextInt();
		System.out.println("result : " + (a >= 90  && a <= 100) );
		
		//=	   a>=90만 하고 위에 100사이의 숫자조건을 추가해도 같은 결과.
		//Scanner sc = new Scanner(System.in);
		//System.out.println("정수값 : ");
		//int a = sc.nextInt();
		//boolean result = (a>=90 && a<=100);
		//System.out.println("result : " + result );
		
		//
		
	}

}

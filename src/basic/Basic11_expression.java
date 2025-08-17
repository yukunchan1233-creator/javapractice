package basic;

public class Basic11_expression {

	public static void main(String[] args) {
		//연산식 : 演(えん)算(ざん)式(しき)
		//연산자는 연산(계산)을 수행하는 기호
		//연산자의 종류에는 산술연산, 관계연산, 논리연산, 대입연산, 기타연산으로 구분한다.
		//산술연산 : +-*/%   -- int double 등 데이터형 주의.숫자가 잘려나올수 있음.
		
		int a=10; // 정수값 10을 4바이트 크기의 기억장소a 라는 변수에 저장.
		int b=3;  // 
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b)); //정수를 정수로 산술연산하면 정수값이 출력이 된다.--3으로 출력됨.
		System.out.println("a%b="+(a%b));
	}
}

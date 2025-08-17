package basic;

public class Basic13_realation { // 이설계도는 베이직이라는 폴더에 있다.  베이직13릴레이션을 

	public static void main(String[] args) { 
			//메소드 실행하려면 객체가 생성되어야 하는데 스태틱덕분에 객체생성없이 메인메소드 실행가능.
		
			//관계연산자 : 
			// 두 피연산자를 비교하여 true or false의 논리값을 출력한다.
			// 종류
			// >, <, >+, <=, ==(같다), !=(같지않다)
		
			//변수 a에 20을 대입하고, 변수 b에 10을 대입하여 관계연산을 하시오
			
			int a = 20;
			int b = 10;
			System.out.println(a>b);		
			System.out.println(a<b);		
			System.out.println(a>=b);		
			System.out.println(a<=b);		
			System.out.println(a==b);		
			System.out.println(a!=b);		
			
			//논리연산자
			//두개 이상의 조건을 비교하여 참 또는 거짓을 리턴해 준다.
			//종류 : not(!), and(&&--2개의 조건을 만족해야 참.), or(||)
			// true --!--false    
			// &조건
			// a조건(거짓) b조건(거짓)--거짓(&조건) , 거짓(||)    --! 참,   참
			// a조건(참) b조건(거짓)-- 거짓(&조건) , 참(||)
			// a조건(거짓) b조건(참)-- 거짓(&조건) , 참(||)
			// a조건(참) b조건(참)--   참(&조건)  , 참(||)
			
			boolean bool = false;
			System.out.println("bool : "+(bool));
			System.out.println("not bool : " +(!bool));
			int c = 30;
			int d = 40;
			System.out.println(" && : "+(a>b && c>d)); // ()-> 관계연산 -> 논리연산순으로 실행된다.  &&이 3번째로 실행.
			System.out.println(" && : "+(a>b || c>d)); // ()-> 관계연산 -> 논리연산순으로 실행된다.  ||이 3번째로 실행.
					
	}
}

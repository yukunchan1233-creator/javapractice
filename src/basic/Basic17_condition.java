package basic;

public class Basic17_condition {

	public static void main(String[] args) {
		/*  조건 연산자(삼항 연산자)
			형식: (조건 ? op1 : op2)
		*	조건이 참이면 op1을 수행하고 거짓이면 op2를 실행하라
		*	
		*/
		int r1 = (10>20)? 1: -1;
		System.out.println(r1);
		
		boolean r2 = (10>20)?true:false;
		System.out.println(r2);
		
		int tot = 97;
		String grade = (tot>=90)?"합격":"재시험"; //string쓰는이유 참이면 문자열 거짓이면 문자열.
		System.out.println("학점 : "+grade);
	
		/*  조건 연산자를 이용하여 3개의 정수중 가장 큰값, 가장 작은 값을 구하여 보자.
		 * 		 -- 3개를 변수에 넣고a,b,c 큰값을 넣을 변수max, 가장작은값min을 넣을 변수를 넣을 생각을 해야함.
		 * 			ㄴ a ,b를 비교해서 큰값을 max에 넣고 , 둘중한개(max)와 c를 비교해서==>  max = max>c
		 * 
		    조건?op1:op2
		
		*/ 
		int max =0; //최대값
		int min =0; //최소값
		
		int a=10,b=45,c=8;
		
		max = (a>b)?a:b; // 조건이 참이면 a를 max에 저장, 거짓이면 b를 max에 저장.
		max = (max>c)?max:c; //누적형변수
		System.out.printf("%d,%d,%d 중에서 가장 큰 값은 %d입니다\n ",a,b,c,max);
		
		// min변수 만들기 - abc변수 만들고 숫자 대입하기 -- ab비교해서 작은값을 min에 넣고 min과c를 비교해서 작은값을 min에 넣음.
		min = (a<b)?a:b;
		min = (min<c)?min:c;
		System.out.printf("%d,%d,%d 중에서 가장 작은 값은 %d입니다\n ",a,b,c,min);
		//System.out.println(a+","+b+","+c+" 중에서 가장 작은 값은"+min+"입니다");
	}
}

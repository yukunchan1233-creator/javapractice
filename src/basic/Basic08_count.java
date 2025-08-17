package basic;

public class Basic08_count {

	public static void main(String[] args) {
		// 누적형 변수 : 자신이 가지고 있는 값에 새로운 값을 연산 후 대입.
		
		//문제 : 1부터 5까지 합계를 구하는 프로그램 만들어보자.
		int cnt = 0;
		int sum = 0;
		
		System.out.println("cnt : "+cnt);
		System.out.println("sum : "+sum);
		
		cnt = cnt + 1;  // 오른쪽을 실행하고 왼쪽으로 대입.  오른쪽에서 왼쪽으로 방향기억. 즉 삭제되고 다시 저장하라는 뜻임. 변수잖아.
						// 누적형 변수 //1
		sum = sum + cnt; //1
		
		System.out.println("cnt : "+cnt);
		System.out.println("sum : "+sum);
		
		cnt = cnt + 1;  //2
		sum = sum + cnt; 	//3
		
		System.out.println("cnt : "+cnt);
		System.out.println("sum : "+sum);
		
		cnt = cnt + 1;	//3
		sum = sum + cnt;	//6
		
		System.out.println("cnt : "+cnt);
		System.out.println("sum : "+sum);
		
		cnt = cnt + 1;	//4
		sum = sum + cnt;	//10
		
		System.out.println("cnt : "+cnt);
		System.out.println("sum : "+sum);
		
		cnt = cnt + 1;	//5
		sum = sum + cnt;	//15
		
		System.out.println("cnt : "+cnt);
		System.out.println("sum : "+sum);
	}	
}

package basic;

public class Basic22_if {

	public static void main(String[] args) {
		
		int a = 134;
		//a값이 홀수인지 짝수인지 출력하시오.
		//if문, if-else문을 이용하시오.
		
	
		if(a%2 == 0) {
			System.out.println("짝수");  
		}else if(a%2 != 0) {
			System.out.println("홀수");
		}
		
		//a 값이 음수인지 양수인지 출력하시오.
		if(a>0) {
			System.out.println("양수입니다.");
		}else if(a<0) {
			System.out.println("음수입니다.");
		}
		
		//남자(M)인지 여자(F)인지를 출력하시오
		String gender = "F";
		if (gender== "M") {
			System.out.println("남자");
		}else {
			System.out.println("여자");  	
		}
		
		//a에 저장된 값이 3의 배수인지 출력하시오
		if(a%3 ==0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		//95이상이면 A+, 90이상이면 A, 85이상이면 B+, 80이상이면 B, 그렇지않으면 재시험
		int score = 85;
		String grade;  //학점저장 변수
		
		if(score >=95 && score <=100) {
			grade="A+";
		}else if(score >=90 ) {
			//System.out.println("A");
			grade="A";						//sysout 안써도 되게 위에서 String 씀.
		}else if(score >=85 ) {
			//System.out.println("B+");
			grade="B+";
		}else if(score >=80)  {
			grade="B";
		}else {						//맨마지막은 else로. 위 조건들 충족안되면 마지막으로이거야.
			grade="재시험";
		}
		System.out.println(grade + "입니다");			//출력 1번만 하면 되는 장점이 있음.
		
	}
}

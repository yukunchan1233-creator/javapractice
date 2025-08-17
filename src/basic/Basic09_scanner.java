package basic;

import java.util.Scanner;

public class Basic09_scanner {

	public static void main(String[] args) {

		//형변환 : 데이터 타입을 변경하는 것 (자동형변환,강제형변환)
		
		float b = 123.5f; //float형 데이터는 f를 붙인다.
		double c = 123.5d; // double형의 데이터는 d를 붙인다. 
		double d = 123.45; // 많이 사용하기 때문에 d 생략가능
	   // int a = 123.5;  123.5는 double형이니까 8바이트  int는 4바이트이니까 오류발생.
		double a = 123;  //  4바이트의 크기의 데이터를 8바이트의 그릇에 넣을수 있다.
						 // a에는 123.0으로 실수형으로 자동 형변환되어 저장된다.
		int e = (int)123.5;  // 강제 형변환 : 큰 값을 작은 그릇에 담는 방법. 잘라서 넣으면됨.
							// 123.5을 강제로 정수형123으로 변환하여 e변수에 저장하시오. 데이터손실이 발생함.
		System.out.println(e); // 123
		
		double f = (double)123; // 해도되고 안해도됨. 어짜피 123.0으로 저장됨.
		System.out.println(f);
		
		//문자열을 숫자로 변환하는 방법 --이거하는이유.:
		String id = "1234";  // 1234는 ""안에 있기때문에 숫자가 아니라 문자열임.
		int bno = Integer.parseInt(id); // id변수에 저장된 문자열 "1234"를 숫자로 변환 --반드시 외워야함.
		
		 System.out.println("문자열 id: " + id);
	        System.out.println("정수형 bno: " + bno); //bno는 이제 int 타입 → 숫자 연산 가능
									
		
	        
	        //Scanner 클래스. 
		//키보드로부터 데이터를 입력받기 위한 클래스
		
		Scanner sc = new Scanner(System.in);  //통채로 외워야함.  //콘솔창 껌뻑껌뻑  //콘솔에 정지단추뜸 엔터칠때까지
				// new : 클래스를 객체화 시키는 명령어. 스캐너라는 객체를 만들기. 스캐너라는 설계도를 객체화해라. 
				// 스캐너 클래스 객체가 사용할 수 있게 메모리에 올림.
				//사용하려면 왼쪽에 변수를 만들어야함. 클래스도 객체화시켜서 변수에 저장해야함.
				//. 참조하고자하는 객체이름을 적어야함. so   sc옆에 Scanner를 적어야함.
				// 스캐너 클래스를 참조하는 sc라는 변수입니다. Scanner 클래스를 참조형 데이터 타입 scanner타입이 되는것.(참조형) 
				// 클래스를 사용하려면 객체로 만들어야 되지? 만드는 키워드가 new
				// 스캐너 임포트했는데 설계도일뿐 객체로 만들어진것 아님. =오른쪽 스캐너 객체를 생성하세요
				// new 하면 메모리에 scanner라는 설계도가 제품화되서 \ 올라감. 객체가 저장된 번지가 있음.
				//sc라는 변수에는 번지가 저장됨.
				// sc왼쪽에 데이터형을 적어야함. Scanner객체를 참조해야함
		//sc라는 변수는 scanner라는 데이터 타입을객체를 참조할 것입니다. sc는 번지로 가서 객체를 사용할수 있게 된다.
				//new scanner() -- 스캐너매소드인데 여기선 생성자라고 부르는 메소드임.(new다음의 ()는 생성자라고함.)
				// system.in  키보드로부터 처리하고자 하는 여러 데이터를 입력받아라.
		
		//이름입력 받고 싶어
		System.out.print("name : ");
		String name = sc.next();  // next()라는 메소드는 1개의 문자열을 키보드로 부터 입력 받아 변수에 저장
									// ㄴ 주의사항 콘솔에 이름칠때 유 근찬 하면 안됨.
									//2개의 문자로 인식되기 때문
		
		//국어점수 입력 받고 싶어
		System.out.print("kor : "); // println 하면 아래 커서가 생성됨.
		int kor = sc.nextInt(); // nextint 정수값을 키보드로 부터 입력받도록 돕는 메소드 
								//콘솔에 100쓰고 엔터하면 kor에 100이 저장됨.
		
		//영어점수 입력 받고 싶어	
		System.out.print("eng : ");
		int eng = sc.nextInt();
		
		//수학점수 입력받고 싶어
		System.out.print("mat : ");
		int mat = sc.nextInt();
		
		//보너스점수 0.5을 키보드로부터 입력 받고 싶어.
		System.out.print("bonus : ");
		double bonus = sc.nextDouble(); // 실수값을 입력받도록 돕는 메소드
		
		double tot = kor+eng+mat+bonus; //총점계산  //bonus가 더블이라서 형변환을 시켜야함. 
							     //더블을 인트로 바꾸거나 인트를 더블로바꾸던지 데이터 형태를 변환해줘야함.
								//더블을 인트로 바꾸는법 (int)
		double avg = tot / 3; //평균계산 //데이터형이 double이라서 100이 100.0으로 저장됨.
		
		System.out.println("이름 : "+name+"입니다");
		System.out.println("총점 : "+tot+"입니다");
		System.out.println("총점 : "+avg+"입니다");
	//콘솔창 입력후 엔터하면 아래 글자 나옴.
		//변수선언, 변수저장(키보드로부터 입력받음. 스캐터객체생성.), 총점평균, 타이틀 번호 등등 출력.
	}

}

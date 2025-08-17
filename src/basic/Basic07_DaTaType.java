package basic;

public class Basic07_DaTaType {

	public static void main(String[] args) {
			//변수 선언과 동시에 초기화 할 수 있다.
			int id = 1101; //데이터형식, 변수명() 왼쪽을 변수선언 , =(대입문) 1101을 초기화값이라고함.
							// id라는 변수에 1101이 저장됨.
			String name = "홍길동"; // 홍길동이 어딘가에 저장이되고 name이라는 변수에 홍길동이 저장된 주소가 저장됨.
								 //sysout (name) 뜻은 변수의 데이터를 참조하여 다시 그 번지로 가서 그 데이터를 가져옴.그리고 출력.
			//기본형 참조형 다시 정리하기 : 
			int kor=100;   //=같다는 뜻아님. 100이라는 정수값을 4바이트 크기의 정수형 변수 kor에 저장하세요
			int eng=100;
			int mat=100;
			int tot= kor+eng+mat;  //kor변수, eng변수, mat변수에 저장된 값을 더해서 4바이트 크기의 tot라는 변수에 값을 저장하시오.
			int avg = tot /3;
			char grade = 'A';
			int rank =1;
			
			//위에 코딩들을 아래에 넣어도 되지만 분리하는 것이 보기 좋음.
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
			System.out.print(id+"\t"); // +(문자열결합) : id변수에 저장된 값을 출력하고나서 tab하시오  (숫자와 문자열을 더할수 없으니까)
			System.out.print(name+"\t");
			System.out.print(kor+"\t");
			System.out.print(eng+"\t");
			System.out.print(mat+"\t");
			System.out.print(tot+"\t");
			System.out.print(avg+"\t");
			System.out.print(grade+"\t");
			System.out.print(rank);
			
	}

}

package basic;

import java.util.Scanner;

public class Basic19_conditon {

	public static void main(String[] args) {
		// 학번, 이름,국어,영어,수학 점수를 입력받아서 총점, 평균, 합격여부를 출력하시오
		// 총점은 세 과목을 더하고, 평균은 총점을 과목수로 나눈다.
		// 합격여부는 평균이 80이상일 때 합격 아니면 불합격
		//[입력예시]
		// 학생정보 : 1 홍길동 90 90 90
		//[출력예시]
		// 학번 : 1
		// 이름: 홍길동
		// 국어 : 90
		// 영어 : 90
		// 수학 : 90
		// 총점 : 270
		// 평균 : 90.0
		// 합격여부 : 합격
		
		//클래스 객체 생성
		//변수선언
		//처리데이터 입력
		//총점, 평균, 합격여부 처리
		//출력

		//스캐너클래스객체생성
		Scanner sc = new Scanner(System.in);
		System.out.print("학생정보 : ");
		
		//변수선언 + 처리할 데이터 입력
		int bno = sc.nextInt();
		String name = sc.next();
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int matScore = sc.nextInt();
		int totScore = korScore + engScore+ matScore;
		float avgScore = totScore/3f ; 
		String grade = (avgScore>=80)?"합격":"불합격";  // 주의
		 
		//출력
		System.out.println("학번 : "+bno);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+korScore);
		System.out.println("영어 : "+engScore);
		System.out.println("수학 : " +matScore);
		System.out.println("총점 : "+ totScore);
		System.out.println("평균 : "+avgScore);
        System.out.println("합격여부 : "+grade);
		}	
}

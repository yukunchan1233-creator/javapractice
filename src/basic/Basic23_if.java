package basic;

import java.util.Scanner;

public class Basic23_if {

	public static void main(String[] args) {
		// 학번, 이름, 국어, 영어, 수학 점수를 입력받아 //저장시 자동정렬
		// 총점, 평균, 학점, 합격여부를 출력하시오

		// 데이터 입력 : 1 홍길동 90 90 90
		// 성적표
		// 번호 이름 국어 영어 수학 총점 평균 학점 합격여부
		// 1 홍 90 90 90 270 90.0 A 합격

		// 학점은 평균이 90이상 A, 80이상 B, 70이상 C, 60이상 D, 그렇지 않으면 F
		// 합격여부는 80이상이면 합격 그렇지 않으면 불합격

		// ★★★★★ 개발순서 ★★★★★
		// 1. 변수선언
		// 2. 데이터입력
		// 3. 계산식, 조건처리
		// 4. 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 입력(번호 이름 국어 영어 수학) : ");

		int bno = sc.nextInt();
		String name = sc.next();
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int matScore = sc.nextInt();
		int totScore = korScore + engScore + matScore;
		float avgScore = totScore / 3f;
		String grade = "F"; // 고친부분
		String passedResult = (avgScore >= 80) ? "합격" : "불합격"; // 고친부분 string 설정하는거 아직

		if (avgScore >= 90) { // ctrl f(find) 로 변수이름을 다 바꿀수 있음. replace all
			grade = "A"; // sysout 넣는것보다 깔끔, 출력문 나중에 모으기도 좋음.
							// 위에 string grade 없애고 sysout ("A학점") 해도 되긴하는데 변수설정해서 해결하는 방향으로 나가게 하는게 유지,보수하기도
							// 좋음
							// 좋다고함.
		} else if (avgScore >= 80) {
			grade = "B";
		} else if (avgScore >= 70) {
			grade = "C";
		} else if (avgScore >= 60) {
			grade = "D";
		}

		// if(avgScore>=80) {
		// passedResult = "합격";
		// }else {
		// passedResult = "불합격";
		// }

		System.out.println("\t\t\t성적표");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("번호\t" + "이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점\t" + "합격여부\t");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(bno + "\t" + name + "\t" + korScore + "\t" + engScore + "\t" + matScore + "\t" + totScore
				+ "\t" + avgScore + "\t" + grade + "\t" + passedResult + "\t");
		// printf 쓰는법 : 생각해보기.
	}
}

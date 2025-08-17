package basic;

import java.util.Scanner;

public class Basic24_if {

	public static void main(String[] args) {
		// 학번,성별(1,2) ,이름, 국어, 영어, 수학 점수를 입력받아 //저장시 자동정렬
		// 총점, 평균, 학점, 합격여부를 출력하시오

		// 데이터 입력 : 1 2 홍길동 90 90 90
		// 성적표
		// 번호 이름 성별 국어 영어 수학 총점 평균 학점 합격여부
		// 1 홍 90 여자 90 90 270 90.0 A 합격
		// 성별은 남자면1 여자면2를 입력받는다.
		// 성별 출력은 1이면 남자, 2이면 여자로 출력한다.
		// 학점은 평균이 90이상 A, 80이상 B, 70이상 C, 60이상 D, 그렇지 않으면 F
		// 합격여부는 80이상이면 합격 그렇지 않으면 불합격

		// ★★★★★ 개발순서 ★★★★★
		// 1. 변수선언
		// 2. 데이터입력
		// 3. 계산식, 조건처리
		// 4. 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 입력 : ");
		int bno = sc.nextInt();
		int sex = sc.nextInt();
		String name = sc.next();
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int matScore = sc.nextInt();
		int totScore = korScore + engScore + matScore;
		double avgScore = totScore / 3;
		String grade = "F";
		String passedResult = (avgScore >= 80) ? "합격" : "불합격";
		String a = "남자";

		if (sex != 1) {
			a = "여자";
		}

		if (avgScore >= 90) {
			grade = "A";
		} else if (avgScore >= 80) {
			grade = "B";
		} else if (avgScore >= 70) {
			grade = "C";
		} else if (avgScore >= 60) {
			grade = "D";
		}

		System.out.println("\t\t\t성적표");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("번호\t" + "성별\t" + "이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점\t" + "합격여부\t");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(bno + "\t" + a + "\t" + name + "\t" + korScore + "\t" + engScore + "\t" + matScore + "\t"
				+ totScore + "\t" + avgScore + "\t" + grade + "\t" + passedResult + "\t");
	}
}

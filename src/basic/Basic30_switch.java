package basic;

import java.util.Scanner;

public class Basic30_switch {

	public static void main(String[] args) {
		// 학번 이름 국어 영어 수학점수를 키보드로 부터 입력받아 아래와 같이 출력 하시오.
		// 학번 : 1111
		// 이름 : 홍길동
		// 성별[남자:t, 여자:f] : t
		// 국어 영어 수학 입력 : 80 80 80

		// 출력
		// 학번 이름 성별 국어 영어 수학 총점 평균 학점 합격여부
		// 1111 유근찬 남자 80 80 80 160 80.0 B 합격

		// 조건
		// 성별 처리식은 if문으로 작성하고 학점은 switch-case문으로 작성하시오
		// ㄴ case안에 넣을것 힌트 97을 10으로 나누어 정수형타입으로 형변환하면 9
		// (int) avg/10
		// 학점은 평균이 90이상이면 A, 80이상이면 B, 그렇지 않으면 F
		// 합격여부는 평균이 80이상이면 합격, 그렇지 않으면 불합격

		// 변수선언
		// 데이터입력
		// 조건, 계산처리
		// 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("학번 : ");
		int bno = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별[남자:t, 여자:f] : ");
		String gender = sc.next();
		System.out.print("국어 영어 수학 점수입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int tot = kor + eng + mat;
		double ave = tot / 3; // 정수 /정수=정수 , 실수/실수=실수 정수/실수=실수 실수/실수=실수
		int pave = (int) ave / 10; // 여기실수
		String grade; // 학점
		String pass;
		String genderPrint; // 변수만들고 성별 출력하기. 이때 변수안만들면 출력할때 if설정해야함. 8.18 사진 체크

		if (gender.equals("t")) { // 여기실수
			genderPrint = "남자";
		} else {
			genderPrint = "여자";
		}

		switch (pave) { // (int)(ave/10)
		case 10: // 10 or 9로 해석함 //정수형 형번환이 핵심임.
		case 9:
			grade = "A";
			pass = "합격";
			break;
		case 8:
			grade = "B";
			pass = "합격";
			break;
		default:
			grade = "F";
			pass = "불합격";
		}

		System.out.println("학번\t" + "이름\t" + "성별\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "학점\t" + "합격여부\t"); // "학번/t/이름
																														// ---"
																														// 이렇게
																														// 해도됨.
		// System.out.print(bno+"\t");
		// System.out.print(name+"\t");
		// if(gender.equalsIgnoreCase("t")) { // 대소문자 관계없이 //성별 변수 안만들고 출력하는법
		// System.out.print("남자");
		// }else {
		// sysout("여자"+"\t") -----
		// }
		System.out.println(bno + "\t" + name + "\t" + genderPrint + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot
				+ "\t" + ave + "\t" + grade + "\t" + pass);
	}

}

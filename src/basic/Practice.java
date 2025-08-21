package basic;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학번 : ");
		int bno = sc.nextInt();
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("성별[남자:t, 여자:f] : ");
		String gender = sc.next();
		System.out.println("국어 영어 수학 점수입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int tot = kor + eng + mat;
		double ave = tot / 3;
		int pave = (int) ave;

		String grade;
		String pass;
		String genderPrint;

		if (gender.equals("t")) {
			genderPrint = "남자";
		} else {
			genderPrint = "여자";
		}

		switch (pave) {
		case 10:
		case 9:
			grade = "A";
			pass = "합격";
			break;
		}
	}
}

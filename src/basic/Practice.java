package basic;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("사원번호 : ");
		int bno = sc.nextInt();
		System.out.print("성명 : ");
		String name = sc.next();
		System.out.print("성별 : ");
		int gender = sc.nextInt();
		System.out.print("직급 :");
		int grade = sc.nextInt();
		System.out.print("기본급 :");
		int pay = sc.nextInt();
		int bonus = 0;
		String genderPrint;
		String gradePrint; // 여기에 사원을 첨부터 넣어버려도 ok
		int tot = pay + bonus;

		if (gender == 1) {
			genderPrint = "남자";
		} else {
			genderPrint = "여자";
		}

		if (grade == 1) {
			gradePrint = "이사";
			bonus = 300;
		} else if (grade == 2) {
			gradePrint = "부장";
			bonus = 200;
		} else if (grade == 3) {
			gradePrint = "과장";
			bonus = 100;
		} else if (grade == 4) {
			gradePrint = "대리";
			bonus = 50;
		} else {
			gradePrint = "사원";
			bonus = 10;
		}

		System.out
				.println("사원번호" + "\t" + "성명" + "\t" + "성별" + "\t" + "직급" + "\t" + "기본급" + "\t" + "보너스" + "\t" + "총액");
		System.out.println(
				bno + "\t" + name + "\t" + genderPrint + "\t" + gradePrint + "\t" + pay + "\t" + bonus + "\t" + tot);

	}
}

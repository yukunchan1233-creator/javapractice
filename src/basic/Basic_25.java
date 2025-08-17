package basic;

import java.util.Scanner;

public class Basic_25 {

	public static void main(String[] args) {
		// 사원번호, 성명, 성별, 직급, 기본급을 입력받아 조건에 맞게 처리 출력하시오
		// 사원번호 : 1101
		// 성명 : 유근찬
		// 성별 : 남자면 m 여자면 f m
		// 직급 : 1이사, 2부장, 3과장, 4대리 5사원 5
		// 기본급 : 260
		// 사원번호 성명 성별 직급 기본급 보너스 총액
		// 1110 홍자바 남자 사원 260 10 270

		// 보너스 지급은 이사는 300만원, 부장은 200, 과장 100, 대리50, 사원 10을 지급
		// 총액 : 기본급 + 보너스

		Scanner sc = new Scanner(System.in);
		System.out.print("사원번호 : ");

		int bno = sc.nextInt();
		System.out.print("성명 : "); // 이부분주의
		String name = sc.next();
		System.out.print("성별 : ");
		int gender = sc.nextInt();
		System.out.print("직급 : ");
		int grade = sc.nextInt();
		System.out.print("기본급 : ");
		int pay = sc.nextInt();
		int bonus = 0;
		int tot = pay + bonus;
		String genderprint;
		String levelprint;

		if (gender == 1) {
			genderprint = "남자";
		} else {
			genderprint = "여자";
		}

		if (grade == 1) {
			bonus = 300;
			levelprint = "이사";
		} else if (grade == 2) {
			bonus = 200;
			levelprint = "부장";
		} else if (grade == 3) {
			bonus = 100;
			levelprint = "과장";
		} else if (grade == 4) {
			bonus = 50;
			levelprint = "대리";
		} else {
			bonus = 10;
			levelprint = "사원";
		}

		if (grade > 5 || grade < 1) {
			System.out.println("직급을 잘못 입력했어요.");
		}

		System.out.println("사원번호\t" + "성명\t" + "성별\t" + "직급\t" + "기본급\t" + "보너스\t" + "총액");
		System.out.println(
				bno + "\t" + name + "\t" + genderprint + "\t" + levelprint + "\t" + pay + "\t" + bonus + "\t" + tot);

	}

}

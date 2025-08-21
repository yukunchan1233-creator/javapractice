package basic;

public class Basic36_for {

	public static void main(String[] args) {
		// +1-2+3-4+5-6+7-8+9-10 = -5
		// 홀수는 더하고 짝수는 빼는 프로그램을 만들어보자
		// 생각 : +1출력 -2출력 ...... =출력 , 총액출력

		int tot = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				tot = tot + i;
				System.out.print("+" + i);
			} else {
				tot = tot - i;
				System.out.print("-" + i);
			}
		}
		System.out.println(" = " + tot);

		System.out.println();

		tot = 0;
		int i = 1; // 조건문부족..so 변수설정어? 중복이 안되네>?
		while (i <= 10) {
			if (i % 2 != 0) {
				tot = tot + i;
				System.out.print("+" + i);
			} else {
				tot = tot - i;
				System.out.print("-" + i);
			}
			i++;
		}
		System.out.println(" = " + tot);

		System.out.println();

		i = 1;
		tot = 0;
		do {
			if (i % 2 != 0) {
				tot = tot + i;
				System.out.print("+" + i);
			} else {
				tot = tot - i;
				System.out.print("-" + i);
			}
			i++;
		} while (i <= 10);
		System.out.println(" = " + tot);
		System.out.println();
		// switch 방식
		tot = 0;
		boolean sw = true; // 맨처음엔 true를 저장시킴 true일때 더하고 false일때는 빼고.
		i = 1;
		while (i <= 10) {
			if (sw) {
				System.out.print("+" + i);
				tot = tot + i;
				sw = false;
			} else {
				System.out.print("-" + i);
				tot = tot - i;
				sw = true;
			}
			i++;

		}
		System.out.print(" = " + tot);

	}

}

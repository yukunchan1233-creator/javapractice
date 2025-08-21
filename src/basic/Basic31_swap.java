package basic;

public class Basic31_swap { // 배우는 이유 : 학번 오름차순, 내림차순으로 출력하시오 데이터정렬. 학번 섞여있을때 학번 기준으로 순서대로 출력해야하는경우 옮겨야 하니까.
							// 얘를 일로옮기고 절로옮기고할때 사용.

	public static void main(String[] args) {
		// 데이터 교환
		// 콜라와 사이다 컵 바꾸기 -- 컵하나 더 만들어야함. // 임시변수temp만들기 거기에 데이터 담고 b변수의 데이터를 a변수에 옮기기

		int a = 20;
		int b = 10;
		System.out.println(a + "," + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + "," + b);
		System.out.println();

		// 누적공식
		// 1 2 3 4 5를 출력하시오
		System.out.println(1 + "\t");
		System.out.println(2 + "\t");
		System.out.println(3 + "\t");
		System.out.println(4 + "\t");
		System.out.println(5 + "\t");
		System.out.println();

		// 변수를 이용하시오
		int n = 0;
		n = n + 1; // 1 n += 1
		System.out.println(n + "\t");
		n = n + 1; // 2
		System.out.println(n + "\t");
		n = n + 1; // 3
		System.out.println(n + "\t");
		n = n + 1; // 4
		System.out.println(n + "\t");
		n = n + 1; // 5
		System.out.println(n + "\t");
		System.out.println();

		// 국어 정수의 총 합계를 구하시오
		int tkor = 0; // 총합계
		int kor = 10;
		tkor = tkor + kor;
		System.out.println("국어 합계: " + tkor);
		kor = 20;
		tkor = tkor + kor;
		System.out.println("국어 합계: " + tkor);
		kor = 30;
		tkor = tkor + kor;
		System.out.println("국어 합계: " + tkor);
		kor = 40;
		tkor = tkor + kor;
		System.out.println("국어 합계: " + tkor);
		kor = 50;
		tkor = tkor + kor;
		System.out.println("국어 합계: " + tkor);

		// 1~5 숫자중 홀수의 합
		n = 1;
		int todd = 0;
		if (n % 2 != 0) {
			todd = todd + n;
		}
		n = n + 1;
		if (n % 2 != 0) {
			todd = todd + n;
		}
		n = n + 1;
		if (n % 2 != 0) {
			todd = todd + n;
		}
		n = n + 1;
		if (n % 2 != 0) {
			todd = todd + n;
		}
		n = n + 1;
		if (n % 2 != 0) {
			todd = todd + n;
		}
		n = n + 1;
		if (n % 2 != 0) {
			todd = todd + n;
		}
		System.out.println("1~5 까지 숫자중 홀수의 합 : " + todd);

	}

}

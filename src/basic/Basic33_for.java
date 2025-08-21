package basic;

public class Basic33_for {

	public static void main(String[] args) {
		// 1부터 100까지 출력하는 프로그램을 while, do-while,for문으로작성하시오

		// while
		// 2 / 10 === 몫0 나머지2

		int n = 1;
		while (n <= 100) {
			System.out.print(n + " "); // 1 / 10 나머지 1 정수 나누기 정수는 나머지는 정수.
			n = n + 1;
			if (n % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		// do-while

		n = 0;
		do {
			n = n + 1;
			System.out.print(n + " ");
			if (n % 10 == 0) {
				System.out.println();
			}
		} while (n < 100);
		System.out.println();

		// for
		n = 0;
		for (int i = 1; i <= 100; i++) {
			// n = n + 1;
			System.out.print(i + " "); // 결과는 같음.
			if (n % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}

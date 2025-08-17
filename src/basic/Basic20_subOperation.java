package basic;

public class Basic20_subOperation {

	public static void main(String[] args) {
		// 대입 연산자
		int a = 10;
		System.out.println(a);
		// 1씩 증가, 감소하는 연산 ==> 증감연산 (++,--) --> 변수 앞에쓰느냐 뒤에쓰느냐에따라 처리 순서가 달라지니 유의할것.
		// 왼쪽에 대입연산자있는지에 따라도 처리순서가 달라지니 유의할것.
		a = a + 1;
		System.out.println(a);
		a++; // 1을 증가 후위연산 // = a = a+1
		System.out.println(a);
		++a; // 1을 증가 전위연산
		System.out.println(a);

		a = a - 1;
		System.out.println(a);
		--a; // 1씩 감소 //왼쪽에 대입연산자가 없음. 그냥 숫자만 추가됨.
		System.out.println(a);
		a--; // 10 출력
		System.out.println(a);
		int b = a++; // (중요)10이 출력되는 이유 --(후위연산자+대입연산자) a변수에 저장된 값을 먼저 b변수에 저장하고!!!!! a를 증가시킨다.
						// 위랑 다르게 왼쪽에 대입하는 변수가 있기 때문에 먼저저장후 a를 증가/ 즉 왼쪽에서 오른쪽 순서로
		System.out.println(b);
		System.out.println(a); // 11이 출력됨.

		int c = 10;
		int d = c++; // (후위 연산자)c를 d에 대입하고나서 c값에 1을 증가시켜라.
		System.out.println(d);
		System.out.println(c);
		int e = ++c; // (전위연산자) so 1증가한 값을 c에 저장한 후 e에 대입저장한다.
		System.out.println(e);
		System.out.println(c);

		int k = 10;
		int s = 20;
		// k = k + s; //줄이면 아래와 같다.
		k += s;
		System.out.println(k);
		// k = k - s;
		k -= s;
		System.out.println(k);
		// k = k * s;
		k *= s;
		System.out.println(k);
		// k = k / s;
		k /= s;
		System.out.println(k);
		// k = k%s;
		k %= s;
		System.out.println(k); // 20나누기 10 나눌수 없으니 걍 10이 저장됨.

		// 연산자 우선순위
		// () > 산술연산(*/, +-) > 관계연산(왼쪽부터) > 논리연산(not > and > or 순서로)

	}
}

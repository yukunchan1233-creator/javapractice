package basic;

public class Basic16_bit_operation {

	public static void main(String[] args) {
		/*   비트(bit : 0 또는 1) 연산자
		      ~ : (not) = 1을 0으로, 0을 1로 바꾼다 ---논리기호랑 같음.
		 */
		System.out.println("~ 10 : " +(~10)); 
		/*ㄴ -11출력되는 이유 ~ 10은 32비트 00000....1010 -->  00000...0101
		 * 부호비트 공부하기.
		 * &(and)  |(or)   ^(xor)   <<(왼쪽이동)  >>(오른쪽이동)
		 */
	}
}

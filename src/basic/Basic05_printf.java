package basic;

public class Basic05_printf {

	public static void main(String[] args) {
		//한줄 주석처리
		/* 여러줄 주석처리
		 * 형식을 지정하여 출력하는 메서드는? printf()
		 * System.out.printf("서식지정자", 출력값)  , 출력값을 서식(형식)을 지정하는대로 출력하시오.
		 */
		
		System.out.printf("국어 : %-10d",95); // %d 10진수 형식 , 95라는 10진수를 쌍따옴표안에 서식에 맞춰서(10진수 형식으로) 출력하시오.
											// -10 : 95________ 나머지 8자리는 공백.
		System.out.println();
		System.out.printf("영어 : %10d\n",100); // 10 : _______100출력하고자하는 자리수가 10자리 앞에 7자리는 공백이고 뒤에 3자리에 숫자채우기.
											 
											 // 숫자는 기본적으로 뒤에서부터 앞으로 출력함.
											 // - 는 앞에서 부터 출력 / 안붙이면 + 뒤에서부터 출력.
											 // 10은 출력하는 자리수.
											 // 형식을 지정하는 것이니까 printf 임.
		System.out.printf("수학 : %10d\n", 50);  // 줄변경 제어문자, 이스케이프문자 : \n
											  // sysout println으로 줄변경도 가능.
		
		
		// %d : 정수 /  %f : 실수  /  %o : 8진수  /  %x : 16진수 / %b : boolean (true, false)    ----각각 영어 앞글자임.
		// 암호화처리(무작위 인증번호)할때 필요. 인증번호 입력하시오 무작위 6개 / 이메일 16진수(Hex)라서 알파벳도 섞여서 인증메일 날라옴. 그럴때 사용하는 것.
		//10진수 Decimal digits   8진수 an octal number  16진수 hexadecimal number
		//10진수 0~9로 표시 . 8진수는 0~7 10 11 ...17 20 21
		//16진수 0~9 ABCDEF  ..A10 BCDEF(15)
		// 위에거 나열된거 외울필요 있음. 자격증시험에 나오니 외워야 함
		
		System.out.printf("float : %3.2f\n", 99.99999);  // &f 는6자리로 출력됨.2개만 원하면 3.2를 입력(정수3자리,소주점이하2째자리)--반올림됨.
		System.out.printf("Octal : %o\n", 99); //99를 8진수로 표현해라
		System.out.printf("Hex : %x\n", 15);  // f가 출력됨.
		System.out.printf("Boolean : %b\n",15);
		System.out.println("2진수 1111 은 10진수로 "+0b1111);  // 0b : 2진수기호 //여기서 +는 문자열결합임. 문자열 이어쓰기 숫자.
		System.out.println("16진수 0xA를 10진수로 출력하면 "+0xA); // 0x : 16진수 기호.
		//위 타이틀 더블클릭하면 확대
	}
}

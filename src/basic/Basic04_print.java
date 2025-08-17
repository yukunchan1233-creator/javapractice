package basic;

public class Basic04_print {

	public static void main(String[] args) {
		System.out.println("\t\t\t성적표");
		System.out.println("-----------------------------------------------------------");
		//sysout ctrl spacebar = system.out.prinln 단축키
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("-----------------------------------------------------------");
		//매소드 안에 tab = \t  ,  \t\t
		//커서 두고 art 위/아래  = 줄바꿈
		//커서 두고 art+ctrl 위/아래 = 복사
		System.out.print("1101\t"); // 숫자에서 문자열로 만들어버림.
		System.out.print("홍길동\t");
		System.out.print(100+"\t");  //"\t" 
									// 숫자와 문자열을 연산할 수 없다. 문자열 결합--100+하고 \t를 출력하라는 뜻
									// 여기서 +는 이어서 제어문자를 실행하시오라는 뜻임.
		System.out.print(100+"\t");
		System.out.print(100+"\t");
		System.out.print(100+100+100+"\t");
		System.out.print((100+100+100)/3+"\t");
		
	}
}
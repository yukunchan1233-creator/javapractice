package basic;

public class Basic28_switch {

	public static void main(String[] args) {
		// switch-case 문 == 조건에 따라 특정 실행문을 실행하라.
		// 여러개의 조건중 하나를 선택하여 실행 할 수 있도록 하는 제어문
		// 변수의 값에 따라서 실행문이 결정되기 때문에 if문 보다는 간결해 진다.

		char grade = 'A';
		switch (grade) { // 괄호안 = 조건식 은 정수, 문자, 문자열, 수식이 가능하고 실수는 사용불가. grade에 저장된 조건식에 따라
		case 'A':
			// grade 조건식에 저장된 값이A와 같은가요? 같으면 아래 실행시킨다.
			// 같지 않으면 다음 case조건문을 처리한다.
			System.out.println("우수한 학생 이구만");
			break; // 다음 case문을 실행 안하고 switch-case문을 빠져나간다.
		// break가 없으면 다음case를 실행한다. 다음case가 거짓이라도 실행시켜버림!!!!!!!!!!!!!!!!!!!!so break가
		// 있어야함. -- 블록빠져나가지 않고 F인지 또물어봄.거짓이라도 노력요함
		case 'F':
			System.out.println("노력요함");
			break; // 얘가 없어야 default가 실행됨. break가 있으니 default가 실행될리 없음.
		default: // 모든 case문을 만족하지 않을 때 실행한다.
			System.out.println("재시험");
		}
		System.out.println("프로그램 종료");

		// break 없애가면서 프로그램 실행해보기.

		// static == 객체생성없이 메모리에 업로드 가능(제품화한다는것.)

//		char grade = 'A';
//		switch (grade) { // 괄호안 = 조건식 은 정수, 문자, 문자열, 수식이 가능하고 실수는 사용불가. grade에 저장된 조건식에 따라
//		case 'A':
//			// grade 조건식에 저장된 값이A와 같은가요? 같으면 아래 실행시킨다.
//			// 같지 않으면 다음 case조건문을 처리한다.
//			System.out.println("우수한 학생 이구만");
//			 // 다음 case문을 실행 안하고 switch-case문을 빠져나간다.
//		// break가 없으면 다음case를 실행한다. 다음case가 거짓이라도 실행시켜버림!!!!!!!!!!!!!!!!!!!!so break가
//		// 있어야함. -- 블록빠져나가지 않고 F인지 또물어봄.거짓이라도 노력요함
//		case 'F':
//			System.out.println("노력요함");
//			 // 얘가 없어야 default가 실행됨. break가 있으니 default가 실행될리 없음.
//		default: // 모든 case문을 만족하지 않을 때 실행한다.
//			System.out.println("재시험");
//		}
//		System.out.println("프로그램 종료");
	}

}

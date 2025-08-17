package basic;

public class Basic28_switch {

	public static void main(String[] args) {
		// switch-case 문 == 조건에 따라 특정 실행문을 실행하라.
		// 여러개의 조건중 하나를 선택하여 실행 할 수 있도록 하는 제어문
		// 변수의 값에 따라서 실행문이 결정되기 때문에 if문 보다는 간결해 진다.

		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("우수한 학생 이구만");
			break;
		case 'F':
			System.out.println("노력요함");
			break;

		}

	}

}

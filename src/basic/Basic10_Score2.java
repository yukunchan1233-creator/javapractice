package basic;

import java.util.Scanner;

public class Basic10_Score2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력받기전에 생성할 필요는 입지만 변수선언 전후에 해도 됨.,   next변수위에만 나오면 됨.
		
		int bno = sc.nextInt();
		String name= sc.next();
		int kor=  sc.nextInt();
		int eng= sc.nextInt();
		int mat= sc.nextInt();
		int tot = kor+eng+mat;
		
		double ave= tot/3;
		
		
		
		
		System.out.println("\t"+"\t"+"성적표");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(bno+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave);
		
	}

}

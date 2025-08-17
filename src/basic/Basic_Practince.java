package basic;

import java.util.Scanner;

public class Basic_Practince {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생정보 : ");
		
		int bno = sc.nextInt();
		String name = sc.next();
		int korScore = sc.nextInt();
		int engScore = sc.nextInt();
		int matScore = sc.nextInt();
		int totScore = korScore + engScore+ matScore;
		float avgScore = totScore/3f ; 
		
		System.out.println("학번 : "+bno);
		System.out.println("이름 : "+name);
		System.out.println("영어 : "+engScore);
		System.out.println("수학 : "+matScore);
		System.out.println("총점 : "+totScore);
		System.out.println("평균 : "+avgScore);
		String grade = (avgScore>=80)?"합격":"불합격";
	
		
		System.out.println("합격여부 : "+grade);
		}	

}

package basic;

import java.util.Scanner;

public class Basic10_Score {

    public static void main(String[] args) {

        System.out.println("\t\t\t성적표\t\t\t");
        System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
        

        Scanner sc = new Scanner(System.in);

        System.out.print("number: ");
        int number = sc.nextInt();

        System.out.print("name: ");
        String name = sc.next();

        System.out.print("kor: ");
        int kor = sc.nextInt();

        System.out.print("eng: ");
        int eng = sc.nextInt();

        System.out.print("mat: ");
        int mat = sc.nextInt();

        int tot = kor + eng + mat;
        double avg = tot / 3.0;

        System.out.println("총점은"+tot+"입니다");
        System.out.println("평균은"+avg+"입니다");
   }

}

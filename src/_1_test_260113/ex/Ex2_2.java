package _1_test_260113.ex;

import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
//        정수 두 개를 입력받아 합과 평균 출력
//        정수1 (숫자,int):
//        정수2 (숫자,int):
//        출력 :
//        합: [] ,
//        평균 []

        // 스캐너 도구 정의
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        System.out.println("정수 1 : ");
        //스캐너 받기
        int a = scanner.nextInt();

        // 입력받기
        System.out.println("정수 2 : ");
        //스캐너 받기
        int b = scanner.nextInt();

        // 출력하기
        System.out.println("===============================");
        System.out.println("합 : " + (a+b));
        System.out.println("평균 : " + (a+b) / 2);
        System.out.println("===============================");

        // 자원반납
        scanner.close();

    }
}

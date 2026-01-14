package _1_test_260113;

import java.util.Scanner;

public class _5_Test_Operator_Ex {
    public static void main(String[] args) {
        // 정수 2개 입력 받아서, 몫과 나머지를 출력

        // 스캐너 도구 이용.
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        System.out.println("정수 1 : ");
        //스캐너 받기
        int a = scanner.nextInt();

        // 입력받기
        System.out.println("정수 2 : ");
        //스캐너 받기
        int b = scanner.nextInt();


        // 출력하기.
        System.out.println("===============================");
        System.out.println("몫(/) : " + (a/b));
        System.out.println("나머지(%) : " + (a%b));
        System.out.println("===============================");

        // 자원반납
        scanner.close();

    }
}

package _1_test_260113;

import java.util.Scanner;

public class _4_Test_Scanner_Ex2 {
    public static void main(String[] args) {
        // 스캐너를 사용하는 도구를 한 줄 문장으로 통으로 기억.
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. 이름 입력 : "); // 콘솔에 이름 입력 대기.
        // 이름 입력 후, 엔터 치는 순간
        // 이름 입력
        // next(), 이름 입력 내용만 가져오고, enter 남겨둠.
        String name = scanner.next();

        // 나이 입력
        System.out.println("2. 나이 입력 : "); // 콘솔에 이름 입력 대기.
        int age = scanner.nextInt();

        // 출력 해보기.
        System.out.println("이름 : " + name + ", 나이는 : " + age);

        // 자원반납
        scanner.close();
    }
}

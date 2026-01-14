package _1_test_260113.ex;

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
//        char 타입(하나의 문자만 의미)으로 성별 입력 받고 출력
//        ex) char gender =
//                성별(M/F) :
//        출력 :
//        입력한 성별은: M

        // 스캐너 도구 사용하기.
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        System.out.println("성별(M/F) :");

        // 스캐너 이용해서 가져오기
        // next() 한단어를 가져오기 : car
        // charAt(0) : c
        char gender = scanner.next().charAt(0);

        // 출력하기.
        System.out.println("입력한 성별 : " + gender);

        // 자원반납
        scanner.close();
    }
}

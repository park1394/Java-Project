package _1_test_260113.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
//        1)
//        사용자 나이를 입력받아 성인 여부 판별 (19세 이상이면 true)
//        입력 : 나이 입력:
//        출력 :
//        성인입니까? true/false

        // 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);
        // 입력 받기
        System.out.println("나이를 입력해주세요 : ");
        // 스캐너 이용해서 가져오기
        int age = scanner.nextInt();

        // 출력하기.
        System.out.println("성인입니까? " + (age >= 19));

        // 자원 반납하기.
//        scanner.close();

//=================================================
//        삼항 연산자 이용, (조건식) ? 참 : 거짓
//        점수가 60점 이상이면 "합격" 아니면 "불합격"
//        입력 : 점수 입력:
//        출력 :
//        합격/불합격 입니다.
        // 스캐너 도구 이용
        // Scanner scanner2 = new Scanner(System.in);
        // 오류 발생, 기존 스캐너 재사용함.
        // 입력 받기
        System.out.println("점수를 입력해주세요 : ");
        // 스캐너 이용해서 가져오기
        int score = scanner.nextInt();
        // 출력하기.
        System.out.println((score >= 60) ? "합격입니다." : "불합격입니다.");
        // 자원 반납하기.
        scanner.close();
    }
}

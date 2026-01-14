package _1_test_260113;

import java.util.Scanner;

public class _3_Test_Scanner_Ex {
    public static void main(String[] args) {
        // 기본 예시
        int count = 100;

        // Scanner 클래스를 이용해서, 반지름 입력 받기.
        // 인스턴스 선언하는 형식은 , 통으로 사용하기.
        Scanner scanner = new Scanner(System.in);
        System.out.println("반지름 입력: "); // 콘솔에서, 숫자를 입력 받는 상태로 대기
        // 큰 정수를 받기. 받기 위한 데이터 타입 필요함.
        double radius = scanner.nextDouble();
        // 원 반지름 구해보기.
        System.out.println("원의 넓이 : " + (3.14 * radius * radius));

        // 버퍼의 내용 비우기.
        scanner.nextLine();

        // 문자열 입력 받아서 출력 해보기.
        System.out.println("============================");
        System.out.println("Scanner 로 문자열 입력 받기");
        System.out.println("이름 입력: ");// 콘솔에서, 이름을 입력 받는 상태로 대기
        // 스캐너가 읽은 문자열을 담기 위해서, 변수를 선언함.
        String name = scanner.nextLine();
        System.out.println("당신의 이름은 : " + name + "입니다.~~");

        // 자원 반납,
        scanner.close();


    }
}

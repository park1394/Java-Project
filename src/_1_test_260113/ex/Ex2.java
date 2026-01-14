package _1_test_260113.ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        1)
//        오늘 저녁 먹고 싶은 메뉴(문자열)?(변수명: dinnerMenu)
//        어디서 먹을까요(문자열)? (변수명: dinnerLoc)
//        저녁 가격은 얼마 예상하나요(숫자로만)? (변수명: dinnerPri)
//        출력 :
//        오늘은 [먹고싶은 메뉴 이름][ 어디서 먹을지] 예상가격: [가격] 원입니다.

        // 스캐너 도구 사용하기.
        Scanner scanner = new Scanner(System.in);

        // 입력 받기.
        //오늘 저녁 먹고 싶은 메뉴(문자열)?(변수명: dinnerMenu)
        System.out.println("오늘 저녁 먹고 싶은 메뉴?");
        // 스캐너로 가져오기
        String dinnerMenu = scanner.nextLine();

        //어디서 먹을까요(문자열)? (변수명: dinnerLoc)
        System.out.println("어디서 먹을까요?");
        // 스캐너로 가져오기
        String dinnerLoc = scanner.nextLine();

        //저녁 가격은 얼마 예상하나요(숫자로만)? (변수명: dinnerPri)
        System.out.println("저녁 가격은 얼마 예상하나요?");
        // 스캐너로 가져오기
        int dinnerPri = scanner.nextInt();

        // 출력 하기.
        System.out.println("오늘은 ["+ dinnerMenu +"][" + dinnerLoc +"][" + dinnerPri + "] 원입니다." );

        // 자원반납
        scanner.close();
    }
}

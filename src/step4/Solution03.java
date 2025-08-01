package step4;

import java.util.Scanner;

public class Solution03 {
    // 반복문 (for, while)
    public static void main(String[] args) {
        // while
        // () -> 특정한 조건이 false가 될 때까지 반복
        // true인 동안... 계속 반복
//        boolean condition = true;
//        while (condition) {
//            System.out.println("반복중입니다");
//            condition = false; // 종료
//        }
//        System.out.println("반복이 완료 되었습니다");
        // 반복이 '회수'가 정해지지 않을 때 쓴다 (횟수가 정해져있을 때 쓰는게 따로 있어요?)
        // 반복의 종료가 '내부 로직'과 관련이 있다 -> while
        // 반복의 종료가 외부의 조건과 증감과 관련이 있다 -> for
        String answer = "";
        Scanner sc = new Scanner(System.in);
//        while (!answer.equals("비밀")) {
//            System.out.print("secret의 뜻이 뭐야? : ");
//            answer = sc.nextLine();
//        }
        // while 1: -> truthy한 값. (true로 판정되는 값) -> java는 무조건 true?
        // for (;;) {}
        while (true) { // true면 반복한다면서?
            System.out.print("secret의 뜻이 뭐야? : ");
            answer = sc.nextLine();
            if (answer.equals("비밀")) {
                break; // 반복을 멈춘다
            }
        }
        System.out.println("맞췄어!");
    }
}

package step5;

import java.util.Scanner;

public class GeminiChatVer2 {
    public static void main(String[] args) {
        // 반복문, 조건문?
        Scanner sc = new Scanner(System.in); // 반복문 내부에서 계속 사용해줄 scanner 초기화
        while (true) {
            // 계속 반복
            System.out.print("원하시는 명령을 입력해주세요. (시작, 종료) : ");
            String cmd = sc.nextLine();
            if (cmd.equals("시작")) {
                System.out.println("게임 시작");
            } else if (cmd.equals("종료")) {
                System.out.println("게임 종료");
                break; // switch를 썼을 때는 switch 내부에 break가 있어서;;;;
            } else {
                System.out.println("잘못된 입력");
                continue;
            }
            System.out.println("스무고개를 시작합니다!");
            break;
        }
    }
}

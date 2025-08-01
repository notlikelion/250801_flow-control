package step3;

import java.util.Scanner;

public class Solution01 {
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 발사이즈는 몇입니까? (mm) : ");
        // 한글로 대략 적고 -> 우클릭 -> 번역 및 교체
        int footSize = sc.nextInt(); // 숫자로 변환된 값 -> int -> footSize
        // footSize는 이제 다시 '선언'
//        System.out.println("당신의 발사이즈는 " + footSize + "입니다.");
        System.out.println("당신의 발사이즈는 %d mm 입니다.".formatted(footSize));
    }
}

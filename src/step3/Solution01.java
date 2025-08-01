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
        // 200mm 넘는 신발 x. 300mm 넘는 신발도 x.
        if (footSize < 200) { // < 미만, > 초과, <= 이하, >= 이상.
            System.out.println("200mm 미만입니다");
        } // (조건) { 조건을 만족시켰을 때 실행될 코드(구문) }
        if (footSize > 300) {
            System.out.println("300mm 초과입니다");
        }

    }
}

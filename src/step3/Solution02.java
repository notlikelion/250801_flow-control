package step3;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        // switch
        Scanner sc = new Scanner(System.in);

        // if 문으로 구현
        // size. S. M. L
        System.out.print("사이즈가 어떻게 되세요? (S, M, L) : ");
        String size = sc.nextLine(); // new String으로 새로 만들어진 값이라...
//        if (size == "S") {
        if (size.equals("S")) {
            System.out.println("사이즈가 작은 편이시네요.");
//        } else if (size == "M") {
        } else if (size.equals("M")) {
            System.out.println("사이즈가 덜 작은 편이시네요.");
//        } else if (size == "L") {
        } else if (size.equals("L")) {
            System.out.println("사이즈가 덜덜 작은 편이시네요.");
        } else {
            System.out.println("그런 사이즈 없습니다.");
        }

    }
}

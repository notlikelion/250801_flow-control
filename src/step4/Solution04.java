package step4;

// for문, Array.
public class Solution04 {
    public static void main(String[] args) {
        // for (초기식; 조건식; 증감식) { 반복할 코드 }
        // 조건식이 true인 동안에 작동 (예도 여전히 true일 때 작동)
        // i = index? iteration? integer?
        // 중첩 for문에서는 j를 쓰잖아? i 다음이라서?
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        // 초기식, 조건식, 증감식(변화식)
        // 초기식
//        int w = 0;
//        while (w < 10) { // 조건식
//            // 변화식
//            System.out.println(w++);
////            w++;
//        }

        // 이런 접근도 가능하다
//        for (String s = ""; !s.equals("11111"); s += "1") {
//            System.out.println(s);
//        }

        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += i + 1; // 연산자에선 사칙연산자가 대입연산자보다 우선권을 가짐
//        }
//        for (int i = 1; i < 11; i++) {
//            sum += i;
//        }
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
        int i = 0;
//        for (;;) {
//            sum += i;
//            i++;
//            if (i < 10) {
//                continue;
//            } else {
//                break;
//            }
//        }
        while (true) {
            sum += i;
            i++;
            if (i <= 10) {
                continue;
            } else {
                break;
            }
        }
        System.out.println(sum); // 55
    }
}

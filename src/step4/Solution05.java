package step4;

import java.sql.Array;
import java.util.Arrays;

public class Solution05 {
    // Array(배열)
    public static void main(String[] args) {
        // 배열 (Array) <-> 리스트(List)
        // -> ArrayList 함께하자(?)
        // 심지어 옆동네는 Array 인데 Array가 아닌 친구. (JS)
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        // 같은 타입이고, 값이 묶여있는 것 같음.
        // ASCII 코드.
        int[] arr; // 선언
        arr = new int[10]; // 할당 // 자리가 몇개인지
        int[] arr2 = new int[10]; // 초기화
        int arr3[] = new int[10]; // 초기화
        // 배열을 보는 순간 본인의 학부시절 소환되면서... 포인터 (&*) 생각난다...
        // 자바는 포인터가 없다 🤣 (다행일까?)
        System.out.println(arr); // ...? // 객체 타입. -> 주소
        // 이 자체는 복잡한 구조이기 때문에 이 안에 이 데이터를 저장한 메모리상의 '주소'가 담겨있음
        System.out.println(Arrays.toString(arr));
        // 이중 배열(?)
    }
}

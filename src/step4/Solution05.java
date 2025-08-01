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

        // 배열 (Array)
        // 1. 길이가 정해져 있다 !
        // 2. 들어가 있는 데이터 타입 모두 동일하다 ! (앞에서 만들때부터 지정하고 간다)
        // 3. 인덱스(호출하기 위한 호출용 숫자)가 존재한다 (대부분 0에서부터 시작한다)
        // -> 길이가 정해져있고, 들어가있는 타입이 모두 동일 -> 메모리 최적화
        // -> 호출, 값 변경을 위한 속도가 빠른 편이다
        // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} 10개 자리
        // int, double, boolean -> 0, false로 기본값이 찹니다
        // String -> null -> 기본값이 참
        arr[1] = 100;
        // {0, 100, 0, 0, 0, 0, 0, 0, 0, 0}
        System.out.println(Arrays.toString(arr));
        // [index] -> 0부터 시작. 맨 앞이 0에요.
        // 맨 끝? -> 전체 길이의 -1.
//        arr[10] = 100;
//        System.out.println(Arrays.toString(arr)); // 10은 없음. 9까지 없음.
//        arr[-1] = 100; // 파이썬 only
//        arr[-1] -> arr[길이-1] -> 길이 값?
        arr[arr.length - 1] = 100; // 맨끝에서 -1 왜? -> 0 때문에.
        System.out.println(Arrays.toString(arr));
        int[] arr4 = new int[10]; // 10개가 있으면... 10개를 다 인덱스로 할당야해?
        // arr4[0] = 1;
        // arr4[1] = 2; ...?
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 한 번에 초기화할 수 있는 문법
        // 주의할 점 : {}다. 왜? 이걸 주의하라고 하죠? 파이썬과 자바스크립트는 이와 유사한 리스트, 자바스크립트 배열을 초기화할 때 []로 한다.
        System.out.println(Arrays.toString(arr5));

        String[] arr6 = new String[10]; // ""?
        System.out.println(Arrays.toString(arr6)); // null... null...
        arr6[0] = "안녕하세요!";
        System.out.println(Arrays.toString(arr6));

        int[][] dbArr = new int[10][10];
        System.out.println(dbArr);
        System.out.println(Arrays.toString(dbArr)); // 주소값 묶음.
        dbArr[5][5] = 100; // 0의 존재 때문에... 카운트하는 것 자체가...
        System.out.println(Arrays.deepToString(dbArr));
        // [[0, 0, 0 ...], [0, 0, 0 ...], ..., [0, 0, 0 ...]]

        // 타입[] 변수명 = new 타입[자리수]; -> 만들거나...
        // 타입[] 변수명 = {...} <- 초기화할 값들을 나열...
        // index로 호출하거나, 할당하거나 할 수 있는데 index는 0 ~ 길이-1
        // 배열의 길이는 배열명.length로 조회 가능
        // 배열 자체는 일종의 객체(메모리 주소)라서 출력하면 주소 나옴
        // -> Arrays.toString() ... -> 이중배열 이상 -> Arrays.deepToString을 써야한다
    }
}

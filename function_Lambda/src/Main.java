// 일반적인 interface

//interface Calcilator {
//    int sum(int a, int b);
//}
//
//class MyCalculator implements Calcilator {
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}
//
//public class Main {
//    public  static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(3,4);
//        System.out.println(result);
//    }
//}

// 람다를 적용한 코드
//interface Calculator {
//    int sum(int a, int b);
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Calculator mc = (a, b) -> a + b; // 람다를 적용한 코드 부분
//
//        int result = mc.sum(3, 4);
//        System.out.println(result);
//    }
//}

//@FunctionalInterface
//interface Calculator {
//    int sum(int a, int b);
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Calculator mc = Integer::sum;
//        int result = mc.sum(3, 4);
//        System.out.println(result);
//    }
//}

//짝수만 뽑아 중복을 제거한 후에 역순으로 정렬하는 프로그램

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)
                .boxed()
                .filter((a) -> a % 2 == 0)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}
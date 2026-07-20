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

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
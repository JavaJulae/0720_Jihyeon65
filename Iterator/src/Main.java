import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("강아지", "고양이", "사자"));
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String language = iter.next();
            System.out.print(language + " ");

            // 특정 조건일 때 해당 요소를 삭제함.
            if (language.equals("사자")) {
                iter.remove();
            }
        }
        System.out.println("\n삭제 후 List: " + list);
    }
}
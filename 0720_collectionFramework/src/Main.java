import java.util.*;
public class Main {
    public static void main(String[] args){
        // list
        List<String> list = new ArrayList<>(Arrays.asList("강아지", "고양이", "사자"));
        System.out.println("List: " + list);

        // Set
        Set<String> set = new HashSet<>(Arrays.asList("강아지", "고양이", "사자"));
        System.out.println("Set: " + set);

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("강아지", 3);
        map.put("고양이", 5);
        System.out.println("강아지의 몸무게: " + map.get("강아지") + "Kg");
    }
}

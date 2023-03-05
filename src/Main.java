import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        List<String> text = new ArrayList<>(List.of("a", "S", "d", "a", "S", "a", "o"));
        task3(text);
        task4(text);
    }

    public static void task1(List<Integer> nums){
        System.out.println("Задача 1");
        for(Integer iter: nums){
            if(isEven(iter)){
                System.out.println(iter);
            }
        }
    }

    public static boolean isEven(Integer num){
        return num % 2 != 0;
    }

    public static void task2(List<Integer> nums){
        System.out.println("Задача 2");
        Collections.sort(nums);
        Set<Integer> set = new HashSet<>(nums);
        for(Integer iter: set){
            if(!isEven(iter)){
                System.out.println(iter);
            }
        }
    }

    public static void task3(List<String> text){
        System.out.println("Задача 3");
        System.out.println(new HashSet<String>(text));
    }

    public static void task4(List<String> text){
        System.out.println("Задача 4");
        Map<String, Integer> countRepeatString = new HashMap<>();
        for(String iter : text){
            if (countRepeatString.get(iter) == null) {
                countRepeatString.put(iter, 1);
            } else {
                countRepeatString.put(iter, countRepeatString.get(iter) + 1);
            }
        }
        System.out.println(countRepeatString);
    }
}
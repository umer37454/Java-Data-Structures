package Java.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 7, 6 ,2);

        // without lambda
        // Consumer consume = new Consumer() {
        //  @Override
        // public void accept(Object o) {
        // System.out.println(o);
        // }
        // };

        // lambda
        // Consumer consume = (Object o) -> {
        //        System.out.println(o);
        // };

        // for each - with method reference.
        nums.forEach(System.out::println);
        Stream<Integer> stream = nums.stream();


    }
}

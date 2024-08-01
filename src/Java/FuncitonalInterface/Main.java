package Java.FuncitonalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // Supplier
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());

        // Consumer
        Consumer<Integer> display = new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println(o);
            }
        };

        display.accept(8);

        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i * 2);
            }
        };

        Consumer<List<String>> displayIndex = list -> {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Index of + " + list.get(i) + " - "  + (i + 1));
            }
        };

        List<Integer> intList = Arrays.asList(4, 5, 9, 3, 4);
        List<String> stringList = Arrays.asList("John", "Doe", "Antony", "Enzo");

        modify.accept(intList);
        displayIndex.accept(stringList);

        // Function
        Function<String, Integer> lengthOfString = new Function<String, Integer>() {
            @Override
            public Integer apply(String o) {
                return o.length();
            }
        };

        System.out.println("Double Length of given sentence " + lengthOfString.apply("This function will give length of this sentence"));

        // function - and then.
        Function<String, Integer> functionAndThen = String::length;
        Function<Integer, Integer> functionAndThenDo = i -> i * 2;

        Function<String, Integer> composeTwoFunction = functionAndThen.andThen(functionAndThenDo);

        int demo = composeTwoFunction.apply("And then will double this sentence length");

        System.out.println("Compose two function result " + demo);

        // Predicate
        Predicate<Integer> isOdd = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer / 2 != 0;
            }
        };

        Predicate<Integer> isEven = i -> i / 2 == 0;

        Predicate<Integer> combineAndPredicate = isOdd.and(isEven);
        Predicate<Integer> combineOrPredicate = isOdd.or(isEven);

        Predicate<Integer> negateIsEven = isOdd.negate();

        System.out.println("Is Odd 5: " + isOdd.test(5));
        System.out.println("Is Even 6: " + isEven.test(6));
        System.out.println("Combine And Predicate: " + combineAndPredicate.test(4));
        System.out.println("Combine Or Predicate: " + combineOrPredicate.test(4));
        System.out.println("Negate Is Even Predicate 4: " + negateIsEven.test(4));

        // Comparator - with anonymous class
        Comparator<Integer> maxComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        // Binary Operator
        BinaryOperator<Integer> add = Integer::sum;
        System.out.println(add.apply(5,9));

        // BinaryOperator<Integer> max = BinaryOperator.maxBy((x, y) -> Integer.compare(x, y)); -- With lambda expression
        BinaryOperator<Integer> max = BinaryOperator.maxBy(Comparator.comparingInt(x -> x));

        System.out.println("Max between these two 7, 9 is: " + max.apply(9, 7));
    }
}
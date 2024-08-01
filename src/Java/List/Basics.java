package Java.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        String[] subjects = {"Algebra", "Thermodynamics", "Geometry", "Science"};

        List<String> subjectList = new ArrayList<>();

        List<String> subjectsList = new ArrayList<>();
        subjectList.add("Data Structure");
        subjectsList.add("Operating System");
        subjectsList.add("Networking");

        Collections.addAll(subjectList, subjects);
        Collections.addAll(subjectsList, "Database");

        System.out.println("Subject List" + subjectList);
        System.out.println("Computer Subject List " + subjectsList);

        subjectsList.remove(1);
        System.out.println("After removing index 1 in subjectsList " + subjectsList);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 7, 6, 3));
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(5));
        numbers.remove(3);
        System.out.println("After Removal " + numbers);

        numbers.addAll(List.of(9, 7, 6, 14)); // List.of like Arrays.asList is immutable
        System.out.println("After Adding it" + numbers);
    }
}

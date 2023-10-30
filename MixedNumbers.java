import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MixedNumbers {

    public static void main(String[] args) {

        // Create a new ArrayList of mixed integer numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(4);
        numbers.add(81);
        numbers.add(16);
        numbers.add(64);

        // Without Stream
        System.out.println("Without Stream:");
        withoutStream(numbers);

        System.out.println("\nWith Stream:");
        withStream(numbers);

    }

    public static void withoutStream(List<Integer> numbers) {

        // Sort the ArrayList numbers
        Collections.sort(numbers);

        for (int num : numbers) {
            double sqrt = Math.sqrt(num);

            // Check if square root is an even number
            if (sqrt % 2 == 0) {
                //print if even number
                System.out.println(sqrt);
            }
        }
    }

    public static void withStream(List<Integer> numbers) {

        numbers.stream()
                .sorted() //Sort the ArrayList numbers
                .map(Math::sqrt) // Find the square root of each number
                .filter(sqrt -> sqrt % 2 == 0) // choose only the even square root numbers
                .forEach(System.out::println); // print the even numbers only 
    }
}

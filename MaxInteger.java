import java.util.*;

public class MaxInteger {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 25, 5, 40, 15);

        // Finding maximum using stream
        Optional<Integer> max = list.stream()
                                    .max(Integer::compare);

        // Printing result
        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}


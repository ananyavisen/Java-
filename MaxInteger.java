import java.util.*;

public class MaxInteger {
      public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 25, 5, 40, 15);

        if (list.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            int max = list.stream()
                          .max(Integer::compare)
                          .get(); 

            System.out.println("Maximum value: " + max);
        }
    }
}



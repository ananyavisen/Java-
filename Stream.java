import java.util.*;
class StreamCountExample {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList(
            "Apple", "Banana", "Avocado", "Mango", "Ananas", "Guava"
        );

        char ch = 'A';  

        long count = list.stream()
                         .filter(s -> s.startsWith(String.valueOf(ch)))
                         .count();

        System.out.println("Number of strings starting with '" + ch + "': " + count);
    }
}

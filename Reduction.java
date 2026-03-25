import java.util.*;
public class Reduction {
    public static void main(String[] args) {
        String [] arr = {"bill", "bob", "berry" , "tom", "harry" };
        Optional <String> join_string = Arrays.stream(arr)
                                        .reduce((str1, str2)
                                        -> str1 + "#" + str2);
        if(join_string.isPresent()){
            System.out.println(join_string.get());
        }

    }
}

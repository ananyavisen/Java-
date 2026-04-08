import java.util.LinkedHashSet;
public class names {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("raj");
        names.add("veer");
        names.add("naman");
        names.add("veer"); 
        names.add("adi"); 

        System.out.println("Names in the set:"+ names);
        
    }
}

import java.util.TreeSet;

public class addTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(5);
        set1.add(6);
        set1.add(9);

        set1.add(10);
        set1.add(20);
        set1.add(30);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(40);
        set2.add(50);

        set2.addAll(set1);

        System.out.println("Set1: " + set1);
        System.out.println("Set2 after adding elements from Set1: " + set2);
        System.out.println("Numbers less than 7: " + set2.headSet(7));
    }
}

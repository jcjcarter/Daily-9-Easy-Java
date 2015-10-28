import java.util.TreeSet;

public class Main {

    private static TreeSet<Integer> treeSet = new TreeSet();
    private static TreeSet<String> treeSet1 = new TreeSet<>();

    public static void main(String[] args){

        for (int i = 10; i > 0; i--) {
            treeSet.add(i);
        }

        treeSet1.add("one");
        treeSet1.add("two");
        treeSet1.add("three");
        treeSet1.add("four");
        treeSet1.add("fix");

        for (String e : treeSet1){
            System.out.println("Item in treeset: " + e);
        }
    }

}

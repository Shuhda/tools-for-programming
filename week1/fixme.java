import java.util.ArrayList;

public class FixMe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(3);
        list.add(-4);
        list.add(-5);
        list.add(6);

        removeNegatives(list);
        System.out.println(list);
    }

    public static void removeNegatives(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
    }
}

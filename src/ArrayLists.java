import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        new ArrayLists();
    }

    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayLists() {
        System.out.println("welcome to the wonderful world of ArrayLists!");
        list.add(2);
        list.add(27);
        list.add(1,37);
        for (int i = 0; i < 10; i++) {
            list.add(52);
        }

        for (int i = 0; i < 43; i++) {
            int randomNumber = (int) (Math.random() * 75)+7;
            list.add(randomNumber);
        }
        printArrayList();
        System.out.println(average());
    }

    public void printArrayList() {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public double average() {
        double sum = 0;
        for (Integer i : list) {
            sum+=i;
        }

        return sum / list.size();
    }

}

import java.util.ArrayList;

public class ArrayListObjects {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        new ArrayListObjects();
    }

    ArrayList<Shoe> shoes = new ArrayList<Shoe>();

    public ArrayListObjects() {
        System.out.println("making arraylist with objects");

        Shoe puma = new Shoe(11);
        puma.setHasLaces(false);
        shoes.add(puma);
        System.out.println(shoes.size());

        System.out.println(shoes.get(0).getBrand());
    }
}

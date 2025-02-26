public class Shoe {
//    vars: brand, size, has laces
//    todo: make the instance variable private
    private String brand;
    private int size;
    private boolean hasLaces;

    public Shoe(int size) {
        this.brand = "Nike";
        this.size = size;
        this.hasLaces = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasLaces() {
        return hasLaces;
    }

    public void setHasLaces(boolean hasLaces) {
        this.hasLaces = hasLaces;
    }

    public void printInfo() {
        System.out.printf("%s shoes, size %s, %s", brand, size, (hasLaces ? "with laces." : "without laces."));
    }
}

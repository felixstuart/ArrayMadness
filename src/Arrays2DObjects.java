public class Arrays2DObjects {

    Pasta[][] grid = new Pasta[3][4];

    
    public static void main(String[] args) {
        new Arrays2DObjects();
    }

    public Arrays2DObjects() {
        System.out.println("welcome to pasta world!");

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c] = new Pasta("spaghetti", (int) (Math.random()*101), true);
            }
        }

        printArray();
        System.out.println(avgPoundOfPasta());
    }

    public void printArray() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c].printInfo();
            }
        }
    }

    public double avgPoundOfPasta() {
        double sum = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                sum += grid[r][c].getPounds();
            }
        }
        return sum/(grid.length*grid[0].length);
    }
}

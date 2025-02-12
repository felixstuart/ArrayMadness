public class Arrays2D {
    public static void main(String[] args) {
        new Arrays2D();
    }
    int[][] grid = new int[3][4]; // 3 refers to the amount of rows, 4 refers to the amount of columns.

    public Arrays2D() {
        System.out.println("welcome to grid world!");
        System.out.println(grid.length);
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int random = (int) (Math.random()*101);
                grid[r][c] = random;
            }
        }
        printGrid();
        System.out.println(gridAverage());
        System.out.println(gridMax());
    }

    public void printGrid() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.println("("+r+", "+c+"):"+ grid[r][c]);
            }
        }
    }
    public double gridAverage() {
        double sum = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                sum += grid[r][c];
            }
        }
        return sum/(grid.length*grid[0].length);
    }

    public int gridMax() {
        int currentMax = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] > currentMax) {
                    currentMax = grid[r][c];
                }
            }
        }
        return currentMax;
    }

}

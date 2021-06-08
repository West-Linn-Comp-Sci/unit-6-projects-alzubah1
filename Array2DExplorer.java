import java.lang.Math;
public class Array2DExplorer {
    public int minRow(int[][] nums, int row) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < nums[row].length; i++) {
            if (nums[row][i] < minimum) {
                minimum = nums[row][i];
            }
        }
        return minimum;
    }
    public int[] colMaxs(int[][] matrix) {
        int[] maximums = new int[matrix[0].length];
        for (int i = 0; i < maximums.length; i++) {
            maximums[i] = Integer.MIN_VALUE;
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] > maximums[c]) {
                    maximums[c] = matrix[r][c];
                }
            }
        }
        return maximums;
    }
    public int[] allRowSums(int[][] data) {
        int[] allSums = new int[data.length];
        int sum = 0;
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                sum += data[r][c];
            }
            allSums[r] = sum;
            sum = 0;
        }
        return allSums;
    }
    public double[] averageCol(int[][] nums) {
        double[] averages = new double[nums[0].length];
        double sum = 0.0;
        int r = 0;
        for (int c = 0; c < nums[r].length; c++) {
            while (r < nums.length) {
                sum += nums[r][c];
                r++;
            }
            r = 0;
            averages[c] = (sum / nums[r].length);
        }
        return averages;
    }
    public int smallEven(int[][] matrix) {
        int min = Integer.MAX_VALUE - 1;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] % 2 == 0 && matrix[r][c] < min) {
                    min = matrix[r][c];
                }
            }
        }
        return min;
    }
    public static int biggestRow(int[][] nums) {
        int max = Integer.MIN_VALUE;
        int[] allSums = new int[nums.length];
        int sum = 0;
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                sum += nums[r][c];
            }
            allSums[r] = sum;
            sum = 0;
        }
        int maxIndex = -1;
        for (int i = 0; i < allSums.length; i++) {
            if (allSums[i] > max) {
                max = allSums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Array2DExplorer exp = new Array2DExplorer();
        int[][] test = new int[10][10];
        for (int r = 0; r < 10; r++) {
            System.out.print("[ ");
            for (int c = 0; c < 10; c++) {
                test[r][c] = (int)(Math.random() * 100);
                if (test[r][c] < 10) {
                    System.out.print("0");
                }
                System.out.print(test[r][c] + " ");
            }
            System.out.println("]");
        }
        System.out.println("Smallest value in row 3: " + exp.minRow(test, 3));
        System.out.print("Largest value in each column: [");
        for (int i = 0; i < exp.colMaxs(test).length; i++) {
            System.out.print(exp.colMaxs(test)[i] + " ");
        }
        System.out.print("]\nSum of each row: [");
        for (int i = 0; i < exp.allRowSums(test).length; i++) {
            System.out.print(exp.allRowSums(test)[i] + " ");
        }
        System.out.print("]\nAverage of each column: [");
        for (int i = 0; i < exp.averageCol(test).length; i++) {
            System.out.print(exp.averageCol(test)[i] + " ");
        }
        System.out.println("]\nSmallest even number: " + exp.smallEven(test));
        System.out.println("Index of row with largest sum: " + exp.biggestRow(test));
    }
}

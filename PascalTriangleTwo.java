import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleTwo {
    public int[] pascalTriangleII(int r) {
        List<Integer> row = new ArrayList<>();

        int n = r-1;
        long result = 1;

        row.add((int) result);

        for (int i = 1; i < r; i++) {
            result = result * (n - i + 1) / i;
            row.add((int) result); 
        }

        return row.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] actual = new PascalTriangleTwo().pascalTriangleII(5);
        System.out.println(Arrays.toString(actual));
    }
}

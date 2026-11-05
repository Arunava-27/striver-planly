import java.util.ArrayList;
import java.util.List;

public class PascalTriangleThree {
    public List<List<Integer>> pascalTriangleIII(int n) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            long value = 1;

            for (int j = 1; j < i; j++) {
                value = value * (i - j) / j;
                row.add((int) value);
            }
            result.add(row);

        }

        return result;
    }

    public static void main(String[] args) {

    }
}

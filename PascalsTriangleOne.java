public class PascalsTriangleOne {
    public int pascalTriangleI(int r, int c) {
        int n = r-1;
        int k = c-1;

        long result = 1;

        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1)/i;
        }
        return (int) result;
    }
    public static void main(String[] args) {
        PascalsTriangleOne pt = new PascalsTriangleOne();
        int r = 5; // Example row
        int c = 3; // Example column
        System.out.println(pt.pascalTriangleI(r, c));
        
    }
}

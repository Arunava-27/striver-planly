public class RotateMatrixBy90Degrees {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int k = 0; k < n; k++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;

                left++;
                right--;
            }
        }

    }

    public static void main(String[] args) {
        // test
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        new RotateMatrixBy90Degrees().rotateMatrix(matrix);
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}

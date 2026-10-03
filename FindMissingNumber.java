public class FindMissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long expected_sum = (long) n * (n + 1) / 2;
        long actual_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            actual_sum += nums[i];
        }
        return (int) (expected_sum - actual_sum);
    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 4, 5, 6};

        int res = new FindMissingNumber().missingNumber(arr);

        System.out.println(res);
        
    }
}

public class MaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if(maxCount < count){
                    maxCount = count;
                }
            } else {
                count = 0;
            }

        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};
        int res = new MaximumConsecutiveOnes().findMaxConsecutiveOnes(arr);
        System.out.println("Maximum Consecutive Ones : "+res);
    }
}

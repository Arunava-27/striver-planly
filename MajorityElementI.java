public class MajorityElementI {
    public int majorityElementBruteforce(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

                if (count > n/2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};

        int ans = new MajorityElementI().majorityElementBruteforce(nums);
        System.out.println(ans); 
    }
}

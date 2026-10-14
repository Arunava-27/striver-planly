public class MajorityElementI {
    public int majorityElementBruteforce(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

                if (count > n / 2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public int majorityElementBoyerMooreVoting(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 2, 2, 2 };

        int ans = new MajorityElementI().majorityElementBoyerMooreVoting(nums);
        System.out.println(ans);
    }
}

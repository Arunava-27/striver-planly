import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {

    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();

        if (nums.length == 0) {
            return leaders;
        }

        int maxRight = nums[nums.length-1];
        leaders.add(maxRight);

        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] > maxRight) {
                leaders.add(nums[i]);
                maxRight = nums[i];
            }
        }

        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};

        LeadersInAnArray solution = new LeadersInAnArray();
        List<Integer> leaders = solution.leaders(nums);
        System.out.println(leaders);
    }
}

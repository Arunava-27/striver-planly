import java.util.Arrays;

public class LeftRotateArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        if (nums.length == 0) {
            return ;
        }
        int temp = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7};
        LeftRotateArrayByOne lr = new LeftRotateArrayByOne();
        lr.rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}

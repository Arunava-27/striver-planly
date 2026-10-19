import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2;
            } else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -1, -3, -4};
        int[] res = new RearrangeArrayElementsBySign().rearrangeArray(arr);

        System.out.println(Arrays.toString(res));
    }
}

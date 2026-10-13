import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] intersection = new int[result.size()];

        for (int k = 0; k < intersection.length; k++) {
            intersection[k] = result.get(k);
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 5};
        int[] nums2 = {1, 2, 7};
        int[] ans = new IntersectionOfTwoSortedArrays().intersectionArray(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }
}

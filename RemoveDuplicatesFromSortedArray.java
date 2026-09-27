public class RemoveDuplicatesFromSortedArray {
    /**
     * Removes duplicate values from a sorted array in place.
     *
     * @param nums sorted array to update
     * @return the number of unique values; they occupy the first positions of {@code nums}
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;

        // An empty array has no unique values.
        if(nums.length == 0){
            return i;
        }

        // Scan the array and copy each newly encountered value into the unique prefix.
        for(int j = 1; j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        // Example input containing repeated values.
        int[] arr = {0, 0, 3, 3, 5, 6, 6, 7, 7, 8};

        int res = new RemoveDuplicatesFromSortedArray().removeDuplicates(arr);

        // Print the number of unique values.
        System.out.println(res);
    }
}

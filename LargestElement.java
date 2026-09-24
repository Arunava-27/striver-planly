public class LargestElement {
    public int largestElement(int[] nums) {
        int largest = nums[0];

        for(int i = 1; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            } 
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 6, 1};
        int res = new LargestElement().largestElement(arr);
        System.out.println("Largest element in array is : "+res);
    }
}

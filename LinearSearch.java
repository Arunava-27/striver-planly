public class LinearSearch {
    public int searchIndex(int nums[], int target) {
        int index=0;
		for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = new LinearSearch().searchIndex(arr, 30);
        System.out.println("Index of 30: " + index);
    }
}

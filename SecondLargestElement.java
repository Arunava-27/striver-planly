public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 10, 10 };
        int res = new SecondLargestElement().secondLargestElement(arr);
        System.out.println("Second Largest Element in array is : " + res);
    }
}

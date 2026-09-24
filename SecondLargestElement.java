public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int largest = nums[0]; // Initialize largest to the first element of the array
        
        int secondLargest = Integer.MIN_VALUE; // Initialize secondLargest to the smallest possible value

        // Iterate through the array to find the largest and second largest elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) { // Found a new largest element, update secondLargest as well
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) { // Found a new second largest element
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) { // No second largest element found, return -1
            return -1;
        }

        return secondLargest; // Return the second largest element found
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 10, 10 };
        int res = new SecondLargestElement().secondLargestElement(arr);
        System.out.println("Second Largest Element in array is : " + res);
    }
}

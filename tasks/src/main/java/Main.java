import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(runningSum2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(pivotIndex(new int [] {1,7,3,6,5,6}));
    }


    public static int[] runningSum(int[] nums) {
        /*1480. Running Sum of 1d Array
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                result[i] += nums[j];
            }
        }
        return result;
    }

    public static int[] runningSum2(int[] nums) {
        /*1480. Running Sum of 1d Array
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static int pivotIndex(int[] nums) {
        /* 724. Find Pivot Index
        * Given an array of integers nums, calculate the pivot index of this array.

        The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

        If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

        Return the leftmost pivot index. If no such index exists, return -1.
        * */
        int leftSum = 0;
        int sum = 0;
        sum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if(leftSum == sum) return i;
            leftSum +=nums[i];
        }
        return -1;
    }
}

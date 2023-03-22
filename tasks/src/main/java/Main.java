import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }


    public static int[] runningSum(int[] nums) {
        /*1480. Running Sum of 1d Array
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <=i; j++) {
                result[i] += nums[j];
            }
        }
        return  result;
    }
}

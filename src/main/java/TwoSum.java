/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.Arrays;

public class TwoSum {public static void main(String[] args) {
    int[] nums = {3,2,4};
    int target = 6;
    String result = (Arrays.toString(twoSum(nums, target)));
    System.out.println(result);
}

    public static int[] twoSum(int[] num, int target) {
        int low = 0, high = num.length - 1;
        for (int i = low; i <= high; i++) {
            for (int j = (low + 1); j <= high; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
            low++;
        }
        return null;
    }
}
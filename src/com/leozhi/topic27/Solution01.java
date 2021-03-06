package com.leozhi.topic27;

/**
 * @author leozhi
 * 快慢指针
 * 通过
 * 0ms
 */
public class Solution01 {
    public int removeElement(int[] nums, int val) {
        // 快慢双指针
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}

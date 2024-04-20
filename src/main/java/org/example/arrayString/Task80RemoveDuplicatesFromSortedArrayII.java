package org.example.arrayString;

import java.util.Arrays;

public class Task80RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        //int[] nums = {-3,-1,0,0,0,3,3};
        //int[] nums = {0,1,2,2,2,2,2,3,4,4,4};
        int[] nums = {-50,-50,-49,-48,-47,-47,-47,-46,-45,-43,-42,-41,-40,-40,-40,-40,-40,-40,-39,-38,-38,-38,-38,-37,-36,-35,-34,-34,-34,-33,-32,-31,-30,-28,-27,-26,-26,-26,-25,-25,-24,-24,-24};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }

        int j = 2;
        int prev = nums[1];
        int prevprev = nums[0];

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != prev || nums[i] != prevprev) {
                nums[j] = nums[i];
                j++;
                prevprev = prev;
                prev = nums[i];
            }
        }

        return j;
    }
}

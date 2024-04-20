package org.example.arrayString;

import java.util.Arrays;

public class Task27RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int lastNotValIndex = nums.length - 1;
        int notValCount = 0;
        for (int i = 0; i <= lastNotValIndex; i++) {
            if (nums[i] == val) {
                for (int j = lastNotValIndex; j > i; j--) {
                    lastNotValIndex--;
                    if (nums[j] != val) {
                        int buff = nums[i];
                        nums[i] = nums[j];
                        nums[j] = buff;
                        notValCount++;
                        break;
                    }
                }
            } else {
                notValCount++;
            }
        }
        return notValCount;
    }
}

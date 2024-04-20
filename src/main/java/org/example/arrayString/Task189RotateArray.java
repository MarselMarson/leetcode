package org.example.arrayString;

import java.util.Arrays;

public class Task189RotateArray {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public static void rotate(int[] nums, int k) {
        int rotateCount = k % nums.length;
        if (rotateCount == 0) return;

        int cycleCount = gcdByEuclidsAlgorithm(nums.length, rotateCount);

        for (int i = 0; i < cycleCount; i++) {
            int num = nums[i];
            int newIndexForNum = i;
            for (int j = 0; j < nums.length/cycleCount; j++) {
                newIndexForNum = (newIndexForNum + rotateCount) % nums.length;
                int buffNum = nums[newIndexForNum];
                nums[newIndexForNum] = num;
                num = buffNum;
            }
        }
    }
}

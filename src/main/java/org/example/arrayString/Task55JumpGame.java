package org.example.arrayString;

public class Task55JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        if (nums[0] == 0) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i - 1, minJump = 2; j >= 0; j--, minJump++) {
                    if (nums[j] >= minJump) {
                        break;
                    }
                    if (j == 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

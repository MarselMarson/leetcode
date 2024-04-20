package org.example.arrayString;

public class Task45JumpGameII {
    public static void main(String[] args) {
        int[] nums = {7,1,2,9,1,1,1,7,1,1,1,1,1,1,1,1};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        if (nums.length == 1 || nums[0] == 0) {
            return 0;
        }

        int start = nums[0];
        int steps = 1;
        int count = 1;
        int maxSumOfTwoSteps = start;
        int bestNextI = 1;

        for (int i = 1; i < nums.length - 1; i++) {
            if (start + i >= nums.length) {
                return count;
            }

            for (int j = i; start >= steps; j++) {
                if (maxSumOfTwoSteps < steps + nums[j]) {
                    maxSumOfTwoSteps = steps + nums[j];
                    bestNextI = j;
                }
                steps++;
            }
            count++;
            start = nums[bestNextI];
            steps = 1;
            maxSumOfTwoSteps = start;
            i = bestNextI;
        }

        return count;
    }
}

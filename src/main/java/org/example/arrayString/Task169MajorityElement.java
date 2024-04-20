package org.example.arrayString;

import java.util.HashMap;
import java.util.Map;

public class Task169MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementsCount = new HashMap<>();
        int majorElement = nums[0];

        for (int num : nums) {
            if (!elementsCount.containsKey(num)) {
                elementsCount.put(num, 1);
            } else {
                int numCount = elementsCount.compute(num, (k, v) -> v+1);
                if (numCount > nums.length/2) {
                    majorElement = num;
                    break;
                }
            }
        }

        return majorElement;
    }
}

package org.example.arrayString;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Task26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,3,4,4,4,4,4};
        //System.out.println(removeDuplicates2(nums));
        //System.out.println(Arrays.toString(nums));
        System.out.println(removeDuplicates3(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates2(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        int lastNonUniqueIndex = nums.length - 1;
        for (int i = 0; i <= lastNonUniqueIndex; i++) {
            if (!unique.add(nums[i])) {
                for (int j = lastNonUniqueIndex; j > i; j--) {
                    lastNonUniqueIndex--;
                    if (unique.add(nums[j])) {
                        nums[i] = nums[j];
                        break;
                    }
                }
            }
        }
        return unique.size();
    }

    public static int removeDuplicates(int[] nums) {
        Deque<Integer> duplicateIndexes = new ArrayDeque<>();
        int uniqueNumbersCount = 1;
        int number = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (number == nums[i]) {
                duplicateIndexes.add(i);
            } else {
                if (!duplicateIndexes.isEmpty()) {
                    nums[duplicateIndexes.pop()] = nums[i];
                    duplicateIndexes.add(i);
                }
                number = nums[i];
                uniqueNumbersCount++;
            }
        }

        return uniqueNumbersCount;
    }

    public static int removeDuplicates3(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

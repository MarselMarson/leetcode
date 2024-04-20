package org.example.arrayString;

import java.util.Arrays;

public class Task88MergeSortedArray {
    public static void main(String[] args) {

    }

    public void merge(int nums1[], int m, int nums2[], int n) {
        if (nums2.length != 0) {
            for (int i = m, j = 0; i < m + n; i++, j++) {
                nums1[i] = nums2[j];
            }
        }
        Arrays.sort(nums1);
    }
}

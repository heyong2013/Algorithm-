package org.example;

import java.util.Arrays;

/**
* Author: heyong
* Date: 2023/12/23
* Description:https://leetcode.cn/problems/sort-an-array/description/
*/
public class SortAnArray912 {
    public static void main(String[] args) {
        int[] arr= {49, 59, 88, 37, 98, 97, 68, 54, 31, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] nums, int l, int r) {
        if(l >= r) return;
        int i = l - 1, j = r + 1, mid = nums[(l + r) >> 1];
        while(i < j) {
            do i++; while(nums[i] < mid);
            do j--; while(nums[j] > mid);
            if(i < j) {
                swap(nums, i, j);
            }
        }
        quickSort(nums, l, j);
        quickSort(nums, j + 1, r);
    }
    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}

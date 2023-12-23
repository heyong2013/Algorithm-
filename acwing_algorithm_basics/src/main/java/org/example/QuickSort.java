package org.example;

/**
 * Author: heyong
 * Date: 2023/12/23
 * Description: https://www.acwing.com/problem/content/787/
 */
import java.io.*;

public class QuickSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        quickSort(arr, 0, n - 1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l >= r) return;
        int i = l - 1, j = r + 1, x = arr[(l + r) >> 1];
        while(i < j) {
            do i++; while(arr[i] < x);
            do j--; while(arr[j] > x);
            if(i < j) {
                // swap
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        quickSort(arr, l, j); quickSort(arr, j + 1, r);
    }
}
package com.ocoder.base;

public class _04_简单递归 {
    public static int getMax(int[] arr, int l, int r) {
        if (arr == null || arr.length <= 0) {
            return 0;
        }
        if (l == r) {
            return arr[l];
        }
        int mid = l + ((r - l) >> 2);
        int maxL = getMax(arr, l, mid);
        int maxR = getMax(arr, mid + 1, r);
        return Math.max(maxL, maxR);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }
}

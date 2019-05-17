package com.ocoder.base;

/**
 * 一个给定数组，选定最后数X，进行一轮处理，要求结果：小于X的放在左边，等于X的在中间，大于X的放右边。（即上一章中的荷兰国旗问题）
 对已经分割好的左右两部分，递归处理，中间不用动
 */
public class _06_快速排序 extends Base {
    public static void  sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l < r){
            // 随机选基准数
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p =partition(arr,l,r);
            quickSort(arr,l,p[0] -1);
            quickSort(arr,p[1]+1,r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        int less = l-1;
        int more = r; // arr[r] 做为基准数
        while (l < more){
            if (arr[l] < arr[r]){
                swap(arr,++less,l++);
            }else if(arr[l]> arr[r]){
                swap(arr,l,--more);
            }else{
                l++;
            }
        }
        // 因为借用，最后r位置上的数 做基准数，其实r位置上的数，在处理中是未考虑的，
        // 所以在最后做一次交换
        swap(arr,more,r);
        return new int[]{less+1,more};
    }
}

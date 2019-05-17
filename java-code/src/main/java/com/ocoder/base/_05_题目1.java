package com.ocoder.base;

/**
 * 给定一个数组arr，和一个数num，请把小于等于num的数放在数组的左边，大于num的数放在数组的右边。
 * 要求额外空间复杂度O(1)，时间复杂度O(N)
 */
public class _05_题目1 extends Base{

    public static void doing(int[] arr,int num) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int x = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= num){
                swap(arr,x+1,i);
                x++;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = generateRandomArray(100, 100);
        printArray(arr);
        doing(arr,50);
        printArray(arr);

    }

}

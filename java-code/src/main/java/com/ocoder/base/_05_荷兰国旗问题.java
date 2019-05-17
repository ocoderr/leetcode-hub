package com.ocoder.base;

/**
 * 问题二（荷兰国旗问题）
 给定一个数组arr，和一个数num，请把小于num的数放在数组的左边，等于num的数放在数组的中间，大于num的数放在数组的右边。
 要求额外空间复杂度O(1)，时间复杂度O(N)
 */
public class _05_荷兰国旗问题 extends Base{
    public static int[] doing(int[] arr,int left,int right,int num) {
        int less = left-1;
        int more = right +1;
        int eq = left -1;
        while (eq < more){
            if(arr[eq] < num){
                swap(arr,eq,less +1);
                eq++;
                less ++;
            }else if(arr[eq] > more){
                swap(arr,eq,more -1);
            }else{
                eq++;
            }
        }
        // 等于区域的位置
       return new int[]{left+1,more-1};
    }


}

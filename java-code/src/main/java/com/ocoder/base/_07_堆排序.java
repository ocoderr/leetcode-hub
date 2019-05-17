package com.ocoder.base;

public class _07_堆排序 extends Base {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 建立大根堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        swap(arr, 0, --size);

        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }
    }

    private static void heapify(int[] arr, int i, int size) {
        int left = i*2+1;
        while (left < size){
            int largest = left;
            if(left +1 < size && arr[left] < arr[left+1]){
                largest = left +1;
            }
            largest = arr[largest]> arr[i]?largest:i;
            if(largest == i){
                break;
            }
            swap(arr,i,largest);
            i = largest;
            left = i*2 +1;
        }
    }

    public static void heapInsert(int[] arr,int index){
        while (arr[index] > arr[(index -1)/2]){
            swap(arr,index,(index -1)/2);
            index = (index -1 ) /2;
        }
    }

}

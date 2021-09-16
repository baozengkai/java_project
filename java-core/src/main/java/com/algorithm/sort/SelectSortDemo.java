package com.algorithm.sort;

public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,8,5,7,4,3};
        selectSort(arr);
        System.out.println(arr);
    }

    public static void selectSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int min = arr[i];
            for(int j=i+1; j<arr.length;j++){
                if(min > arr[j]){
                    int temp = min;
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

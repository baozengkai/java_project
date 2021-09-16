package com.algorithm.sort;

public class BubblingSortDemo {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,8,5,7,4,3};
        bubblingSort(arr);
        System.out.println(arr);
    }

    public static void bubblingSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

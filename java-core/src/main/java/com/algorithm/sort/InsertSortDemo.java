package com.algorithm.sort;

public class InsertSortDemo {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,8,5,7,4,3};
        insertSort(arr);
        System.out.println(arr);
    }

    public static void insertSort(int[] arr){
        for(int i=0;i < arr.length;i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}

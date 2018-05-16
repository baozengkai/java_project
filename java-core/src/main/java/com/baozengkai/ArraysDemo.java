package com.baozengkai;

import java.util.Arrays;
import java.util.List;
/**
 *  数组
 *   一:定义数组
 *   二:返回数组
 *   三:Arrays工具类的使用
 *      3.1 Arrays.asList将数组转换为List
 *      3.2 Arrays.equals比较两个数组是否相等(如果两个数组以相同顺序包含相同元素，则相同，反之不同)
 *      3.3 Arrays.toString打印数组的元素
 *      3.4 Arrays.sort对数组元素排序(只有升序)
 *      3.5 Arrays.binarySearch 定位查找指定元素(返回查找到的位置)
 *      3.6 Arrays.copyOf 数组拷贝
 *   @author baokai
 */

public class ArraysDemo {

    // 三: Arrays工具类的使用
//    String[] strArray = new String[]{"xiaobao", "xiaoya"};
//    Integer[] intArrays = new Integer[]{1, 2, 3, 7, 4};
//
//    // 3.1 将数组转换为List
//    void arrayToList() {
//        List<String> list = Arrays.asList(strArray);
//        for(String s: list) {
//            System.out.print(s + ",");
//        }
//    }
//
//    // 3.2 对比两个数组是否相等
//    boolean compareArray() {
//        String[] strArray2 = new String[]{"xiaobao", "xiaoya"};
//        return Arrays.equals(strArray,strArray2);
//    }
//
//    // 3.3 打印数组的元素
//    void printArray() {
//        System.out.println(Arrays.toString(intArrays));
//    }
//
//    // 3.4 数组排序
//    void sortArray() {
//        Arrays.sort(intArrays);
//        System.out.println(Arrays.toString(intArrays));
//    }
//
//    // 3.5 定位查找指定元素
//    void findArray() {
//        System.out.println(Arrays.binarySearch(intArrays,7));
//    }
//
//    // 3.6 数组的拷贝
//    void copyArray() {
//        Integer[] result = Arrays.copyOf(intArrays,intArrays.length);
//        System.out.println(Arrays.toString(result));
//    }

    public static void main(String[] args) {

        //1.定义数组
        int[] arrays = new int[5];
        System.out.println(arrays.length);

//        ArraysDemo ad = new ArraysDemo();
//        ad.arrayToList();
//        System.out.println(ad.compareArray());
//        ad.printArray();
//        ad.sortArray();
//        ad.findArray();
//        ad.copyArray();
    }
}

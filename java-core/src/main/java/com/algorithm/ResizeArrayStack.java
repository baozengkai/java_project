package com.algorithm;

/**
 * 可调整数组大小的数组栈
 *      客户端不需给出数组的大小
 *      大小根据数据量的大小自动增长和自动缩小
 *      自动增长原则: 每当插入的数据长度大于数组的一半的时候，就创建一个双倍目前长度的数组
 *      自动缩小原则: 当目前的数据长度小于或等于数组的四分之一的时候，就减半
 *
 */

public class ResizeArrayStack {

    public String[] stack;
    private int count = 0;

    ResizeArrayStack(){
        this.stack = new String[1];
    }

    public boolean isEmpth(){
        return this.count == 0;
    }

    //入栈
    public void push(String s){
        if(this.count == stack.length){
            resizeArray(stack.length * 2);
        }
        this.stack[count] = s;
        this.count++;
    }

    // 扩大数组大小
    public void resizeArray(int capacity){
        String[] tmp = new String[capacity];
        for(int i=0;i<this.count;i++){
            tmp[i] = stack[i];
        }
        this.stack = tmp;
    }

    //出栈
    public String pop(){
      if(isEmpth()){
          System.exit(1);
      }
      
    }

    public static void main(String[] args){
        ResizeArrayStack ra = new ResizeArrayStack();
        ra.push("a");
        ra.push("b");
        ra.push("b");
        System.out.println(ra.stack.length);
    }
}

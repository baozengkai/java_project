package com.algorithm;

/**
 * 数组栈
 *      构造函数初始化数组
 *      判栈空
 *      判栈满
 *      入栈
 *      出栈
 *      返回栈的数量
 *  注意:
 *      1.在java中，数组的创建都是在堆上的
 *      2.数组的大小是固定的
 *      3.在出栈的时候，对于非基本类型的存储，存储的是对象指针 你需要显示的将此设置为NULL， Java才会启动垃圾回收期收集。
 */

public class ArrayStack {

    private int[] stacks;
    private int N;
    private int count = 0;

    ArrayStack(int size){
        this.N = size;
        this.stacks = new int[this.N];
    }

    // 判断栈是否是空栈
    public boolean isEmpty(){
        return this.count == 0;
    }

    // 判断栈是否是满栈
    public boolean isFull(){
        return this.count == this.N;
    }

    // 入栈
    public void push(int value){
        //首先判断是否是满栈 满了的话就不能加了
        if(isFull()){
            System.exit(1);
        } else {
          stacks[this.count] = value;
          this.count++;
        }
    }

    // 出栈
    public int pop(){
        //首先判断是否是空栈  是空栈的话就不能出了
        if(isEmpty()) {
            return -1;
        } else {
            this.count--;
            int tmp = stacks[this.count];
//            stacks[this.count] = null; // 对于非基本类型的存储，存储的是对象指针 你需要显示的将此设置为NULL， Java才会启动垃圾回收期收集。
            return tmp;
        }
    }

    // 返回栈的长度
    public int size(){
        return this.count;
    }

    public static void main(String[] args){
        ArrayStack as = new ArrayStack(5);
        for(int i=0;i<5;i++){
            as.push(i);
        }
        System.out.println(as.size());
        System.out.println(as.pop());
        System.out.println(as.size());
    }
}

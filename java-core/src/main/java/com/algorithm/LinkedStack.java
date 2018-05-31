package com.algorithm;

/**
 * 栈的特点:
 *  先进后出
 *
 * 链表栈:
 *  栈的操作:
 *      初始化栈
 *      入栈
 *      出栈
 *      判栈空
 *   注意点:
 *      链表栈不存在栈满的情况
 *      该代码是没有头结点的情况
 */

class Node<T>{
    T data;
    Node next;
}

public class LinkedStack<T> {
    Node<T> head = null;

    // 初始化函数(构造函数完成)
    LinkedStack(){
//        head = new Node();
//        head = null;
    }

    // 判栈空
    public boolean isEmpty() {
        return head == null;
    }

    // 入栈
    public void push(T s) {
            Node<T> tmp = head;
            head = new Node<T>();
            head.data = s;
            head.next = tmp;
    }

    // 出栈
    public T pop() {
        // 先判断栈是否为空
        if(isEmpty()) {
            return null;
        }else {
            T res = head.data;
            head = head.next;
            return res;
        }
    }

    public static void main(String[] args){
//        LinkedStack ls = new LinkedStack();
//        for(int i=0;i<3;i++) {
//            ls.push(i);
//        }
//        System.out.println(ls.pop());
//        System.out.println(ls.pop());
//        System.out.println(ls.pop());
//        System.out.println(ls.pop());

        LinkedStack<String> ls = new LinkedStack<String>();
        ls.push("xiaobao");
        ls.push("love");
        //ls.push(1); 编译器会报错

        System.out.println(ls.pop());
    }
}

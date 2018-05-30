package com.algorithm;

/**
 * 入队列:
 *  思路:
 *      队列的特点是先进先出，所以需要有两个指针维护第一个节点和最后一个节点
 *      其中，指向最后一个结点的指针始终维护需要加入的结点  指向第一个节点的指针始终维护需要删除的结点。
 *      在入队的时候，需要判断head==null来判断队列是否为空，因为空队列的操作和非空队列的入队操作不同。
 *      在出队的时候，只需要将head指向的内容返回，然后head = head.next即可。
 *
 */

class NodeQ{
    int data;
    NodeQ next;
}

public class LinkedQueue {
    NodeQ head = null;
    NodeQ last = null;

    LinkedQueue(){}

    // 入队列 移动的是last指针
    public void enQueue(int term){
        //如果队列是空的

        NodeQ tmp = last;
        last = new NodeQ();
        last.data = term;
        last.next = null;

        if(isEmpty()){
            head = last;
        }
        else {
            tmp.next = last;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    //出队列 移动的是head指针
    public int deQueue(){
        int data = head.data;
        head = head.next;
        return data;
    }

    public static void main(String[] args) {
        LinkedQueue lq = new LinkedQueue();
        for(int i=0; i<3; i++) {
            lq.enQueue(i);
        }
        System.out.println(lq.deQueue());
        System.out.println(lq.deQueue());
        System.out.println(lq.deQueue());
    }
}

package com.baozengkai;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
/*
集合
    LinkedList:
        链表实现
            分配空间不必是连续的
            插入和删除的操作很快，只需要修改指针就可以，时间复杂度是O(1)
            访问比较慢，底层是实现必须是从第一个元素开始遍历，时间复杂度是O(n)
        常见方法
            1.add: 添加元素
            boolean add(E e):在链表尾部插入一个元素
            void addFirst(E e):在链表头部插入一个元素
            void addLast(E e):在链表尾部插入一个元素
            void add(int index ,E e):在指定位置处插入一个元素
            2.remove:移除元素
            E remove() == E.removeFirst(): 移除链表中的第一个元素，也就是首元素
            boolean remove(Object o): 移除链表中指定的元素
            E remove(int indec):移除链表中指定位置的元素
            E removeLast(): 移除链表中最后一个元素
            3.get: 获取元素
            E get(int index):根据索引获取元素
            E getFirst(): 获取首元素
            E.getLast(): 获取尾元素
            除此之外，还有push、pop、poll以及peek
        遍历方式
            4.for-each方式
            5.迭代器方式

 */
public class Collection {
   public static void main(String[] args){
       LinkedList<String> lk = new LinkedList<String>();
       lk.add("first");
       lk.add("second");
       lk.add("third");
       lk.add("fourth");

       System.out.println(lk.get(2));
       System.out.println(lk.getLast());

       lk.remove();
       lk.remove("third");
       System.out.println(lk.size());

       //遍历的两种方式
       //for each方式
       for(Object o :lk)
       {
           System.out.println(o);
       }
       //迭代器方式
       Iterator<String> it = lk.iterator();
       while(it.hasNext())
       {
           Object oo = it.next();
           System.out.println(oo);
       }
       System.out.println(lk.size());
   }
}

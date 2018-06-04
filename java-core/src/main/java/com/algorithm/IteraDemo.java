package com.algorithm;


import java.util.*;

/**
 * 迭代器
 *      迭代器提供一种思路，即采用相同的方式去遍历容器(集合)中的元素，客户端不关心起内部是如何实现的。
 *
 *      1.在没有出现迭代器之前的容器遍历?
 *          在没有出现迭代器之前，不同的容器需要有不同的迭代方式，比如说下面这两个，List的特点是有顺序，可以有重复数据，Set特点是无顺序，不可有重复数据。
 *          所以List是可以用get方法，因为get(int index)是根据下标来获取数据的，但是set内部是使用哈希表实现的，就不能用get下标来获取数据。那么有没有一个方法
 *          可以在客户端使用一种方式就可以遍历不同容器的数据，这就是迭代器。
 *
 *     2.迭代器的初步使用
 *          容器基本上都实现了迭代器对象的定义，iterator()方法可以返回一个迭代器对象，该迭代器对象用于遍历容器内部数据。
 *
 *     3.Iterable和Iterator
 *          这两个都是接口类，其中Iterable定义了一个返回Iterator对象的方法
 *          Iterator有三个方法，分别是hasNext()、next()以及remove()方法
 *          如果我们写的栈和队列想要以迭代器方式提供遍历接口，就需要实现Iterable接口和Iterator接口
 */


public class IteraDemo {

    public static void main(String[] args) {

    //1.迭代器之前
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");

//    System.out.print(list.get(0));

    List<String> list_linked = new LinkedList<String>();
    list_linked.add("a");
    list_linked.add("b");
    list_linked.add("c");

//    // 由于LinkedList底层是链表，无法根据get下标获得，底层是用的遍历实现的。
//    System.out.print(list_linked.get(0));

    Set<String> set = new HashSet<String>();
    set.add("a");
    set.add("b");
    set.add("c");


    //2.有了迭代器之后, 可以看到以相同的方式遍历了容器
    Iterator<String>  list_ite = list.iterator();
    while(list_ite.hasNext()) {
        String s = list_ite.next();
        System.out.println(s);
     }

     Iterator<String> set_ite = set.iterator();
     while(set_ite.hasNext()){
         String s = set_ite.next();
         System.out.println(s);
     }
    }
}

package com.baozengkai;
import java.lang.reflect.Array;
import java.util.*;

/**
 *  集合
    1.LinkedList:
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
    2. 细节
    3.Collection类添加一组元素(配合java.utils.Arrays使用)
    4.IdentityHashMap使用
 */
public class CollectionDemo {
   public static void main(String[] args){
       //1. LinkedList
//       LinkedList<String> lk = new LinkedList<String>();
//       lk.add("first");
//       lk.add("second");
//       lk.add("third");
//       lk.add("fourth");
//
//       System.out.println(lk.get(2));
//       System.out.println(lk.getLast());
//
//       lk.remove();
//       lk.remove("third");
//       System.out.println(lk.size());
//
//       //遍历的两种方式
//       //for each方式
//       for(Object o :lk)
//       {
//           System.out.println(o);
//       }
//       //迭代器遍历
//       Iterator<String> it = lk.iterator();
//       while(it.hasNext())
//       {
//           Object oo = it.next();
//           System.out.println(oo);
//       }
//       System.out.println(lk.size());

       //迭代器删除
       List<String> list = new ArrayList<String>();

       Iterator<String> it = list.iterator();

       for(int i=0;i<5;i++)
       {
           list.add("String"+i);
       }

       while(it.hasNext())
       {
            String s = it.next();
            System.out.println(s);
            it.remove();
       }

       System.out.println(list.size());

       // 2. 细节
       // 2.1 创建集合引用方式(用这种方式，实现了向上转型，可以方便的将l在之后修改成指向LinkList之类的)
       // 注意: 需要注意的是，如果需要用到ArrList中独有的方法，这种就不奏效了。
//       List<String> l = new ArrayList<String>();
//
//       // 2.2 所有继承自Collection的对象都可以正常工作
//       java.util.Collection<String> c = new ArrayList<String>();

       // 3.关于Collection添加一组元素
       // 3.1 添加一组元素(配合Arrays使用)

//       Collection<Integer> collection= new ArrayList<Integer>();
//
//       Integer[] elements = {1,2,3};
//
//       //3.1 colleciton.addAll()只能接受一个Collection对象作为参数，Arrays.asList接受一个数组或者列表，将其转换为List对象
//       collection.addAll(Arrays.asList(elements));
//
//       //3.2 Collecitons.addAll()接受一个Collection对象以及一个数组或者一个用逗号分隔的列表。
//       Collections.addAll(collection,elements);
//
//       System.out.println(collection);
//
//       //3.3 Arrays.asList()转换的List对象不能改变大小，底层还是数组
//       List<Integer> list = Arrays.asList(1,2,3);
//       list.set(1,-1);
////       list.add(4); //发生错误，因为底层还是数组，不能改变动态大小
//       System.out.println(list);

       // 4.IdentityHashMap使用
       // IdentityHashMap是比较的key1 == key2是否相同
       IdentityHashMap ident = new IdentityHashMap();
       ident.put("java", 80);
       ident.put(new String("java"), 85);

       System.out.println(ident);
   }
}

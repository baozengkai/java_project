package com.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Steam流技术:
    是Java8新增的特性，有点类似于scala语法中那样的用法。

为什么要有Steam技术?
    Steam API: 是对集合(Collection)功能的增强。
    目的 : 对集合对象进行各种非常便利、高效的聚合操作（aggregate operation）或者进行大批量数据操作(bulk data operation)
    特性 : 借助于新出现的Lambda表达式，极大提高编程效率，提供串行和并行两种模式，使用fork/join并行方式来拆分任何和加速
           处理过程，可以很方便的写出高性能的并发程序。

什么是聚合?
    广义来讲，聚合就是将有关的原始数据进行挑选、分析、归类，最后得到人们想得到的结果。

什么是stream(流)?
    steam又称为流。
    流不是数据结构，不保存数据，可以将集合包装成一个流，流更像是一个高级版本的Iterator，原始的迭代器只能显示的一个个遍历
    元素，而有了流之后，元素可以在流中做各种聚合变换，可以过滤，可以映射，最终得到数据转换。

    分类:
        两种流。分别是中间流(Intermediate)和终止流(Terminal)。
        其中一个流后面可以接0个或多个中间流，中间流是lazy型的，也就是仅仅调用到该方法，并没有真正的流动。
        一个流后面只能接一个终止流，当这个操作执行后，这个流就不能再被使用了。

stream实战
    1.stream生成方式
       可以从Collection类和数组中生成
 */
public class StreamDemo {
    public static void main(String[] args)
    {
        // 1.1 从序列中构造出Stream流
        Stream s = Stream.of("a","b","c");

        // 1.2 从Collection类中构造出Stream流
        Integer[] i = new Integer[]{1,2,3};
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(i));
        Stream slist = list.stream();
    }
}

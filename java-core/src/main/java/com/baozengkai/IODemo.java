package com.baozengkai;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * I/O系统
 *  一: File类
 *      1.1 查看指定目录下文件
 *      1.2 过滤查看指定目录下文件
 */

// 一:File类
// 1.1 目录查看
//public class IODemo {
//    public static void main(String[] args) {
//        File path = new File(".");
//        String[] items = path.list();
//        Arrays.sort(items);
//        for(String dirItem: items){
//            System.out.println(dirItem);
//        }
//    }
//}

//1.2 目录过滤
//public class IODemo {
//    public static void main(String[] args) {
//        File path = new File(".");
//        String[] str = path.list(new DirFilter(".*.iml"));
//
//        for(String dirItem : str) {
//            System.out.println(dirItem);
//        }
//    }
//}
//
//class DirFilter implements FilenameFilter {
//    private Pattern pattern;
//    public DirFilter(String regex) {
//        pattern = Pattern.compile(regex);
//    }
//    @Override
//    // list()会为path目录下的每个文件调用accept方法
//    public boolean accept(File dir, String name) {
//        return pattern.matcher(name).matches();
//    }
//}


// 1.3
public class IODemo {
    public static void main(String[] args) {
        File path = new File(".");

    }
}








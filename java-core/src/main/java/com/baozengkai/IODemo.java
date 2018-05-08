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
 *      1.3 常用操作
 *
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


// 1.3 常用操作
//public class IODemo {
//
//    private static void fileData(File f) {
//        System.out.println(
//            " Absolutely Path:" + f.getAbsolutePath() +
//            "\n Path:" + f.getPath() +
//            "\n Parent:" + f.getPath() +
//            "\n Name:" + f.getName() +
//            "\n Can Read:" + f.canRead() +
//            "\n Can Write: "+ f.canWrite() +
//            "\n Length: "+ f.length() +
//            "\n Last Modified: " + f.lastModified()
//        );
//        if(f.isFile()){
//            System.out.println("It is a file");
//        } else if (f.isDirectory()) {
//            System.out.println("It is a directory");
//        }
//    }
//
//    public static void main(String[] args) {
//        File path1 = new File("C:/baozengkai/code/code-style/eisoo-checkstyle.xml");
//        fileData(path1);
//
//        File path2 = new File("C:/baozengkai/");
//        fileData(path2);
//    }
//}








package com.baozengkai;

/**
 *  字符串
 *      1.重载+与StringBuilder类
 *  未学知识
 *      正则表达式
 *      Scanner扫描输入
 *  @author baokai
 */
public class StringDemo {
    public static void main(String[] args) {
        // 1.重载+与StringBuilder类
        // 1.1 一般重载情况
//        String s = "a" + "b" + "c";
//        System.out.print(s);

        // 1.2 循环重载情况
        String result = "";
        for (int i=0; i < 3; i++) {
            result += "" + i + "";
        }
        System.out.println(result);

        // 1.3 改进循环重载情况
        StringBuilder strBuild = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            strBuild.append(i);
        }
        System.out.println(strBuild.toString());
    }
}

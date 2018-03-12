package com.baozengkai;

import javax.xml.ws.soap.Addressing;

/*
克隆:
    1. 不使用克隆，直接赋值
    2. 使用浅克隆: 只会将简单的数据类型进行克隆 引用类型没有完全克隆
    3. 使用深克隆: 引用类型也将得到完全克隆
 */
class DeepDemo implements Cloneable{
    private String address;

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public DeepDemo clone()
    {
        DeepDemo dd = null;
        try
        {
            dd = (DeepDemo)super.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return dd;
    }
}
public class CloneDemo implements Cloneable{

    private int number;
    private DeepDemo dd;
    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return this.number;
    }

    public void setDeepDemo(DeepDemo dd)
    {
        this.dd = dd;
    }

    public DeepDemo getDd()
    {
        return dd;
    }

    public CloneDemo clone()
    {
        CloneDemo cldTemp = null;
        try {
            cldTemp = (CloneDemo) super.clone(); //浅克隆

            cldTemp.dd = this.dd.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return cldTemp;
    }


    public static void main(String[] args)
    {
        //1.不使用克隆
//        CloneDemo cld1 = new CloneDemo();
//        cld1.setNumber(123);
//        CloneDemo cld2 = cld1;
//        cld2.setNumber(456);
//
//        System.out.println("例子1的值:" + cld1.getNumber());
//        System.out.println("例子2的值:" + cld2.getNumber());

        //2.使用浅克隆
//        CloneDemo cld1 = new CloneDemo();
//        cld1.setNumber(123);
//
//        CloneDemo cld2 = cld1.clone();
//        cld2.setNumber(456);
//
//        System.out.println("例子1的值:" + cld1.getNumber());
//        System.out.println("例子2的值:" + cld2.getNumber());

        //3.使用深克隆
        DeepDemo dd = new DeepDemo();
        dd.setAddress("鲍凯");

        CloneDemo cld1 = new CloneDemo();
        cld1.setNumber(123);
        cld1.setDeepDemo(dd);

        CloneDemo cld2 = cld1.clone();
        cld2.getDd().setAddress("小雅");
        System.out.println("原对象名称: "+cld1.getDd().getAddress());
        System.out.println("现对象名称: "+cld2.getDd().getAddress());
    }
}

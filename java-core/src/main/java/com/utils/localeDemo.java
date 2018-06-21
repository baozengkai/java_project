package com.utils;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 国际化相关代码:
 *      1.获取本机默认的语言和地区环境
 *      2.使用Locale创建二个绑定不同指定语言/地区环境的本地化对象，并输出参数
 *      3.使用MessageFormat类来提供字符串占位功能。
 */

public class localeDemo {
    public static void main(String[] args) {

        // 1.获取本机默认的语言和地区环境
        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale.getCountry());
        System.out.println(defaultLocale.getLanguage());

        // 2.使用Locale类创建一个指定语言/地区环境的本地化对象
        Locale locale1 = new Locale("zh","CN");
        Locale locale2 = new Locale("en","US");

        // 获取ResourceBundle中配置对象(第一个参数是properties的名称，第二个参数是绑定的locale对象)
        ResourceBundle res = ResourceBundle.getBundle("test",locale1);

        ResourceBundle res2 = ResourceBundle.getBundle("test",locale2);

        String username1 = res.getString("username");
        String passwd1 = res.getString("passwd");
        String info_success1 = res.getString("info.success");

        System.out.println(username1);
        System.out.println(passwd1);

        if(true)
        {
            // 3.使用MessageFormat类来提供字符串占位功能
            System.out.println(MessageFormat.format(info_success1 ,username1));
        }

        String username2 = res2.getString("username");
        String passwd2 = res2.getString("passwd");

        System.out.println(username2);
        System.out.println(passwd2);
    }
}

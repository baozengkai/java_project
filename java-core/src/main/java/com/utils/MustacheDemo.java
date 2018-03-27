package com.utils;

import com.samskivert.mustache.Mustache;

import java.util.HashMap;
import java.util.Map;
/*
Mustache模板学习:
    Mustache是一个轻量级的渲染模板，原本是在JS中使用的，之后扩展到Java、C以及Python等很多语言都可以使用。
    语法:
        {{keyName}}: 标准的渲染变量
        {{#bool}}  {{/bool}} : 控制渲染逻辑，如果是true的话，包含的就输出，如果是false的话，包含的就不输出
        {{{keyName}}} : 原样渲染输出，{{}}会将特殊字符进行转译
        {{!comments}} : 注释


    实现:
        1) Demo: 使用Map类型的变量填充到template输出模板上

 */

public class MustacheDemo {
    public static void main(String[] args)
    {
        String template ="Hello , I am {{{name}}},</br> {{#bool}} I am {{age}} years old!!! {{/bool}}, {{! 我是注释}}";

        Map<String,Object>  ctx = new HashMap<String, Object>();
        ctx.put("name","xiaobao</br>");
        ctx.put("bool",true);
        //ctx.put("bool",false);
        ctx.put("age",24);

        String result = Mustache.compiler().compile(template).execute(ctx);
        System.out.print(result);
    }
}

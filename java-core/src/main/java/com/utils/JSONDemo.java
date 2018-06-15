package com.utils;


import mjson.Json;
import org.json.JSONArray;

/**
 * JSON对象相关操作:
 *      JSON对象有两种对象类型，一种是JSONObject，一种是JSONArray类型。
 *      处理JSON对象有专门的第三方的库，接下来我们使用mjson类库
 *
 *      测试方法:
 *      1.将String类型转换为Json类型
 *      2.使用JSONObject创建一个JSON
 *      3.创建一个包含JSONArray的JSONObject
 *      4.获取其中的属性
 *          4.1 获取简单的JSONObject对象数据，用at()方法转换为Json，然后在利用asXXX转换为相对应的String或者Integer
 *          4.2 获取复杂的JSONArray对象数据，用asJsonlist()方法将其转换为List<Json>的方式，然后在for循环中处理即可
 *                  或对于不复杂的JsonArray，利用asList()方法转换为List<Object>方式
 */
public class JSONDemo {

    public static void main(String[] args) {
        // 1.使用mjson的read方法，将str转换为Json类型
        String str = "{\"name\":\"xiaobao\",\"age\":24}";
        Json json = Json.read(str);

        //2.使用JSONObject创建一个JSON
        Json json2  = Json.object().set("name","xiaobao").set("age",20);
        String jsonStr = json2.toString();
        System.out.println(jsonStr);

        //3.创建一个包含JSONArray的JSONObject
        Json child1 = Json.object().set("name","xiaobao");
        Json child2 = Json.object().set("name","xiaoya");

        Json father = Json.array().add(child1).add(child2);
        Json mather = Json.array().add("eat").add("sleep");

        Json grand_father = Json.object()
                .set("grand_child",father)
                .set("wife","grand_mather")
                .set("child",mather);

        System.out.println(grand_father.toString());

        // 4.获取简单的JSONObject的属性
        String name = json.at("name").asString();
        System.out.println(name);

        // 5.获取复杂的JSONArray的属性
        for(Json person : grand_father.at("grand_child").asJsonList())
        {
            String name1 = person.at("name").asString();
            System.out.println(name1);
        }

        //5.1如果是一些不复杂的可以利用asList()方法
        for(Object obj : grand_father.at("child").asList())
        {
            String str1 = (String)obj;
            System.out.println(str1);
        }
    }
}

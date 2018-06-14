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

        Json grand_father = Json.object()
                        .set("grand_child",father)
                        .set("wife","grand_mather");

        System.out.println(grand_father.toString());
    }
}

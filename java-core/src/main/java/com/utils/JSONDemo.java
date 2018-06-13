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
 */
public class JSONDemo {

    public static void main(String[] args) {
    // 1.使用mjson的read方法，将str转换为Json类型
    String str = "{\"name\":\"xiaobao\",\"age\":24}";
    Json json = Json.read(str);

    }
}

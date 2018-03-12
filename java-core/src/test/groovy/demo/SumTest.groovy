package demo;
import spock.lang.Specification
import spock.lang.Unroll;


/*
spock模块框架学习
    1.简单demo测试
    2.使用given when以及then测试
    3.异常断言
        3.1 判断是否抛出异常
        3.2 判断异常是否抛出并验证抛出类型
    4. where准备数据
    5. Mock(待学习)
 */
public class SumTest extends Specification{
    def sum = new Sum();

    @Unroll
    def "sum should return param+param2"()
    {
     // 2.使用given、when以及then测试
//     given:
//        def stack = new Stack()
//        def elem = "xiaobao"
//     when:
//        stack.push(elem)
//     then:
//        stack.size() == 1
//        stack.peek() == elem

     //1.简单测试
//     expect:
//     sum.sum(1,1) == 2;

     //3.1 判断是否抛出异常
//     given:
//        def stack = new Stack();
//     when:
//        stack.pop();
//     then:
//        thrown(EmptyStackException)

     //3.2 判断异常是否抛出并验证抛出类型
//     given:
//        def stack = new Stack();
//     when:
//        stack.pop()
//     then:
//        def e = thrown(EmptyStackException)
//        e.cause == null

        //4. where准备数据
        //4.1 传统框架准备数据
//        expect:
//            Math.max(1,3) == 3
//            Math.max(7,4) == 7
//            Math.max(0,0) == 0

        //4.2 spock准备数据
        expect:
            Math.max(a,b) == c

        where:
            a | b || c
            1 | 3 || 3
            7 | 4 || 7
            0 | 0 || 0
    }
}

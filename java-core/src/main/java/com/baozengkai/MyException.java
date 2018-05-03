package com.baozengkai;

import java.io.IOException;
import java.lang.Exception;

/**
 * 自定义异常类
 * @author  baokai
 */
public class MyException extends RuntimeException {
    public MyException()
    {}

    public MyException(String message)
    {
        super(message);
    }
}

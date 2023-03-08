package com.william.springcloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author William Guo
 * @since 2023-03-07 21:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T>{


    private Integer code;
    private String msg;
    private T data;

    public Result(Integer code, String msg){
        this(code,msg,null);
    }

    public static <T> Result<T> success(T object){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setData(object);
        return result;
    }

    public static <T> Result<T> error(String msg){
        Result result = new Result();
        result.setCode(100);
        result.setMsg(msg);
        return result;
    }

}

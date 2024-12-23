package com.example.springboot_tool.utils;

import lombok.Data;

/**
 * @author 君颜未改
 * @since 2024-12-24 00:44:24
 */
@Data
public class Result<T> {
    private String code;
    private String msg;
    private T data;


    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public static Result success() {
        Result result = new Result<>();
        result.setCode("1");
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>(data);
        result.setCode("1");
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> success(String code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error() {
        Result result = new Result<>();
        result.setCode("0");
        result.setMsg("error");
        return result;
    }

    public static <T> Result<T> error(T data) {
        Result<T> result = new Result<>(data);
        result.setCode("0");
        result.setMsg("error");
        return result;
    }

    public static <T> Result<T> error(String code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}

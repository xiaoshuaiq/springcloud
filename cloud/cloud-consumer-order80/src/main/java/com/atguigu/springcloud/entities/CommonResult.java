package com.atguigu.springcloud.entities;

/**
 * @author WangXiaoshuai
 * @create 2020-05-27 21:59
 */
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T t;

    public CommonResult(Integer code, String message, T t) {
        this.code = code;
        this.message = message;
        this.t = t;
    }

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <T> CommonResult<T> success(T t) {
        CommonResult commonResult = new CommonResult(200, "成功", t);
        return commonResult;
    }

    public static <T> CommonResult<T> success(String message, T t) {
        CommonResult commonResult = new CommonResult(200, message, t);
        return commonResult;
    }

    public static <T> CommonResult<T> fail(T t) {
        CommonResult commonResult = new CommonResult(444, "成功", t);
        return commonResult;
    }

    public static <T> CommonResult<T> fail(String message, T t) {
        CommonResult commonResult = new CommonResult(444, message, t);
        return commonResult;
    }

    public static <T> CommonResult<T> fail(Integer code, String message, T t) {
        CommonResult commonResult = new CommonResult(code, message, t);
        return commonResult;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CommonResult{");
        sb.append("code=").append(code);
        sb.append(", message='").append(message).append('\'');
        sb.append(", t=").append(t);
        sb.append('}');
        return sb.toString();
    }
}

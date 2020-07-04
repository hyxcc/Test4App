package com.hyx.dto;


public class Result<T> {
    private Integer code;
    private String messages;
    private T data;
    private static final Integer SUCCEED = 222;
    private static final Integer FAILI = 244;
    private static final String OPERATE_SUCCEED = "操作成功！";
    private static final String OPERATE_FAILI = "操作失败！";

    public Result(){

    }

    public Result(Integer code, String messages, T data) {
        this.code = code;
        this.messages = messages;
        this.data = data;
    }

    public Result(Integer code, String messages) {
        this.code = code;
        this.messages = messages;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public static Integer getSUCCEED() {
        return SUCCEED;
    }

    public static Integer getFAILI() {
        return FAILI;
    }

    public static String getOperateSucceed() {
        return OPERATE_SUCCEED;
    }

    public static String getOperateFaili() {
        return OPERATE_FAILI;
    }


    public static Result<Object> back(Object  data){
        Integer code = SUCCEED;
        String messages = OPERATE_SUCCEED;
        if(data!=null){
            return new Result<Object>(code,messages,data);
        }

        code = FAILI;
        messages = OPERATE_FAILI;
        return new Result<Object>(code,messages);
    }
    public static<T> Result<T> back(Integer num){
        Integer code = SUCCEED;
        String messages = OPERATE_SUCCEED;
        if(num>0){
            return new Result<T>(code,messages);
        }
        code = FAILI;
        messages = OPERATE_FAILI;
        return new Result<T>(code,messages);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", messages='" + messages + '\'' +
                ", data=" + data +
                '}';
    }
}

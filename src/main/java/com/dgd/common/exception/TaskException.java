package com.dgd.common.exception;

/**
 * @Author DGD
 * @date 2017/10/17.
 */
public class TaskException extends  RuntimeException{

    private  int code=-1;
    private Object data;
    public TaskException(String msg){
        super(msg);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TaskException(String msg, int code){
        super(msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
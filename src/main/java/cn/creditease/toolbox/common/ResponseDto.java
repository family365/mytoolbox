package cn.creditease.toolbox.common;

import java.io.Serializable;

public class ResponseDto<T> implements Serializable {

    private static final long serialVersionUID = -3929841095415186645L;
    private static final String DefaultSuccessCode = "000000";
    private static final String DefaultSuccessMessage = "success";
    private static final String DefaultErrorCode = "999999";
    private static final String DefaultErrorMessage = "failed";
    
    private boolean ret;
    private T data;
    private String errcode;
    private String errmsg;

    public ResponseDto<T> error(String errcode, String errmsg) {
        setRet(false);
        setErrcode(errcode);
        setErrmsg(errmsg);
        return this;
    }
    
    public ResponseDto<T> error(String errmsg) {
        setRet(false);
        setErrcode(DefaultErrorCode);
        setErrmsg(errmsg);
        return this;
    }

    public ResponseDto<T> succ(T data) {
        setRet(true);
        setErrcode(DefaultSuccessCode);
        setErrmsg(DefaultSuccessMessage);
        setData(data);
        return this;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append("\"ret\":").append(ret)
        		.append(", ").append("\"errcode\":").append(errcode)
        		.append(", ").append("\"errmsg\":").append(errmsg)
                .append(", ").append("\"data\":").append(data)
                .append("}");
        return builder.toString();
    }

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}

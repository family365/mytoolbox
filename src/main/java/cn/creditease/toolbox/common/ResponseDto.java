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
    private String errorCode;
    private String errorMessage;

    public ResponseDto<T> error(String errcode, String errmsg) {
        setRet(false);
        setErrorCode(errcode);
        setErrorMessage(errmsg);
        return this;
    }
    
    public ResponseDto<T> error(String errmsg) {
        setRet(false);
        setErrorCode(DefaultErrorCode);
        setErrorMessage(errmsg);
        return this;
    }

    public ResponseDto<T> succ(T data) {
        setRet(true);
        setErrorCode(DefaultSuccessCode);
        setErrorMessage(DefaultSuccessMessage);
        setData(data);
        return this;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append("\"ret\":").append(ret)
        		.append(", ").append("\"errcode\":").append(errorCode)
        		.append(", ").append("\"errmsg\":").append(errorMessage)
                .append(", ").append("\"data\":").append(data)
                .append("}");
        return builder.toString();
    }

    public boolean getRet() {
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

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

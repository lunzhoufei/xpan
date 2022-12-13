package com.lunzhoufei.xpan.contract.common;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    protected boolean success;
    protected Integer errorCode;
    protected String errorMsg;
    protected T result;

    public BaseResponse() {
    }

    private BaseResponse(Builder<T> builder) {
        this.success = builder.success;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.result = builder.result;
    }

    public static <T> BaseResponse<T> ofSuccess(T t) {
        return BaseResponse.success(t).build();
    }

    public static <T> BaseResponse<T> ofSuccess() {
        return ofSuccess(null);
    }

    public static <T> BaseResponse<T> ofFail(Integer errorCode) {
        return ofFail(errorCode, null);
    }

    public static <T> BaseResponse<T> ofFail(Integer errorCode, String errorMsg) {
        return BaseResponse.<T>fail().errorCode(errorCode).errorMsg(errorMsg).build();
    }

    public static Builder newSuccResponse() {
        return new Builder().success(true);
    }

    public static <T> Builder<T> success() {
        return new Builder<T>().success(true);
    }

    public static <T> Builder<T> success(T data) {
        return new Builder<T>(data).success(true);
    }

    public static Builder newFailResponse() {
        return new Builder().success(false);
    }

    public static <T> Builder<T> fail() {
        return new Builder<T>().success(false);
    }

    // =================================================================================================================
    //                                                   Builder
    // =================================================================================================================

    public static final class Builder<T> {
        private boolean success = false;
        private Integer errorCode;
        private String errorMsg;
        private T result;

        private Builder() {
        }

        private Builder(T data) {
            this.result = data;
        }

        public BaseResponse<T> build() {
            return new BaseResponse<>(this);
        }

        public Builder<T> success(boolean success) {
            this.success = success;
            this.errorCode = 0; // TODO
            return this;
        }

        public Builder<T> errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder<T> errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        public Builder<T> result(T result) {
            this.result = result;
            return this;
        }
    }

    public boolean isSuccess() {
        return success;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public T getResult() {
        return result;
    }

}

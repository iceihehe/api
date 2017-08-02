package com.iceihehe.api.common;

import static com.iceihehe.api.common.constant.Code.SUCCESS;

public class Message {

    private Integer code = SUCCESS;

    private Object data = new Object();

    public Message(Object data){
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

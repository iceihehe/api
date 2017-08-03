package com.iceihehe.api.common;

import com.iceihehe.api.common.constant.Code;
import org.json.simple.JSONObject;

public class Message extends JSONObject {

    public Message(){
        this.put("code", Code.SUCCESS);
    }

    public void setCode(Integer code){
        this.put("code", code);
    }

    public void setData(JSONObject data){
        this.put("data", data);
    }

    public void setMessage(String message){
        this.put("msg", message);
    }

}

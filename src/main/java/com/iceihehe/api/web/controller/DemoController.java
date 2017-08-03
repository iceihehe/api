package com.iceihehe.api.web.controller;

import com.iceihehe.api.common.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping
    @ResponseBody
    public Message demoRoot(){
        String data = "This is root!";
        Message message =  new Message();
        message.setMessage(data);
        return message;
    }

    @RequestMapping(params = "name")
    @ResponseBody
    public Message demoParam(@RequestParam("name") String name){
        String data = "This is param " + name + "!";
        Message message =  new Message();
        message.setMessage(data);
        return message;
    }

    @RequestMapping(value = "{name}")
    @ResponseBody
    public Message demoPath(@PathVariable("name") String name){
        String data = "This is path " + name + "!";
        Message message =  new Message();
        message.setMessage(data);
        return message;
    }

    @RequestMapping("/sub")
    @ResponseBody
    public Message demoSub(){
        String data = "This is sub!";
        Message message =  new Message();
        message.setMessage(data);
        return message;
    }
}


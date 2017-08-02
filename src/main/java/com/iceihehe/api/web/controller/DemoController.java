package com.iceihehe.api.web.controller;

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
    public String demoRoot(){
        return "Hello World!";
    }

    @RequestMapping(params = "name")
    @ResponseBody
    public String demoParam(@RequestParam("name") String name){
        return "This is params " + name + "!";
    }

    @RequestMapping(value = "{name}")
    @ResponseBody
    public String demoPath(@PathVariable("name") String name){
        return "This is path " + name + "!";
    }
}

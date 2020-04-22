package com.yh.demo.controller;

import com.yh.demo.common.SysResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController  {

    @RequestMapping(value = "/demo/test", method = RequestMethod.GET)
    public SysResult<String> test(String word) {
        return SysResult.ok(word);
    }
}

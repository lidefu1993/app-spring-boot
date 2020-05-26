package com.ldf.app.controller;

import com.ldf.app.service.BaseTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lidefu
 * @date 2020年05月25日19:03
 **/
@RestController
@RequestMapping("base/test")
public class BaseTestController {

    @Autowired
    private BaseTestService baseTestService;

    @GetMapping("json")
    public Object json(){
        return baseTestService.test();
    }

}

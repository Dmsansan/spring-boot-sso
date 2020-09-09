package com.sansan.order.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author siss
 * @date 2020/9/9  11:01
 */
@RestController
@RequestMapping(value = "/order")
public class SysOrderController {

    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String orderIndex(){
        return "sys-order server success";
    }
}

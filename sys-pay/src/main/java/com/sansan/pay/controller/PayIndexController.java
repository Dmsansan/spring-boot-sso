package com.sansan.pay.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author siss
 * @date 2020/9/9  15:17
 */
@RestController
@RequestMapping(value = "/pay")
public class PayIndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map payIndex(){
        Map<String, String> resultMap = new HashMap<String, String>(1);
        resultMap.put("data", "sys-pay server success");
        return resultMap;
    }
}

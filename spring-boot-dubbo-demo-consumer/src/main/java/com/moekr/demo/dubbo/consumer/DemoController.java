package com.moekr.demo.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.moekr.demo.dubbo.protocol.DemoObject;
import com.moekr.demo.dubbo.protocol.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @Reference(version = "1.0.0")
    private DemoService service;

    @GetMapping("/{id}")
    public Map<String, Object> request(@PathVariable int id) {
        DemoObject object = service.request(id);
        Map<String, Object> response = new HashMap<>();
        if (object != null) {
            response.put("err", 0);
            response.put("res", object);
        } else {
            response.put("err", 100);
            response.put("msg", "no result");
        }
        return response;
    }
}

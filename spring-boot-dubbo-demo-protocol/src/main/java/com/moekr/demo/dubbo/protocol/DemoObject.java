package com.moekr.demo.dubbo.protocol;

import lombok.Data;

import java.io.Serializable;

@Data
public class DemoObject implements Serializable {
    private Integer id;
    private String value;
}

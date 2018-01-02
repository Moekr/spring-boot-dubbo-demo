package com.moekr.demo.dubbo.producer;

import com.alibaba.dubbo.config.annotation.Service;
import com.moekr.demo.dubbo.protocol.DemoObject;
import com.moekr.demo.dubbo.protocol.DemoService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    private static final Log LOG = LogFactory.getLog(DemoServiceImpl.class);

    public DemoServiceImpl() {
        LOG.info("Create DemoServiceImpl instance");
    }

    @Override
    public DemoObject request(int id) {
        LOG.info("Get request with param " + id);
        if (id > 0 && id < 1000) {
            DemoObject object = new DemoObject();
            object.setId(id);
            object.setValue(DigestUtils.md5Hex(String.valueOf(id)));
            return object;
        } else {
            return null;
        }
    }
}

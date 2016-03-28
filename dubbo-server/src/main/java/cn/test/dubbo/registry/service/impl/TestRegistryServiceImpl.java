package cn.test.dubbo.registry.service.impl;

import cn.test.dubbo.registry.service.TestRegistryService;
import org.springframework.stereotype.Service;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello" + name;
    }
}
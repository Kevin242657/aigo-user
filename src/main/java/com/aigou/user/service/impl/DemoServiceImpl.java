package com.aigou.user.service.impl;

import com.aigou.user.dao.DemoDao;
import com.aigou.user.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public String demo() {
        return demoDao.demo();
    }
}

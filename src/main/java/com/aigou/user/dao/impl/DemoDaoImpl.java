package com.aigou.user.dao.impl;

import com.aigou.user.dao.DemoDao;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDaoImpl implements DemoDao {

    @Override
    public String demo() {
        return "666666";
    }
}

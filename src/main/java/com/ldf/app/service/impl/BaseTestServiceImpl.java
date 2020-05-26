package com.ldf.app.service.impl;

import com.ldf.app.domain.BaseTestVo;
import com.ldf.app.service.BaseTestService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author lidefu
 * @date 2020年05月25日19:14
 **/
@Service
public class BaseTestServiceImpl implements BaseTestService {

    @Override
    public Object test() {
        BaseTestVo testVo = new BaseTestVo();
        testVo.setId(1);
        testVo.setName("张三");
        testVo.setNow(new Date());
        return testVo;
    }

}

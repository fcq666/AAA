package com.cq.service.impl;

import com.cq.logmapper.LogInfoMapper;
import com.cq.model.LogInfo;
import com.cq.model.OrderInfo;
import com.cq.ordermapper.OrderInfoMapper;
import com.cq.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 作者:传奇
 * 包名:com.cq.service.impl
 * 创建时间:2019/7/19 10:53
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private LogInfoMapper logInfoMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    /**
     * 增加订单测试事务
     * @param orderInfo
     */
    @Override
    public void save(OrderInfo orderInfo) {
        //增加订单
        int acount = orderInfoMapper.add(orderInfo);

        System.out.println("增加订单，受影响行数="+acount);

        //增加日志记录
        int lcount = logInfoMapper.add(new LogInfo((int)(Math.random()*10000),new Date(),"测试事务。。。。。"));
        System.out.println("增加日志，受影响行数="+lcount);

        //制造异常
        /*int q=10/0;*/
    }
}

package com.cq;

import com.cq.model.OrderInfo;
import com.cq.service.OrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 作者:传奇
 * 包名:com.cq
 * 创建时间:2019/7/19 10:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring.xml")
public class AtomikosTest {

    @Autowired
    private OrderInfoService orderInfoService;


    /***
     * 事务测试
     */
    @Test
    public void testTransaction(){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setAddress("深圳市");
        orderInfo.setCreateTime(new Date());
        orderInfo.setId(1);
        orderInfo.setMoney(99d);
        orderInfo.setUserid("zhangsan");

        orderInfoService.save(orderInfo);
        System.out.println("1111111111111111111");
    }
}

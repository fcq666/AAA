package com.cq.service;

import com.cq.model.OrderInfo;

/**
 * 作者:传奇
 * 包名:com.cq.service
 * 创建时间:2019/7/19 10:53
 */
public interface OrderInfoService {
    /**
     * 增加订单测试事务
     * @param orderInfo
     */
    void save(OrderInfo orderInfo);
}

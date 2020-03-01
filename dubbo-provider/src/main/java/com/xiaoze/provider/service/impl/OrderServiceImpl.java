package com.xiaoze.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoze.api.entity.Orders;
import com.xiaoze.api.service.OrdersService;
import com.xiaoze.provider.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> findOrdersByUserId(String id) {
        return ordersMapper.findOrdersByUserId(id);
    }
}

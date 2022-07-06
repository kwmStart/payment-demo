package com.kwm.paymentdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kwm.paymentdemo.entity.OrderInfo;
import com.kwm.paymentdemo.mapper.OrderInfoMapper;
import com.kwm.paymentdemo.service.OrderInfoService;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}

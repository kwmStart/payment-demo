package com.kwm.paymentdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kwm.paymentdemo.entity.PaymentInfo;
import com.kwm.paymentdemo.mapper.PaymentInfoMapper;
import com.kwm.paymentdemo.service.PaymentInfoService;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}

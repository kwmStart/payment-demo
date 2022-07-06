package com.kwm.paymentdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kwm.paymentdemo.entity.RefundInfo;
import com.kwm.paymentdemo.mapper.RefundInfoMapper;
import com.kwm.paymentdemo.service.RefundInfoService;
import org.springframework.stereotype.Service;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {

}

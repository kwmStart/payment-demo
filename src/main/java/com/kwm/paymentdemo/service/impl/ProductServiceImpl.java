package com.kwm.paymentdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kwm.paymentdemo.entity.Product;
import com.kwm.paymentdemo.mapper.ProductMapper;
import com.kwm.paymentdemo.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}

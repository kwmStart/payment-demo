package com.kwm.paymentdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_product")
public class Product extends BaseEntity{
    //商品名称
    private String title;
    //价格（分）
    private Integer price;
}

package com.kwm.paymentdemo.controller;

import com.kwm.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName ProductContrroller
 * @Description 商品接口
 * @Author kwm
 * @Date 2022/2/5 20:08
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("/api/product")
public class ProductContrroller {

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public R test(){
        return R.ok().data("msg","成功").data("now",new Date());
    }
}

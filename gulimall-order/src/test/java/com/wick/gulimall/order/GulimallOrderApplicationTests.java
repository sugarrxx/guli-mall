package com.wick.gulimall.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wick.common.utils.PageUtils;
import com.wick.gulimall.order.entity.OrderEntity;
import com.wick.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Resource
    private OrderService orderService;

    @Test
    void contextLoads() {

        List<OrderEntity> list = orderService.list(new QueryWrapper<OrderEntity>().eq("id", 1L));
        for (OrderEntity orderEntity : list) {
            System.out.println(orderEntity);
        }
    }

}

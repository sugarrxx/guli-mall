package com.wick.gulimall.order.dao;

import com.wick.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lxx
 * @email lxx@gmail.com
 * @date 2021-11-19 15:51:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

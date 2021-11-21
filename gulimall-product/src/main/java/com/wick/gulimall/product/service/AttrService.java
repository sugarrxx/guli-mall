package com.wick.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wick.common.utils.PageUtils;
import com.wick.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lxx
 * @email ${email}
 * @date 2021-11-20 17:03:41
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


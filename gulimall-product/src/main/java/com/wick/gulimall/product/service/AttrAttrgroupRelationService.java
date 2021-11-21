package com.wick.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wick.common.utils.PageUtils;
import com.wick.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lxx
 * @email ${email}
 * @date 2021-11-20 17:03:41
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.wick.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wick.common.utils.PageUtils;
import com.wick.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author lxx
 * @email ${email}
 * @date 2021-11-20 17:20:01
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


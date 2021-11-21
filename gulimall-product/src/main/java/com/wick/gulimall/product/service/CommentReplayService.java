package com.wick.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wick.common.utils.PageUtils;
import com.wick.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author lxx
 * @email ${email}
 * @date 2021-11-20 17:03:41
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


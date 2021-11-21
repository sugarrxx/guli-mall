package com.wick.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wick.common.utils.PageUtils;
import com.wick.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lxx
 * @email ${email}
 * @date 2021-11-20 17:11:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


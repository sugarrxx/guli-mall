package com.wick.gulimall.member.dao;

import com.wick.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lxx
 * @email ${email}
 * @date 2021-11-20 17:11:04
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

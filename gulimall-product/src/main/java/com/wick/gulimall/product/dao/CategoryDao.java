package com.wick.gulimall.product.dao;

import com.wick.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lxx
 * @email ${email}
 * @date 2021-11-20 17:03:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

package com.example.springboot_tool.dao;

import com.example.springboot_tool.entity.Claim;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单主表(Claim)表数据库访问层
 *
 * @author 君颜未改
 * @since 2024-12-23 23:06:39
 */
@Mapper
public interface ClaimDao extends BaseMapper<Claim> {
}

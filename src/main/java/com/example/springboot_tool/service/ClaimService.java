package com.example.springboot_tool.service;

import java.math.BigInteger;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboot_tool.entity.Claim;
import com.example.springboot_tool.utils.Result;
import java.util.List;

/**
 * 
 * @author 君颜未改
 * @since 2024-12-23 23:31:41
 */
public interface ClaimService {
    Claim queryById(BigInteger id);

    IPage<Claim> queryByPage(Claim claim, Integer pageNum, Integer pageSize);

    Result insert(Claim claim);

    Result update(Claim claim);

    Result deleteById(BigInteger id);
}

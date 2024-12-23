package com.example.springboot_tool.service.impl;

import java.math.BigInteger;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot_tool.entity.Claim;
import com.example.springboot_tool.dao.ClaimDao;
import com.example.springboot_tool.service.ClaimService;
import com.example.springboot_tool.utils.Result;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 君颜未改
 * @since 2024-12-23 23:36:18
 */
@Service("claimService")
public class ClaimServiceImpl implements ClaimService {
    @Autowired
    private ClaimDao claimDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Claim queryById(BigInteger id) {
        return claimDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param claim 筛选条件
     * pageNum
     * pageSize
     * @return 查询结果
     */
    @Override
    public List<Claim> queryByPage(Claim claim, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<Claim> queryWrapper = new QueryWrapper<>();
        List<Claim> list = claimDao.selectList(queryWrapper);
        return list;
    }

    /**
     * 新增数据
     *
     * @param claim 实例对象
     * @return 实例对象
     */
    @Override
    public Result insert(Claim claim) {
        int num = claimDao.insert(claim);
        if (num > 0) {
            return Result.success();
        }
        return Result.error();
    }

    /**
     * 修改数据
     *
     * @param claim 实例对象
     * @return 实例对象
     */
    @Override
    public Result update(Claim claim) {
        int num = claimDao.updateById(claim);
        return Result.success();
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public Result deleteById(BigInteger id) {
        return claimDao.deleteById(id) > 0 ? Result.success() : Result.error();
    }
}

package com.example.springboot_tool.controller;

import com.example.springboot_tool.entity.Claim;
import com.example.springboot_tool.service.ClaimService;
import com.example.springboot_tool.utils.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

/**
 * 订单主表(Claim)表控制层
 *
 * @author 君颜未改
 * @since 2024-12-23 23:17:37
 */
@RestController
@RequestMapping("claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @ApiOperation("分页查询")
    @PostMapping("/page")
    public Result<List<Claim>> queryByPage(@RequestBody Claim claim, @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return Result.success(claimService.queryByPage(claim, pageNum, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @PostMapping("queryById")
    public Result<Claim> queryById(@RequestParam("id") BigInteger id) {
        return Result.success(claimService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param claim 实体
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/add")
    public Result add(@RequestBody Claim claim) {
        return claimService.insert(claim);
    }

    /**
     * 编辑数据
     *
     * @param claim 实体
     * @return 编辑结果
     */
    @ApiOperation("编辑数据")
    @PostMapping("/edit")
    public Result edit(@RequestBody Claim claim) {
        return claimService.update(claim);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @ApiOperation("删除数据")
    @PostMapping("/deleteById")
    public Result deleteById(@RequestParam("id") BigInteger id) {
        return claimService.deleteById(id);
    }

}

package com.example.springboot_tool.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 订单主表(Claim)实体类
 *
 * @author 君颜未改
 * @since 2024-12-24 00:05:31
 */
@Data
@TableName(value = "t_claim")
public class Claim {
    @ApiModelProperty(value = "ID", example = "")
    @TableId(value = "id", type = IdType.AUTO)
    private BigInteger id;
    
    @ApiModelProperty(value = "订单号", example = "")
    @TableField("claim_no")
    private String claimNo;
    
    @ApiModelProperty(value = "商品名称", example = "")
    @TableField("claim_name")
    private String claimName;
    
    @ApiModelProperty(value = "下单人ID", example = "")
    @TableField("emp_id")
    private String empId;
    
    @ApiModelProperty(value = "下单人名称", example = "")
    @TableField("emp_name")
    private String empName;
    
    @ApiModelProperty(value = "订单金额", example = "")
    @TableField("amount")
    private BigDecimal amount;
    
    @ApiModelProperty(value = "创建人", example = "")
    @TableField("create_by")
    private String createBy;
    
    @ApiModelProperty(value = "创建时间", example = "")
    @TableField("create_time")
    private Date createTime;
    
    @ApiModelProperty(value = "更新人", example = "")
    @TableField("update_by")
    private String updateBy;
    
    @ApiModelProperty(value = "更新时间", example = "")
    @TableField("update_time")
    private Date updateTime;
    
    @ApiModelProperty(value = "是否删除", example = "")
    @TableField("is_del")
    private String isDel;
    
}

package com.example.springboot_tool.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 订单主表(Claim)Dto
 *
 * @author 君颜未改
 * @since 2024-12-23 23:06:40
 */
@Data
public class ClaimDto {
    @ApiModelProperty(value = "ID", example = "")
    private BigInteger id;
    
    @ApiModelProperty(value = "订单号", example = "")
    private String claimNo;
    
    @ApiModelProperty(value = "商品名称", example = "")
    private String claimName;
    
    @ApiModelProperty(value = "下单人ID", example = "")
    private String empId;
    
    @ApiModelProperty(value = "下单人名称", example = "")
    private String empName;
    
    @ApiModelProperty(value = "订单金额", example = "")
    private BigDecimal amount;
    
    @ApiModelProperty(value = "创建人", example = "")
    private String createBy;
    
    @ApiModelProperty(value = "创建时间", example = "")
    private Date createTime;
    
    @ApiModelProperty(value = "更新人", example = "")
    private String updateBy;
    
    @ApiModelProperty(value = "更新时间", example = "")
    private Date updateTime;
    
    @ApiModelProperty(value = "是否删除", example = "")
    private String isDel;
    

}

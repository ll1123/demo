package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**   
 * @Title: t_trade_order
 * @Description: t_trade_order
 * @author heshibo
 * @date 2019-03-13 18:33:54
 * @version V1.0   
 *
 */
@TableName("t_trade_order")
@SuppressWarnings("serial")
@Data
public class TradeOrder {

    /**清分结算机构流水号*/
    @TableId(value = "order_no", type = IdType.UUID)
	private String id;
    /**收单机构流水号(商户订单号)*/
    @TableField(value = "acquirer_inst_num")
	private String acquirerInstNum;
    /**收单机构受理日期(实际扫码时间)*/
    @TableField(value = "acquirer_inst_date")
	private String acquirerInstDate;
    /**计费类型
0：单次消费
1：复合消费*/
    @TableField(value = "charge_type")
	private Integer chargeType;
    /**清算机构代码*/
    @TableField(value = "clear_inst_code")
	private String clearInstCode;
    /**收单机构代码*/
    @TableField(value = "acquire_inst_code")
	private String acquireInstCode;
    /**发卡地通卡公司代码(发卡机构)*/
    @TableField(value = "issuer_inst_code")
	private String issuerInstCode;
    /**APP商户号*/
    @TableField(value = "merchant_no")
	private String merchantNo;
    /**用户号*/
    @TableField(value = "member_no")
	private String memberNo;
    /**电子卡号*/
    @TableField(value = "card_no")
	private String cardNo;
    /*区域号*/
    @TableField(value = "area_no")
    private String areaNo;
    /*区域名称*/
    @TableField(value = "area_name")
    private String areaName;
    /**交易金额，单位：分*/
    @TableField(value = "total_amt")
	private String totalAmt;
    /**订单状态
0：未缴费
1：已缴费*/
    @TableField(value = "status")
	private Integer status;
    /**订单时间*/
    @TableField(value = "order_time")
	private Date orderTime;
    /**来源类型
1：http
2：ftp
3：socket*/
    @TableField(value = "source_type")
	private Integer sourceType;
    /**个性化数据*/
    @TableField(value = "tlv_data")
	private String tlvData;
    /**原始交易数据*/
    @TableField(value = "record")
	private String record;
    /**备注*/
    @TableField(value = "remark")
	private String remark;
    /**创建时间*/
    @TableField(value = "create_date",fill = FieldFill.INSERT)
	private Date createDate;
    /**更新时间*/
    @TableField(value = "update_date",fill = FieldFill.UPDATE)
	private Date updateDate;
	

}

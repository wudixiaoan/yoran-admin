package com.yoran.admin.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OmsReturnOrderRebate implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "退货单ID")
    private Integer returnOrderId;

    @ApiModelProperty(value = "退货单编号")
    private String returnOrderSn;

    @ApiModelProperty(value = "商品ID")
    private Integer rebateId;

    @ApiModelProperty(value = "商品图片")
    private String rebatePic;

    @ApiModelProperty(value = "商品名称")
    private String rebateName;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal price;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "返利总价")
    private BigDecimal rebateAmount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReturnOrderId() {
        return returnOrderId;
    }

    public void setReturnOrderId(Integer returnOrderId) {
        this.returnOrderId = returnOrderId;
    }

    public String getReturnOrderSn() {
        return returnOrderSn;
    }

    public void setReturnOrderSn(String returnOrderSn) {
        this.returnOrderSn = returnOrderSn;
    }

    public Integer getRebateId() {
        return rebateId;
    }

    public void setRebateId(Integer rebateId) {
        this.rebateId = rebateId;
    }

    public String getRebatePic() {
        return rebatePic;
    }

    public void setRebatePic(String rebatePic) {
        this.rebatePic = rebatePic;
    }

    public String getRebateName() {
        return rebateName;
    }

    public void setRebateName(String rebateName) {
        this.rebateName = rebateName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRebateAmount() {
        return rebateAmount;
    }

    public void setRebateAmount(BigDecimal rebateAmount) {
        this.rebateAmount = rebateAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", returnOrderId=").append(returnOrderId);
        sb.append(", returnOrderSn=").append(returnOrderSn);
        sb.append(", rebateId=").append(rebateId);
        sb.append(", rebatePic=").append(rebatePic);
        sb.append(", rebateName=").append(rebateName);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", rebateAmount=").append(rebateAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
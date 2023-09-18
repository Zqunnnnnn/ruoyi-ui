package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公寓管理对象 sys_apartment
 *
 * @author zq
 * @date 2023-09-14
 */
public class SysApartment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 房ID */
    private Long apartmentId;

    /** 楼ID */
    @Excel(name = "楼ID")
    private Long buildingId;

    /** 房名 */
    @Excel(name = "房名")
    private String apartmentName;

    /** 一日房价 */
    @Excel(name = "一日房价")
    private BigDecimal apartmentPrice;

    /** 状态（1可用） */
    @Excel(name = "状态", readConverterExp = "1=可用")
    private String status;

    public void setApartmentId(Long apartmentId)
    {
        this.apartmentId = apartmentId;
    }

    public Long getApartmentId()
    {
        return apartmentId;
    }
    public void setBuildingId(Long buildingId)
    {
        this.buildingId = buildingId;
    }



    public Long getBuildingId()
    {
        return buildingId;
    }
    public void setApartmentName(String apartmentName)
    {
        this.apartmentName = apartmentName;
    }

    public String getApartmentName()
    {
        return apartmentName;
    }
    public void setApartmentPrice(BigDecimal apartmentPrice)
    {
        this.apartmentPrice = apartmentPrice;
    }

    public BigDecimal getApartmentPrice()
    {
        return apartmentPrice;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("apartmentId", getApartmentId())
            .append("buildingId", getBuildingId())
            .append("apartmentName", getApartmentName())
            .append("apartmentPrice", getApartmentPrice())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}

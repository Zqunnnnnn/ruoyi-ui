package com.ruoyi.system.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 大楼管理对象 sys_building
 * 
 * @author zq
 * @date 2023-09-14
 */
public class SysBuilding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 楼ID */
    private Long buildingId;

    /** 楼名 */
    @Excel(name = "楼名")
    private String buildingName;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 公寓管理信息 */
    private List<SysApartment> sysApartmentList;

    public void setBuildingId(Long buildingId) 
    {
        this.buildingId = buildingId;
    }

    public Long getBuildingId() 
    {
        return buildingId;
    }
    public void setBuildingName(String buildingName) 
    {
        this.buildingName = buildingName;
    }

    public String getBuildingName() 
    {
        return buildingName;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public List<SysApartment> getSysApartmentList()
    {
        return sysApartmentList;
    }

    public void setSysApartmentList(List<SysApartment> sysApartmentList)
    {
        this.sysApartmentList = sysApartmentList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("buildingId", getBuildingId())
            .append("buildingName", getBuildingName())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("sysApartmentList", getSysApartmentList())
            .toString();
    }
}

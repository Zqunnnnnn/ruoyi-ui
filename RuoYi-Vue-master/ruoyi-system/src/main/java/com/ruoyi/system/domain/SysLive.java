package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 入住管理对象 sys_live
 * 
 * @author zq
 * @date 2023-09-14
 */
public class SysLive extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 入住单号 */
    private Long liveId;

    /** 入住房间号 */
    @Excel(name = "入住房间号")
    private Long apartemntId;

    /** 入住用户号 */
    @Excel(name = "入住用户号")
    private Long userId;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private String totalPay;

    public void setLiveId(Long liveId) 
    {
        this.liveId = liveId;
    }

    public Long getLiveId() 
    {
        return liveId;
    }
    public void setApartemntId(Long apartemntId) 
    {
        this.apartemntId = apartemntId;
    }

    public Long getApartemntId() 
    {
        return apartemntId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setTotalPay(String totalPay) 
    {
        this.totalPay = totalPay;
    }

    public String getTotalPay() 
    {
        return totalPay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("liveId", getLiveId())
            .append("apartemntId", getApartemntId())
            .append("userId", getUserId())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("totalPay", getTotalPay())
            .toString();
    }
}

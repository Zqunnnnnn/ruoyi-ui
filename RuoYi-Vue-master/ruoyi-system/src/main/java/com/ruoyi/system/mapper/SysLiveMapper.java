package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysLive;

/**
 * 入住管理Mapper接口
 * 
 * @author zq
 * @date 2023-09-14
 */
public interface SysLiveMapper 
{
    /**
     * 查询入住管理
     * 
     * @param liveId 入住管理主键
     * @return 入住管理
     */
    public SysLive selectSysLiveByLiveId(Long liveId);

    /**
     * 查询入住管理列表
     * 
     * @param sysLive 入住管理
     * @return 入住管理集合
     */
    public List<SysLive> selectSysLiveList(SysLive sysLive);

    /**
     * 新增入住管理
     * 
     * @param sysLive 入住管理
     * @return 结果
     */
    public int insertSysLive(SysLive sysLive);

    /**
     * 修改入住管理
     * 
     * @param sysLive 入住管理
     * @return 结果
     */
    public int updateSysLive(SysLive sysLive);

    /**
     * 删除入住管理
     * 
     * @param liveId 入住管理主键
     * @return 结果
     */
    public int deleteSysLiveByLiveId(Long liveId);

    /**
     * 批量删除入住管理
     * 
     * @param liveIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysLiveByLiveIds(Long[] liveIds);
}

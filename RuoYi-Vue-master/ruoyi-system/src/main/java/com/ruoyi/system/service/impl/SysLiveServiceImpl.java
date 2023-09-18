package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysLiveMapper;
import com.ruoyi.system.domain.SysLive;
import com.ruoyi.system.service.ISysLiveService;

/**
 * 入住管理Service业务层处理
 * 
 * @author zq
 * @date 2023-09-14
 */
@Service
public class SysLiveServiceImpl implements ISysLiveService 
{
    @Autowired
    private SysLiveMapper sysLiveMapper;

    /**
     * 查询入住管理
     * 
     * @param liveId 入住管理主键
     * @return 入住管理
     */
    @Override
    public SysLive selectSysLiveByLiveId(Long liveId)
    {
        return sysLiveMapper.selectSysLiveByLiveId(liveId);
    }

    /**
     * 查询入住管理列表
     * 
     * @param sysLive 入住管理
     * @return 入住管理
     */
    @Override
    public List<SysLive> selectSysLiveList(SysLive sysLive)
    {
        return sysLiveMapper.selectSysLiveList(sysLive);
    }

    /**
     * 新增入住管理
     * 
     * @param sysLive 入住管理
     * @return 结果
     */
    @Override
    public int insertSysLive(SysLive sysLive)
    {
        return sysLiveMapper.insertSysLive(sysLive);
    }

    /**
     * 修改入住管理
     * 
     * @param sysLive 入住管理
     * @return 结果
     */
    @Override
    public int updateSysLive(SysLive sysLive)
    {
        return sysLiveMapper.updateSysLive(sysLive);
    }

    /**
     * 批量删除入住管理
     * 
     * @param liveIds 需要删除的入住管理主键
     * @return 结果
     */
    @Override
    public int deleteSysLiveByLiveIds(Long[] liveIds)
    {
        return sysLiveMapper.deleteSysLiveByLiveIds(liveIds);
    }

    /**
     * 删除入住管理信息
     * 
     * @param liveId 入住管理主键
     * @return 结果
     */
    @Override
    public int deleteSysLiveByLiveId(Long liveId)
    {
        return sysLiveMapper.deleteSysLiveByLiveId(liveId);
    }
}

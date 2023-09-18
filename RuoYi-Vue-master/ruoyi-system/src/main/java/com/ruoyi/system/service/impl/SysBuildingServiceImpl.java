package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.system.domain.SysApartment;
import com.ruoyi.system.mapper.SysBuildingMapper;
import com.ruoyi.system.domain.SysBuilding;
import com.ruoyi.system.service.ISysBuildingService;

/**
 * 大楼管理Service业务层处理
 *
 * @author zq
 * @date 2023-09-14
 */
@Service
public class SysBuildingServiceImpl implements ISysBuildingService
{
    @Autowired
    private SysBuildingMapper sysBuildingMapper;

    /**
     * 查询大楼管理
     *
     * @param buildingId 大楼管理主键
     * @return 大楼管理
     */
    @Override
    public SysBuilding selectSysBuildingByBuildingId(Long buildingId)
    {
        return sysBuildingMapper.selectSysBuildingByBuildingId(buildingId);
    }

    /**
     * 查询大楼管理列表
     *
     * @param sysBuilding 大楼管理
     * @return 大楼管理
     */
    @Override
    public List<SysBuilding> selectSysBuildingList(SysBuilding sysBuilding)
    {
        return sysBuildingMapper.selectSysBuildingList(sysBuilding);
    }

    /**
     * 新增大楼管理
     *
     * @param sysBuilding 大楼管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertSysBuilding(SysBuilding sysBuilding)
    {
        sysBuilding.setCreateTime(DateUtils.getNowDate());
        int rows = sysBuildingMapper.insertSysBuilding(sysBuilding);
        insertSysApartment(sysBuilding);
        return rows;
    }

    /**
     * 修改大楼管理
     *
     * @param sysBuilding 大楼管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateSysBuilding(SysBuilding sysBuilding)
    {
        sysBuilding.setUpdateTime(DateUtils.getNowDate());
        sysBuildingMapper.deleteSysApartmentByBuildingId(sysBuilding.getBuildingId());
        insertSysApartment(sysBuilding);
        return sysBuildingMapper.updateSysBuilding(sysBuilding);
    }

    /**
     * 批量删除大楼管理
     *
     * @param buildingIds 需要删除的大楼管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSysBuildingByBuildingIds(Long[] buildingIds)
    {
        sysBuildingMapper.deleteSysApartmentByBuildingIds(buildingIds);
        return sysBuildingMapper.deleteSysBuildingByBuildingIds(buildingIds);
    }

    /**
     * 删除大楼管理信息
     *
     * @param buildingId 大楼管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSysBuildingByBuildingId(Long buildingId)
    {
        sysBuildingMapper.deleteSysApartmentByBuildingId(buildingId);
        return sysBuildingMapper.deleteSysBuildingByBuildingId(buildingId);
    }

    /**
     * 新增公寓管理信息
     *
     * @param sysBuilding 大楼管理对象
     */
    public void insertSysApartment(SysBuilding sysBuilding)
    {
        List<SysApartment> sysApartmentList = sysBuilding.getSysApartmentList();
        Long buildingId = sysBuilding.getBuildingId();
        if (StringUtils.isNotNull(sysApartmentList))
        {
            List<SysApartment> list = new ArrayList<SysApartment>();
            for (SysApartment sysApartment : sysApartmentList)
            {
                sysApartment.setBuildingId(buildingId);
                list.add(sysApartment);
            }
            if (list.size() > 0)
            {
                sysBuildingMapper.batchSysApartment(list);
            }
        }
    }
}

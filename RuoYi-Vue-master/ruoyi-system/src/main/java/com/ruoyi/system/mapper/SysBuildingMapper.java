package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysBuilding;
import com.ruoyi.system.domain.SysApartment;

/**
 * 大楼管理Mapper接口
 * 
 * @author zq
 * @date 2023-09-14
 */
public interface SysBuildingMapper 
{
    /**
     * 查询大楼管理
     * 
     * @param buildingId 大楼管理主键
     * @return 大楼管理
     */
    public SysBuilding selectSysBuildingByBuildingId(Long buildingId);

    /**
     * 查询大楼管理列表
     * 
     * @param sysBuilding 大楼管理
     * @return 大楼管理集合
     */
    public List<SysBuilding> selectSysBuildingList(SysBuilding sysBuilding);

    /**
     * 新增大楼管理
     * 
     * @param sysBuilding 大楼管理
     * @return 结果
     */
    public int insertSysBuilding(SysBuilding sysBuilding);

    /**
     * 修改大楼管理
     * 
     * @param sysBuilding 大楼管理
     * @return 结果
     */
    public int updateSysBuilding(SysBuilding sysBuilding);

    /**
     * 删除大楼管理
     * 
     * @param buildingId 大楼管理主键
     * @return 结果
     */
    public int deleteSysBuildingByBuildingId(Long buildingId);

    /**
     * 批量删除大楼管理
     * 
     * @param buildingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysBuildingByBuildingIds(Long[] buildingIds);

    /**
     * 批量删除公寓管理
     * 
     * @param buildingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysApartmentByBuildingIds(Long[] buildingIds);
    
    /**
     * 批量新增公寓管理
     * 
     * @param sysApartmentList 公寓管理列表
     * @return 结果
     */
    public int batchSysApartment(List<SysApartment> sysApartmentList);
    

    /**
     * 通过大楼管理主键删除公寓管理信息
     * 
     * @param buildingId 大楼管理ID
     * @return 结果
     */
    public int deleteSysApartmentByBuildingId(Long buildingId);
}

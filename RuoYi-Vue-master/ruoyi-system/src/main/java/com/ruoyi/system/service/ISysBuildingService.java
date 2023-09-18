package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysBuilding;
import org.springframework.stereotype.Service;

/**
 * 大楼管理Service接口
 *
 * @author zq
 * @date 2023-09-14
 */
@Service
public interface ISysBuildingService
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
     * 批量删除大楼管理
     *
     * @param buildingIds 需要删除的大楼管理主键集合
     * @return 结果
     */
    public int deleteSysBuildingByBuildingIds(Long[] buildingIds);

    /**
     * 删除大楼管理信息
     *
     * @param buildingId 大楼管理主键
     * @return 结果
     */
    public int deleteSysBuildingByBuildingId(Long buildingId);
}

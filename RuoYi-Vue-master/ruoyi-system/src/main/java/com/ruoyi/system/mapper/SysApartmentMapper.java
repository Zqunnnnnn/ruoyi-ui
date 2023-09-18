package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysApartment;

/**
 * 公寓管理Mapper接口
 * 
 * @author zq
 * @date 2023-09-14
 */
public interface SysApartmentMapper 
{
    /**
     * 查询公寓管理
     * 
     * @param apartmentId 公寓管理主键
     * @return 公寓管理
     */
    public SysApartment selectSysApartmentByApartmentId(Long apartmentId);

    /**
     * 查询公寓管理列表
     * 
     * @param sysApartment 公寓管理
     * @return 公寓管理集合
     */
    public List<SysApartment> selectSysApartmentList(SysApartment sysApartment);

    /**
     * 新增公寓管理
     * 
     * @param sysApartment 公寓管理
     * @return 结果
     */
    public int insertSysApartment(SysApartment sysApartment);

    /**
     * 修改公寓管理
     * 
     * @param sysApartment 公寓管理
     * @return 结果
     */
    public int updateSysApartment(SysApartment sysApartment);

    /**
     * 删除公寓管理
     * 
     * @param apartmentId 公寓管理主键
     * @return 结果
     */
    public int deleteSysApartmentByApartmentId(Long apartmentId);

    /**
     * 批量删除公寓管理
     * 
     * @param apartmentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysApartmentByApartmentIds(Long[] apartmentIds);
}

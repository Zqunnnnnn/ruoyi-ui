package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.system.domain.SysApartment;

/**
 * 公寓管理Service接口
 *
 * @author zq
 * @date 2023-09-14
 */
public interface ISysApartmentService
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
     * 批量删除公寓管理
     *
     * @param apartmentIds 需要删除的公寓管理主键集合
     * @return 结果
     */
    public int deleteSysApartmentByApartmentIds(Long[] apartmentIds);

    /**
     * 删除公寓管理信息
     *
     * @param apartmentId 公寓管理主键
     * @return 结果
     */
    public int deleteSysApartmentByApartmentId(Long apartmentId);

    /**
     * 更新公寓状态
     * @param apartment
     * @return
     */


    public int updateApartmentStatus(SysApartment apartment);

    /**
     * 校验是否是可操作角色
     * @param apartment
     */
    public void checkApartmentAllowed(SysApartment apartment);

    /**
     * 校验角色是否有数据权限
     *
     * @param apartmentId 角色id
     */
    public void checkApartmentDataScope(Long apartmentId);

}

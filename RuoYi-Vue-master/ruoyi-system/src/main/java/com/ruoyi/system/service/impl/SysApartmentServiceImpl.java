package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.spring.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysApartmentMapper;
import com.ruoyi.system.domain.SysApartment;
import com.ruoyi.system.service.ISysApartmentService;

/**
 * 公寓管理Service业务层处理
 *
 * @author zq
 * @date 2023-09-14
 */
@Service
public class SysApartmentServiceImpl implements ISysApartmentService
{
    @Autowired
    private SysApartmentMapper sysApartmentMapper;

    /**
     * 查询公寓管理
     *
     * @param apartmentId 公寓管理主键
     * @return 公寓管理
     */
    @Override
    public SysApartment selectSysApartmentByApartmentId(Long apartmentId)
    {
        return sysApartmentMapper.selectSysApartmentByApartmentId(apartmentId);
    }

    /**
     * 查询公寓管理列表
     *
     * @param sysApartment 公寓管理
     * @return 公寓管理
     */
    @Override
    public List<SysApartment> selectSysApartmentList(SysApartment sysApartment)
    {
        return sysApartmentMapper.selectSysApartmentList(sysApartment);
    }

    /**
     * 新增公寓管理
     *
     * @param sysApartment 公寓管理
     * @return 结果
     */
    @Override
    public int insertSysApartment(SysApartment sysApartment)
    {
        sysApartment.setCreateTime(DateUtils.getNowDate());
        return sysApartmentMapper.insertSysApartment(sysApartment);
    }

    /**
     * 修改公寓管理
     *
     * @param sysApartment 公寓管理
     * @return 结果
     */
    @Override
    public int updateSysApartment(SysApartment sysApartment)
    {
        sysApartment.setUpdateTime(DateUtils.getNowDate());
        return sysApartmentMapper.updateSysApartment(sysApartment);
    }

    /**
     * 批量删除公寓管理
     *
     * @param apartmentIds 需要删除的公寓管理主键
     * @return 结果
     */
    @Override
    public int deleteSysApartmentByApartmentIds(Long[] apartmentIds)
    {
        return sysApartmentMapper.deleteSysApartmentByApartmentIds(apartmentIds);
    }

    /**
     * 删除公寓管理信息
     *
     * @param apartmentId 公寓管理主键
     * @return 结果
     */
    @Override
    public int deleteSysApartmentByApartmentId(Long apartmentId)
    {
        return sysApartmentMapper.deleteSysApartmentByApartmentId(apartmentId);
    }

    @Override
    public int updateApartmentStatus(SysApartment apartment) {
        return sysApartmentMapper.updateSysApartment(apartment);
    }

    @Override
    public void checkApartmentAllowed(SysApartment apartment) {
        if (StringUtils.isNotNull(apartment.getApartmentId()))
        {
            throw new ServiceException("不允许操作超级管理员用户");
        }
    }

    @Override
    public void checkApartmentDataScope(Long apartmentId) {
        if (!SysUser.isAdmin(SecurityUtils.getUserId()))
        {
            SysApartment apartment = new SysApartment();
            apartment.setApartmentId(apartmentId);
            List<SysApartment> apartments = SpringUtils.getAopProxy(this).selectSysApartmentList(apartment);
            if (StringUtils.isEmpty(apartments))
            {
                throw new ServiceException("没有权限访问角色数据！");
            }
        }
    }
}

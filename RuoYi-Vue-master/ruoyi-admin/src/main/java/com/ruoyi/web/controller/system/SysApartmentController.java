package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.entity.SysRole;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysApartment;
import com.ruoyi.system.service.ISysApartmentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公寓管理Controller
 *
 * @author zq
 * @date 2023-09-14
 */
@RestController
@RequestMapping("/system/apartment")
public class SysApartmentController extends BaseController
{
    @Autowired
    private ISysApartmentService sysApartmentService;

    /**
     * 查询公寓管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:apartment:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysApartment sysApartment)
    {
        startPage();
        List<SysApartment> list = sysApartmentService.selectSysApartmentList(sysApartment);
        return getDataTable(list);
    }

    /**
     * 导出公寓管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:apartment:export')")
    @Log(title = "公寓管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysApartment sysApartment)
    {
        List<SysApartment> list = sysApartmentService.selectSysApartmentList(sysApartment);
        ExcelUtil<SysApartment> util = new ExcelUtil<SysApartment>(SysApartment.class);
        util.exportExcel(response, list, "公寓管理数据");
    }

    /**
     * 获取公寓管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:apartment:query')")
    @GetMapping(value = "/{apartmentId}")
    public AjaxResult getInfo(@PathVariable("apartmentId") Long apartmentId)
    {
        return success(sysApartmentService.selectSysApartmentByApartmentId(apartmentId));
    }

    /**
     * 新增公寓管理
     */
    @PreAuthorize("@ss.hasPermi('system:apartment:add')")
    @Log(title = "公寓管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysApartment sysApartment)
    {
        return toAjax(sysApartmentService.insertSysApartment(sysApartment));
    }

    /**
     * 修改公寓管理
     */
    @PreAuthorize("@ss.hasPermi('system:apartment:edit')")
    @Log(title = "公寓管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysApartment sysApartment)
    {
        return toAjax(sysApartmentService.updateSysApartment(sysApartment));
    }

    /**
     * 删除公寓管理
     */
    @PreAuthorize("@ss.hasPermi('system:apartment:remove')")
    @Log(title = "公寓管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{apartmentIds}")
    public AjaxResult remove(@PathVariable Long[] apartmentIds)
    {
        return toAjax(sysApartmentService.deleteSysApartmentByApartmentIds(apartmentIds));
    }

    /**
     * 修改公寓状态
     */
    @PreAuthorize("@ss.hasPermi('system:apartment:edit')")
    @Log(title = "公寓管理", businessType = BusinessType.UPDATE)
    @PutMapping("/changeStatus")
    public AjaxResult changeStatus(@RequestBody SysApartment apartment)
    {
        sysApartmentService.checkApartmentDataScope(apartment.getApartmentId());
        apartment.setUpdateBy(apartment.getApartmentName());
        return toAjax(sysApartmentService.updateApartmentStatus(apartment));
    }

}

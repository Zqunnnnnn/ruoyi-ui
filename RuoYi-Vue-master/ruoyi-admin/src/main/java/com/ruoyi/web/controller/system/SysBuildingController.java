package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.SysBuilding;
import com.ruoyi.system.service.ISysBuildingService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 大楼管理Controller
 *
 * @author zq
 * @date 2023-09-14
 */
@RestController
@RequestMapping("/system/building")
public class SysBuildingController extends BaseController
{
    @Autowired
    private ISysBuildingService sysBuildingService;

    /**
     * 查询大楼管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:building:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysBuilding sysBuilding)
    {
        startPage();
        List<SysBuilding> list = sysBuildingService.selectSysBuildingList(sysBuilding);
        return getDataTable(list);
    }

    /**
     * 导出大楼管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:building:export')")
    @Log(title = "大楼管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysBuilding sysBuilding)
    {
        List<SysBuilding> list = sysBuildingService.selectSysBuildingList(sysBuilding);
        ExcelUtil<SysBuilding> util = new ExcelUtil<SysBuilding>(SysBuilding.class);
        util.exportExcel(response, list, "大楼管理数据");
    }

    /**
     * 获取大楼管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:building:query')")
    @GetMapping(value = "/{buildingId}")
    public AjaxResult getInfo(@PathVariable("buildingId") Long buildingId)
    {
        return success(sysBuildingService.selectSysBuildingByBuildingId(buildingId));
    }

    /**
     * 新增大楼管理
     */
    @PreAuthorize("@ss.hasPermi('system:building:add')")
    @Log(title = "大楼管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysBuilding sysBuilding)
    {
        return toAjax(sysBuildingService.insertSysBuilding(sysBuilding));
    }

    /**
     * 修改大楼管理
     */
    @PreAuthorize("@ss.hasPermi('system:building:edit')")
    @Log(title = "大楼管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysBuilding sysBuilding)
    {
        return toAjax(sysBuildingService.updateSysBuilding(sysBuilding));
    }

    /**
     * 删除大楼管理
     */
    @PreAuthorize("@ss.hasPermi('system:building:remove')")
    @Log(title = "大楼管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{buildingIds}")
    public AjaxResult remove(@PathVariable Long[] buildingIds)
    {
        return toAjax(sysBuildingService.deleteSysBuildingByBuildingIds(buildingIds));
    }
}

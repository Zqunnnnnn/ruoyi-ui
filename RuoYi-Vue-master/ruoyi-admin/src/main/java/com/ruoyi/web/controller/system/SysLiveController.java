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
import com.ruoyi.system.domain.SysLive;
import com.ruoyi.system.service.ISysLiveService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 入住管理Controller
 *
 * @author zq
 * @date 2023-09-14
 */
@RestController
@RequestMapping("/system/live")
public class SysLiveController extends BaseController
{
    @Autowired
    private ISysLiveService sysLiveService;

    /**
     * 查询入住管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:live:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysLive sysLive)
    {
        startPage();
        List<SysLive> list = sysLiveService.selectSysLiveList(sysLive);
        return getDataTable(list);
    }

    /**
     * 导出入住管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:live:export')")
    @Log(title = "入住管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysLive sysLive)
    {
        List<SysLive> list = sysLiveService.selectSysLiveList(sysLive);
        ExcelUtil<SysLive> util = new ExcelUtil<SysLive>(SysLive.class);
        util.exportExcel(response, list, "入住管理数据");
    }

    /**
     * 获取入住管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:live:query')")
    @GetMapping(value = "/{liveId}")
    public AjaxResult getInfo(@PathVariable("liveId") Long liveId)
    {
        return success(sysLiveService.selectSysLiveByLiveId(liveId));
    }

    /**
     * 新增入住管理
     */
    @PreAuthorize("@ss.hasPermi('system:live:add')")
    @Log(title = "入住管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysLive sysLive)
    {
        return toAjax(sysLiveService.insertSysLive(sysLive));
    }

    /**
     * 修改入住管理
     */
    @PreAuthorize("@ss.hasPermi('system:live:edit')")
    @Log(title = "入住管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysLive sysLive)
    {
        return toAjax(sysLiveService.updateSysLive(sysLive));
    }

    /**
     * 删除入住管理
     */
    @PreAuthorize("@ss.hasPermi('system:live:remove')")
    @Log(title = "入住管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{liveIds}")
    public AjaxResult remove(@PathVariable Long[] liveIds)
    {
        return toAjax(sysLiveService.deleteSysLiveByLiveIds(liveIds));
    }
}

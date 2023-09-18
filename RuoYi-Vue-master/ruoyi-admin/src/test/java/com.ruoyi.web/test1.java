package com.ruoyi.web;


import com.ruoyi.system.domain.SysBuilding;
import com.ruoyi.system.mapper.SysBuildingMapper;
import com.ruoyi.system.service.ISysBuildingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class test1 {
    @Autowired
    private SysBuildingMapper mapper;

    @Test
    public void test(){
        List<SysBuilding> aprBuildings = mapper.selectSysBuildingList(null);
        System.out.println(aprBuildings);
    }
}

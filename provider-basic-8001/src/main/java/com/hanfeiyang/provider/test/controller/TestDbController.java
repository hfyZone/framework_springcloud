package com.hanfeiyang.provider.test.controller;


import com.hanfeiyang.provider.test.entity.TestDb;
import com.hanfeiyang.provider.test.service.ITestDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@RestController
@RequestMapping("/testDb/")
public class TestDbController {
    @Autowired
    public ITestDbService testDbService;

    @GetMapping("get")
    public List<TestDb> getDBs(){
        return testDbService.list();
    }
}


package com.hanfeiyang.provider.test.service.impl;

import com.hanfeiyang.provider.test.entity.TestDb;
import com.hanfeiyang.provider.test.mapper.TestDbMapper;
import com.hanfeiyang.provider.test.service.ITestDbService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@Service
public class TestDbServiceImpl extends ServiceImpl<TestDbMapper, TestDb> implements ITestDbService {

}

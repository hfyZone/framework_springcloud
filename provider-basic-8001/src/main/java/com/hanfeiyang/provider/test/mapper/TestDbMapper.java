package com.hanfeiyang.provider.test.mapper;

import com.hanfeiyang.provider.test.entity.TestDb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hanfeiyang
 * @since 2022-03-07
 */
@Repository
@Mapper
public interface TestDbMapper extends BaseMapper<TestDb> {

}

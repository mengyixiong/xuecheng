package com.liuzhuo.content.service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liuzhuo.base.model.PageParams;
import com.liuzhuo.base.model.PageResult;
import com.liuzhuo.content.model.dto.QueryCourseParamsDto;
import com.liuzhuo.content.model.po.CourseBase;
import com.liuzhuo.content.service.mapper.CourseBaseMapper;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestCourseBase {

    @Resource
    CourseBaseMapper courseBaseMapper;

    @Test
    public void testPageList() {
        // 分页参数
        PageParams pageParams = new PageParams();
        pageParams.setPage(1L);
        pageParams.setSize(15L);

        // 查询参数
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        queryCourseParamsDto.setCourseName("java");
        queryCourseParamsDto.setAuditStatus("202004");
        queryCourseParamsDto.setPublishStatus("203001");


        // 查询条件
        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty(queryCourseParamsDto.getCourseName()), CourseBase::getName, queryCourseParamsDto.getCourseName())
                .eq(StringUtils.isNotEmpty(queryCourseParamsDto.getAuditStatus()), CourseBase::getAuditStatus, queryCourseParamsDto.getAuditStatus())
                .eq(StringUtils.isNotEmpty(queryCourseParamsDto.getPublishStatus()), CourseBase::getStatus, queryCourseParamsDto.getPublishStatus());

        // 分页查询
        Page<CourseBase> page = new Page<>(pageParams.getPage(), pageParams.getSize());

        // 查询结果
        Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);

        PageResult<CourseBase> result = new PageResult<>(pageResult.getRecords(), pageResult.getTotal(), pageParams.getPage(), pageParams.getSize());

        System.out.println(result);

    }
}

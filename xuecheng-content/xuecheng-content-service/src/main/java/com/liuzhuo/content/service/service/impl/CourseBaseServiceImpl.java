package com.liuzhuo.content.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhuo.base.model.PageParams;
import com.liuzhuo.base.model.PageResult;
import com.liuzhuo.content.model.dto.QueryCourseParamsDto;
import com.liuzhuo.content.model.po.CourseBase;
import com.liuzhuo.content.service.service.CourseBaseService;
import com.liuzhuo.content.service.mapper.CourseBaseMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @description 针对表【course_base(课程基本信息)】的数据库操作Service实现
 * @createDate 2023-07-12 15:05:52
 */
@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBase>
        implements CourseBaseService {

    @Resource
    CourseBaseMapper courseBaseMapper;

    @Override
    public PageResult<CourseBase> listPageQuery(PageParams pageParams, QueryCourseParamsDto queryCourseParams) {

        // 查询条件
        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
        if (ObjectUtils.isNotEmpty(queryCourseParams)) {
            queryWrapper.like(StringUtils.isNotEmpty(queryCourseParams.getCourseName()), CourseBase::getName, queryCourseParams.getCourseName())
                    .eq(StringUtils.isNotEmpty(queryCourseParams.getAuditStatus()), CourseBase::getAuditStatus, queryCourseParams.getAuditStatus())
                    .eq(StringUtils.isNotEmpty(queryCourseParams.getPublishStatus()), CourseBase::getStatus, queryCourseParams.getPublishStatus());
        }

        // 分页查询
        Page<CourseBase> page = new Page<>(pageParams.getPage(), pageParams.getSize());

        // 查询结果
        Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);

        // 分页结果
        PageResult<CourseBase> result = new PageResult<>(pageResult.getRecords(), pageResult.getTotal(), pageParams.getPage(), pageParams.getSize());

        return result;
    }
}





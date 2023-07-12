package com.liuzhuo.content.service.service;

import com.liuzhuo.base.model.PageParams;
import com.liuzhuo.base.model.PageResult;
import com.liuzhuo.content.model.dto.QueryCourseParamsDto;
import com.liuzhuo.content.model.po.CourseBase;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【course_base(课程基本信息)】的数据库操作Service
* @createDate 2023-07-12 15:05:52
*/
public interface CourseBaseService extends IService<CourseBase> {
    /**
     * 分页查询
     */
    PageResult<CourseBase> listPageQuery(PageParams pageParams, QueryCourseParamsDto queryCourseParams);
}

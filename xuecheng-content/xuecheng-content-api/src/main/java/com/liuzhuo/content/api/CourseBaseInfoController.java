package com.liuzhuo.content.api;

import com.liuzhuo.base.model.PageParams;
import com.liuzhuo.base.model.PageResult;
import com.liuzhuo.content.model.dto.QueryCourseParamsDto;
import com.liuzhuo.content.model.po.CourseBase;
import com.liuzhuo.content.service.service.CourseBaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(value = "课程信息编辑接口", tags = "课程信息编辑接口")
@RestController
@RequestMapping("/course")
public class CourseBaseInfoController {

    @Resource
    CourseBaseService courseBaseService;

    @ApiOperation("课程查询接口")
    @PostMapping("/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParams) {
        return courseBaseService.listPageQuery(pageParams, queryCourseParams);
    }
}

package com.liuzhuo.content.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhuo.content.model.po.CourseTeacher;
import com.liuzhuo.content.service.service.CourseTeacherService;
import com.liuzhuo.content.service.mapper.CourseTeacherMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【course_teacher(课程-教师关系表)】的数据库操作Service实现
* @createDate 2023-07-12 15:05:52
*/
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacher>
    implements CourseTeacherService{

}





package com.liuzhuo.content.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhuo.content.model.po.MqMessage;
import com.liuzhuo.content.service.service.MqMessageService;
import com.liuzhuo.content.service.mapper.MqMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【mq_message】的数据库操作Service实现
* @createDate 2023-07-12 15:05:52
*/
@Service
public class MqMessageServiceImpl extends ServiceImpl<MqMessageMapper, MqMessage>
    implements MqMessageService{

}





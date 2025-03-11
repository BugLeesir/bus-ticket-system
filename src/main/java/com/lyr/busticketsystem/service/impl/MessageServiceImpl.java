package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.Message;
import com.lyr.busticketsystem.service.MessageService;
import com.lyr.busticketsystem.dao.MessageMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【message(留言信息表)】的数据库操作Service实现
* @createDate 2025-03-12 04:22:41
*/
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message>
    implements MessageService{

}





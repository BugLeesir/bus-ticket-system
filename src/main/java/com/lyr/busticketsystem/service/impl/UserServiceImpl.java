package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.User;
import com.lyr.busticketsystem.service.UserService;
import com.lyr.busticketsystem.dao.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【user(用户信息表)】的数据库操作Service实现
* @createDate 2025-03-11 19:00:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





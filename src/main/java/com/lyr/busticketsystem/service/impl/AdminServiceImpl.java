package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.Admin;
import com.lyr.busticketsystem.service.AdminService;
import com.lyr.busticketsystem.dao.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【admin(管理员信息表)】的数据库操作Service实现
* @createDate 2025-03-11 19:00:54
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}





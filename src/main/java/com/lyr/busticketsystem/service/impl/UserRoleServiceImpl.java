package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.UserRole;
import com.lyr.busticketsystem.service.UserRoleService;
import com.lyr.busticketsystem.dao.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【user_role(用户角色关联表)】的数据库操作Service实现
* @createDate 2025-03-12 04:22:41
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}





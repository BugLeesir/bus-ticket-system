package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.Role;
import com.lyr.busticketsystem.service.RoleService;
import com.lyr.busticketsystem.dao.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【role(角色信息表)】的数据库操作Service实现
* @createDate 2025-03-12 04:22:41
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}





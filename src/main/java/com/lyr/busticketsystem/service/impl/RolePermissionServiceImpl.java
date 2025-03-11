package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.RolePermission;
import com.lyr.busticketsystem.service.RolePermissionService;
import com.lyr.busticketsystem.dao.RolePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【role_permission(角色权限关联表)】的数据库操作Service实现
* @createDate 2025-03-12 04:22:41
*/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission>
    implements RolePermissionService{

}





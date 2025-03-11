package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.Permission;
import com.lyr.busticketsystem.service.PermissionService;
import com.lyr.busticketsystem.dao.PermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【permission(权限信息表)】的数据库操作Service实现
* @createDate 2025-03-12 04:22:41
*/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission>
    implements PermissionService{

}





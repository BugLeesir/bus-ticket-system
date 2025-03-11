package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.Announcement;
import com.lyr.busticketsystem.service.AnnouncementService;
import com.lyr.busticketsystem.dao.AnnouncementMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【announcement(公告信息表)】的数据库操作Service实现
* @createDate 2025-03-11 19:00:54
*/
@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement>
    implements AnnouncementService{

}





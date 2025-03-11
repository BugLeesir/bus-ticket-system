package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.Member;
import com.lyr.busticketsystem.service.MemberService;
import com.lyr.busticketsystem.dao.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【member(会员信息表)】的数据库操作Service实现
* @createDate 2025-03-11 19:00:54
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}





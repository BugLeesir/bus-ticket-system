package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.OrderDetails;
import com.lyr.busticketsystem.service.OrderDetailsService;
import com.lyr.busticketsystem.dao.OrderDetailsMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【order_details(订单详情表)】的数据库操作Service实现
* @createDate 2025-03-11 19:00:54
*/
@Service
public class OrderDetailsServiceImpl extends ServiceImpl<OrderDetailsMapper, OrderDetails>
    implements OrderDetailsService{

}





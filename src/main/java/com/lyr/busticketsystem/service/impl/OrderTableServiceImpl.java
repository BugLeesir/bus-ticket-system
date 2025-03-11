package com.lyr.busticketsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyr.busticketsystem.entity.OrderTable;
import com.lyr.busticketsystem.service.OrderTableService;
import com.lyr.busticketsystem.dao.OrderTableMapper;
import org.springframework.stereotype.Service;

/**
* @author yunruili
* @description 针对表【order_table(订单信息表)】的数据库操作Service实现
* @createDate 2025-03-12 04:22:41
*/
@Service
public class OrderTableServiceImpl extends ServiceImpl<OrderTableMapper, OrderTable>
    implements OrderTableService{

}





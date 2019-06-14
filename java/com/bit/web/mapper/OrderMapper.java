package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.OrderDTO;
import org.springframework.stereotype.Repository;

/**
 * OrderMapper
 */

@Repository
public interface OrderMapper {
    public void addOrder(OrderDTO order);
    public List<OrderDTO> findOrders();
    public List<OrderDTO> findOrdersByOption(OrderDTO option);
    public OrderDTO findOrderByOrderId(String orderId);
    public void updateOrder(OrderDTO order);
    public void deleteOrder(OrderDTO order);
}
package com.bit.web.domain;

import org.springframework.stereotype.Component;

import org.springframework.context.annotation.Lazy;

import lombok.Data;



/**
 * orderDTO
 */
@Data @Component @Lazy
public class OrderDTO {
    private String orderId, 
                   customerId, 
                   employeeId, 
                   orderDate, 
                   shipperId;
}
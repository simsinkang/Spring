package com.bit.web.domain;

import org.springframework.context.annotation.Lazy;

import org.springframework.stereotype.Component;

import lombok.Data;



/**
 * shipperDTO
 */
@Data @Component @Lazy
public class ShipperDTO {
    private String shipperId, 
                   shipperName, 
                   phone;
}
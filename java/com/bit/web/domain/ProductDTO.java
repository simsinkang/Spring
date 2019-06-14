package com.bit.web.domain;

import org.springframework.stereotype.Component;

import org.springframework.context.annotation.Lazy;

import lombok.Data;



/**
 * productDTO
 */
@Data @Component @Lazy
public class ProductDTO {
    private String productId, 
                   productName, 
                   supplierId, 
                   categoryId, 
                   unit, 
                   price, 
                   photo;
}
package com.bit.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import lombok.Data;

/**
 * categoryDTO
 */

@Data @Component @Lazy
public class CategoryDTO {
    private String categoryId, 
                   categoryName, 
                   description;
}
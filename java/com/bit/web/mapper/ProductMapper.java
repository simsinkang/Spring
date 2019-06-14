package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.ProductDTO;
import org.springframework.stereotype.Repository;

/**
 * ProductMapper
 */

@Repository
public interface ProductMapper {
    public void addProduct(ProductDTO product);
    public List<ProductDTO> findProducts();
    public List<ProductDTO> findProductsByOption(ProductDTO option);
    public ProductDTO findProductByProductId(String productId);
    public void updateProduct(ProductDTO product);
    public void deleteProduct(ProductDTO product);
}
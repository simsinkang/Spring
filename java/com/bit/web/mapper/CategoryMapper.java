package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.CategoryDTO;
import org.springframework.stereotype.Repository;

/**
 * CategoryMapper
 */

@Repository
public interface CategoryMapper {
    public void addCategory(CategoryDTO category);
    public List<CategoryDTO> findCategories();
    public List<CategoryDTO> findCategoriesByOption(CategoryDTO option);
    public CategoryDTO findCategoryByCategoryId(CategoryDTO category);
    public void updateCategory(CategoryDTO category);
    public void deleteCategory(CategoryDTO category);
}
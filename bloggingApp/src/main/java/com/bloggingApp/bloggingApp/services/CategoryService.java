package com.bloggingApp.bloggingApp.services;

import com.bloggingApp.bloggingApp.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
    void deleteCategory(Integer categoryId);
    CategoryDto getCategory(Integer categoryId);
    List<CategoryDto> getCategories();

}

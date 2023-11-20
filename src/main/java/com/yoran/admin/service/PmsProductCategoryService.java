package com.yoran.admin.service;

import com.yoran.admin.mbg.model.PmsProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PmsProductCategoryService {
    int createProductCategory(PmsProductCategory category);

    int updateProductCategory(Integer id, PmsProductCategory category);

    int deleteProductCategory(Integer id);

    List<PmsProductCategory> listProductCategory(int pageNum, int pageSize);

}

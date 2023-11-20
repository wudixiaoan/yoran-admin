package com.yoran.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.yoran.admin.mbg.mapper.PmsProductCategoryMapper;
import com.yoran.admin.mbg.model.PmsProductCategory;
import com.yoran.admin.mbg.model.PmsProductCategoryExample;
import com.yoran.admin.service.PmsProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {

    @Autowired
    private PmsProductCategoryMapper productCategoryMapper;

    @Override
    public int createProductCategory(PmsProductCategory category) {
        return productCategoryMapper.insertSelective(category);
    }

    @Override
    public int updateProductCategory(Integer id, PmsProductCategory category) {
        category.setId(id);
        return productCategoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public int deleteProductCategory(Integer id) {
        PmsProductCategory pmsProductCategory = productCategoryMapper.selectByPrimaryKey(id);
        pmsProductCategory.setDelFlag(1);
        return productCategoryMapper.updateByPrimaryKey(pmsProductCategory);
    }

    @Override
    public List<PmsProductCategory> listProductCategory(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return productCategoryMapper.selectByExample(new PmsProductCategoryExample());
    }

}

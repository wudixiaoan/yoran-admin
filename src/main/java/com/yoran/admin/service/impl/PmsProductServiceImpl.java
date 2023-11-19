package com.yoran.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.yoran.admin.mbg.mapper.PmsProductMapper;
import com.yoran.admin.mbg.model.PmsProduct;
import com.yoran.admin.mbg.model.PmsProductExample;
import com.yoran.admin.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductMapper productMapper;

    @Override
    public int createProduct(PmsProduct product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public int updateProduct(Integer id, PmsProduct product) {
        product.setId(id);
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public int deleteProduct(Integer id) {
        PmsProduct product = productMapper.selectByPrimaryKey(id);
        product.setDelFlag(1);
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public List<PmsProduct> listProduct(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return productMapper.selectByExample(new PmsProductExample());
    }

    @Override
    public PmsProduct getProduct(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }
}

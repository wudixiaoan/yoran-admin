package com.yoran.admin.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.yoran.admin.domain.dto.PmsProductDTO;
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
    public List<PmsProduct> listProduct(int pageNum, int pageSize, PmsProductDTO pmsProductDTO) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample example = new PmsProductExample();
        PmsProductExample.Criteria criteria = example.createCriteria();
        if (ObjectUtil.isNotEmpty(pmsProductDTO.getProductSn())) {
            criteria.andProductSnLike("%" + pmsProductDTO.getProductSn() + "%");
        }
        if (ObjectUtil.isNotEmpty(pmsProductDTO.getName())) {
            criteria.andNameLike("%" + pmsProductDTO.getName() + "%");
        }
        if (ObjectUtil.isNotEmpty(pmsProductDTO.getCategoryId())) {
            criteria.andCategoryIdEqualTo(pmsProductDTO.getCategoryId());
        }
        return productMapper.selectByExample(example);
    }

    @Override
    public PmsProduct getProduct(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }
}

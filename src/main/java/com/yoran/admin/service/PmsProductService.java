package com.yoran.admin.service;

import com.yoran.admin.mbg.model.PmsProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PmsProductService {
    int createProduct(PmsProduct product);

    int updateProduct(Integer id, PmsProduct product);

    int deleteProduct(Integer id);

    List<PmsProduct> listProduct(int pageNum, int pageSize);

    PmsProduct getProduct(Integer id);

}

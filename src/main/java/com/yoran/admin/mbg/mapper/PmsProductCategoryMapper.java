package com.yoran.admin.mbg.mapper;

import com.yoran.admin.mbg.model.PmsProductCategory;
import com.yoran.admin.mbg.model.PmsProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryMapper {
    long countByExample(PmsProductCategoryExample example);

    int deleteByExample(PmsProductCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductCategory row);

    int insertSelective(PmsProductCategory row);

    List<PmsProductCategory> selectByExample(PmsProductCategoryExample example);

    PmsProductCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    int updateByExample(@Param("row") PmsProductCategory row, @Param("example") PmsProductCategoryExample example);

    int updateByPrimaryKeySelective(PmsProductCategory row);

    int updateByPrimaryKey(PmsProductCategory row);
}
package com.yoran.admin.mbg.mapper;

import com.yoran.admin.mbg.model.PmsProductRebate;
import com.yoran.admin.mbg.model.PmsProductRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductRebateMapper {
    long countByExample(PmsProductRebateExample example);

    int deleteByExample(PmsProductRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductRebate row);

    int insertSelective(PmsProductRebate row);

    List<PmsProductRebate> selectByExample(PmsProductRebateExample example);

    PmsProductRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") PmsProductRebate row, @Param("example") PmsProductRebateExample example);

    int updateByExample(@Param("row") PmsProductRebate row, @Param("example") PmsProductRebateExample example);

    int updateByPrimaryKeySelective(PmsProductRebate row);

    int updateByPrimaryKey(PmsProductRebate row);
}
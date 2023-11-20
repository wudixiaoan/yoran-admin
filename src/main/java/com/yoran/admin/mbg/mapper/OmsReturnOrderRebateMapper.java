package com.yoran.admin.mbg.mapper;

import com.yoran.admin.mbg.model.OmsReturnOrderRebate;
import com.yoran.admin.mbg.model.OmsReturnOrderRebateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsReturnOrderRebateMapper {
    long countByExample(OmsReturnOrderRebateExample example);

    int deleteByExample(OmsReturnOrderRebateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OmsReturnOrderRebate row);

    int insertSelective(OmsReturnOrderRebate row);

    List<OmsReturnOrderRebate> selectByExample(OmsReturnOrderRebateExample example);

    OmsReturnOrderRebate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") OmsReturnOrderRebate row, @Param("example") OmsReturnOrderRebateExample example);

    int updateByExample(@Param("row") OmsReturnOrderRebate row, @Param("example") OmsReturnOrderRebateExample example);

    int updateByPrimaryKeySelective(OmsReturnOrderRebate row);

    int updateByPrimaryKey(OmsReturnOrderRebate row);
}
package com.yoran.admin.mbg.mapper;

import com.yoran.admin.mbg.model.OmsReturnOrder;
import com.yoran.admin.mbg.model.OmsReturnOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsReturnOrderMapper {
    long countByExample(OmsReturnOrderExample example);

    int deleteByExample(OmsReturnOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OmsReturnOrder row);

    int insertSelective(OmsReturnOrder row);

    List<OmsReturnOrder> selectByExample(OmsReturnOrderExample example);

    OmsReturnOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") OmsReturnOrder row, @Param("example") OmsReturnOrderExample example);

    int updateByExample(@Param("row") OmsReturnOrder row, @Param("example") OmsReturnOrderExample example);

    int updateByPrimaryKeySelective(OmsReturnOrder row);

    int updateByPrimaryKey(OmsReturnOrder row);
}
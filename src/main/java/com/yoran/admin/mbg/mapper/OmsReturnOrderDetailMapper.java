package com.yoran.admin.mbg.mapper;

import com.yoran.admin.mbg.model.OmsReturnOrderDetail;
import com.yoran.admin.mbg.model.OmsReturnOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsReturnOrderDetailMapper {
    long countByExample(OmsReturnOrderDetailExample example);

    int deleteByExample(OmsReturnOrderDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OmsReturnOrderDetail row);

    int insertSelective(OmsReturnOrderDetail row);

    List<OmsReturnOrderDetail> selectByExample(OmsReturnOrderDetailExample example);

    OmsReturnOrderDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") OmsReturnOrderDetail row, @Param("example") OmsReturnOrderDetailExample example);

    int updateByExample(@Param("row") OmsReturnOrderDetail row, @Param("example") OmsReturnOrderDetailExample example);

    int updateByPrimaryKeySelective(OmsReturnOrderDetail row);

    int updateByPrimaryKey(OmsReturnOrderDetail row);
}
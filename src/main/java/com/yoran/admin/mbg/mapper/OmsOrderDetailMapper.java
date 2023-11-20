package com.yoran.admin.mbg.mapper;

import com.yoran.admin.mbg.model.OmsOrderDetail;
import com.yoran.admin.mbg.model.OmsOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderDetailMapper {
    long countByExample(OmsOrderDetailExample example);

    int deleteByExample(OmsOrderDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OmsOrderDetail row);

    int insertSelective(OmsOrderDetail row);

    List<OmsOrderDetail> selectByExample(OmsOrderDetailExample example);

    OmsOrderDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") OmsOrderDetail row, @Param("example") OmsOrderDetailExample example);

    int updateByExample(@Param("row") OmsOrderDetail row, @Param("example") OmsOrderDetailExample example);

    int updateByPrimaryKeySelective(OmsOrderDetail row);

    int updateByPrimaryKey(OmsOrderDetail row);
}
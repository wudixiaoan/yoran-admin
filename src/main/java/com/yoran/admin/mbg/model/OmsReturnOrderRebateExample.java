package com.yoran.admin.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OmsReturnOrderRebateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsReturnOrderRebateExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIsNull() {
            addCriterion("return_order_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIsNotNull() {
            addCriterion("return_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdEqualTo(Integer value) {
            addCriterion("return_order_id =", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotEqualTo(Integer value) {
            addCriterion("return_order_id <>", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThan(Integer value) {
            addCriterion("return_order_id >", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_order_id >=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThan(Integer value) {
            addCriterion("return_order_id <", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("return_order_id <=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIn(List<Integer> values) {
            addCriterion("return_order_id in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotIn(List<Integer> values) {
            addCriterion("return_order_id not in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("return_order_id between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("return_order_id not between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnIsNull() {
            addCriterion("return_order_sn is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnIsNotNull() {
            addCriterion("return_order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnEqualTo(String value) {
            addCriterion("return_order_sn =", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnNotEqualTo(String value) {
            addCriterion("return_order_sn <>", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnGreaterThan(String value) {
            addCriterion("return_order_sn >", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("return_order_sn >=", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnLessThan(String value) {
            addCriterion("return_order_sn <", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnLessThanOrEqualTo(String value) {
            addCriterion("return_order_sn <=", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnLike(String value) {
            addCriterion("return_order_sn like", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnNotLike(String value) {
            addCriterion("return_order_sn not like", value, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnIn(List<String> values) {
            addCriterion("return_order_sn in", values, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnNotIn(List<String> values) {
            addCriterion("return_order_sn not in", values, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnBetween(String value1, String value2) {
            addCriterion("return_order_sn between", value1, value2, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andReturnOrderSnNotBetween(String value1, String value2) {
            addCriterion("return_order_sn not between", value1, value2, "returnOrderSn");
            return (Criteria) this;
        }

        public Criteria andRebateIdIsNull() {
            addCriterion("rebate_id is null");
            return (Criteria) this;
        }

        public Criteria andRebateIdIsNotNull() {
            addCriterion("rebate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRebateIdEqualTo(Integer value) {
            addCriterion("rebate_id =", value, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdNotEqualTo(Integer value) {
            addCriterion("rebate_id <>", value, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdGreaterThan(Integer value) {
            addCriterion("rebate_id >", value, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebate_id >=", value, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdLessThan(Integer value) {
            addCriterion("rebate_id <", value, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdLessThanOrEqualTo(Integer value) {
            addCriterion("rebate_id <=", value, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdIn(List<Integer> values) {
            addCriterion("rebate_id in", values, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdNotIn(List<Integer> values) {
            addCriterion("rebate_id not in", values, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdBetween(Integer value1, Integer value2) {
            addCriterion("rebate_id between", value1, value2, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rebate_id not between", value1, value2, "rebateId");
            return (Criteria) this;
        }

        public Criteria andRebatePicIsNull() {
            addCriterion("rebate_pic is null");
            return (Criteria) this;
        }

        public Criteria andRebatePicIsNotNull() {
            addCriterion("rebate_pic is not null");
            return (Criteria) this;
        }

        public Criteria andRebatePicEqualTo(String value) {
            addCriterion("rebate_pic =", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicNotEqualTo(String value) {
            addCriterion("rebate_pic <>", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicGreaterThan(String value) {
            addCriterion("rebate_pic >", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicGreaterThanOrEqualTo(String value) {
            addCriterion("rebate_pic >=", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicLessThan(String value) {
            addCriterion("rebate_pic <", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicLessThanOrEqualTo(String value) {
            addCriterion("rebate_pic <=", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicLike(String value) {
            addCriterion("rebate_pic like", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicNotLike(String value) {
            addCriterion("rebate_pic not like", value, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicIn(List<String> values) {
            addCriterion("rebate_pic in", values, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicNotIn(List<String> values) {
            addCriterion("rebate_pic not in", values, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicBetween(String value1, String value2) {
            addCriterion("rebate_pic between", value1, value2, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebatePicNotBetween(String value1, String value2) {
            addCriterion("rebate_pic not between", value1, value2, "rebatePic");
            return (Criteria) this;
        }

        public Criteria andRebateNameIsNull() {
            addCriterion("rebate_name is null");
            return (Criteria) this;
        }

        public Criteria andRebateNameIsNotNull() {
            addCriterion("rebate_name is not null");
            return (Criteria) this;
        }

        public Criteria andRebateNameEqualTo(String value) {
            addCriterion("rebate_name =", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameNotEqualTo(String value) {
            addCriterion("rebate_name <>", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameGreaterThan(String value) {
            addCriterion("rebate_name >", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameGreaterThanOrEqualTo(String value) {
            addCriterion("rebate_name >=", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameLessThan(String value) {
            addCriterion("rebate_name <", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameLessThanOrEqualTo(String value) {
            addCriterion("rebate_name <=", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameLike(String value) {
            addCriterion("rebate_name like", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameNotLike(String value) {
            addCriterion("rebate_name not like", value, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameIn(List<String> values) {
            addCriterion("rebate_name in", values, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameNotIn(List<String> values) {
            addCriterion("rebate_name not in", values, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameBetween(String value1, String value2) {
            addCriterion("rebate_name between", value1, value2, "rebateName");
            return (Criteria) this;
        }

        public Criteria andRebateNameNotBetween(String value1, String value2) {
            addCriterion("rebate_name not between", value1, value2, "rebateName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNull() {
            addCriterion("rebate_amount is null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNotNull() {
            addCriterion("rebate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountEqualTo(BigDecimal value) {
            addCriterion("rebate_amount =", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("rebate_amount <>", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("rebate_amount >", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate_amount >=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThan(BigDecimal value) {
            addCriterion("rebate_amount <", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate_amount <=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIn(List<BigDecimal> values) {
            addCriterion("rebate_amount in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("rebate_amount not in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate_amount between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate_amount not between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
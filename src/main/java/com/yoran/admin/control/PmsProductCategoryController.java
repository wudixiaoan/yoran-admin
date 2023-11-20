package com.yoran.admin.control;


import com.yoran.admin.common.api.CommonPage;
import com.yoran.admin.common.api.CommonResult;
import com.yoran.admin.mbg.model.PmsProductCategory;
import com.yoran.admin.service.PmsProductCategoryService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productCategory")
public class PmsProductCategoryController {
    @Autowired
    private PmsProductCategoryService productCategoryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductCategoryController.class);


    @ApiOperation("获取所有商品分类列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProductCategory>> list(@RequestParam(value = "pageNum", defaultValue = "1")
                                                             @ApiParam("页码") Integer pageNum,
                                                             @RequestParam(value = "pageSize", defaultValue = "999")
                                                             @ApiParam("每页数量") Integer pageSize) {
        List<PmsProductCategory> list = productCategoryService.listProductCategory(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }


    @ApiOperation("添加商品分类")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(PmsProductCategory productCategory) {
        CommonResult commonResult;
        int count = productCategoryService.createProductCategory(productCategory);
        if (count == 1) {
            commonResult = CommonResult.success(productCategory);
            LOGGER.debug("create success:{}", productCategory);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("create failed:{}", productCategory);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id商品分类信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestParam("id") Integer id, PmsProductCategory productCategory) {
        CommonResult commonResult;
        int count = productCategoryService.updateProductCategory(id, productCategory);
        if (count == 1) {
            commonResult = CommonResult.success(productCategory);
            LOGGER.debug("updateBrand success:{}", productCategory);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", productCategory);
        }
        return commonResult;
    }


    @ApiOperation("删除指定id的商品分类")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") Integer id) {
        int count = productCategoryService.deleteProductCategory(id);
        if (count == 1) {
            LOGGER.debug("delete success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("delete failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }
}

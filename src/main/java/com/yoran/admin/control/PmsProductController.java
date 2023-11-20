package com.yoran.admin.control;


import com.yoran.admin.common.api.CommonPage;
import com.yoran.admin.common.api.CommonResult;
import com.yoran.admin.domain.dto.PmsProductDTO;
import com.yoran.admin.mbg.model.PmsProduct;
import com.yoran.admin.service.PmsProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    private PmsProductService productService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductController.class);


    @ApiOperation("获取所有商品列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> list(@RequestParam(value = "pageNum", defaultValue = "1")
                                                     @ApiParam("页码") Integer pageNum,
                                                     @RequestParam(value = "pageSize", defaultValue = "3")
                                                     @ApiParam("每页数量") Integer pageSize,
                                                     @ModelAttribute PmsProductDTO pmsProductDTO) {
        List<PmsProduct> brandList = productService.listProduct(pageNum, pageSize, pmsProductDTO);
        return CommonResult.success(CommonPage.restPage(brandList));
    }


    @ApiOperation("添加商品")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(PmsProduct pmsProduct) {
        CommonResult commonResult;
        int count = productService.createProduct(pmsProduct);
        if (count == 1) {
            commonResult = CommonResult.success(pmsProduct);
            LOGGER.debug("createBrand success:{}", pmsProduct);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", pmsProduct);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id品牌信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestParam("id") Integer id, PmsProduct pmsProduct) {
        CommonResult commonResult;
        int count = productService.updateProduct(id, pmsProduct);
        if (count == 1) {
            commonResult = CommonResult.success(pmsProduct);
            LOGGER.debug("updateBrand success:{}", pmsProduct);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", pmsProduct);
        }
        return commonResult;
    }


    @ApiOperation("删除指定id的商品")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") Integer id) {
        int count = productService.deleteProduct(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }
}

package com.leyou.item.controller;

import com.leyou.item.pojo.Category;
import com.leyou.item.service.ICategoryService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ocean
 * @date 2018-12-17 18:36
 * @descrition
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    /**
     * 根据父节点的id查询商品分类
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>>queryByParentId(@RequestParam("pid") Long pid){
        List<Category> categories= this.categoryService.queryByParentId(pid);
        if (categories != null && categories.size() != 0){
            return ResponseEntity.ok(categories);
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("bid/{bid}")
    public ResponseEntity<List<Category>> queryByBrandId(@PathVariable("bid") Long bid){
       List<Category> categories=categoryService.queryByBrandId(bid);
       if (categories !=null & 0!=categories.size()){
           return ResponseEntity.ok(categories);
       }
       return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

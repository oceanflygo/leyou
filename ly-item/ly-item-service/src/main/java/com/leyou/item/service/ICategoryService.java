package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author Ocean
 * @date 2018-12-17 19:02
 * @descrition
 */
public interface ICategoryService {
   public List<Category> queryByParentId(Long pid);

   List<Category> queryByBrandId(Long bid);
}

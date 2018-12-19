package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Ocean
 * @date 2018-12-19 18:28
 * @descrition
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    BRAND_NOT_FOUND("商品不存在", 404),
    CATEGORY_NOT_FOUND("商品分类没查到", 404),
    BRAND_SAVE_ERROR("新增品牌失败",500),
    UPLOAD_FILE_ERROR("文件上传失败",500),
   INVALID_FILE_TYPE("文件类型不匹配",400);
    private String msg;
    private int code;

}

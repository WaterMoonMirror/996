package com.wondersgroup.lz.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 商品类型枚举
 */
@AllArgsConstructor
@Getter
public enum SkuCategoryEnum {
    CLOTHING(10, "服装类"),
    ELECTRONICS(20, "数码类"),
    SPORTS(30, "运动类"),
    BOOKS(40, "图书类");

    // 商品类型的编号
    private Integer code;
    // 商品类型的名称
    private String name;
}
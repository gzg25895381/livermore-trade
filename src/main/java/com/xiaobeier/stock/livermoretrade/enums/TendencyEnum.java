package com.xiaobeier.stock.livermoretrade.enums;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 趋势枚举
 */
@AllArgsConstructor
public enum TendencyEnum {

    SECONDARY_UP(1,"次级回升"),
    NATURE_UP(2,"自然回升"),
    UP(3,"上升趋势"),

    DOWN(4,"下降趋势"),
    NATURE_DOWN(5,"自然回撤"),
    SECONDARY_DOWN(4,"次级回撤");



    /**趋势方向编码**/
    private final int code;
    /**趋势描述**/
    private final String description;
}

package com.xiaobeier.stock.livermoretrade.model;

import lombok.Data;

/**
 * create by: guozg
 * description: 每天节点数据结构
 * create time: 2021/6/2 22:18
 */
@Data
public class DayNode {
    /**交易日**/
    private String date;
    /**开盘价**/
    private double startPrice;
    /**收盘价**/
    private double endPrice;
    /**最高价**/
    private double highestPrice;
    /**最低价**/
    private double lowestPrice;
    /**成交量**/
    private int tradingVolume;
    /**当天趋势**/
    private int tendency;

    /**当天的上升趋势价格**/
    private double upPrice;
    /**当天的自然回升顶部价格**/
    private double natureUpPrice;
    /**当天的次级回升顶部价格**/
    private double secondaryUpPrice;
    /**当天的下降趋势底价**/
    private double downPrice;
    /**当天的次级回调底价**/
    private double secondaryDownPrice;
    /**当天自然回调价底价**/
    private double natureDownPrice;
}

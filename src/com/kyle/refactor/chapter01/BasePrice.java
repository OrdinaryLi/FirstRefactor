package com.kyle.refactor.chapter01;

/**
 * @author Kyle
 */
public abstract class BasePrice {
    /**
     * 获取价格
     *
     * @return 价格
     */
    abstract int getPrice();

    /**
     * 获取费用
     *
     * @param daysRented 租赁时间
     * @return 租赁费用
     */
    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}


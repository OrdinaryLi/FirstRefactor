package com.kyle.refactor.chapter01;

/**
 * @author Kyle
 */
public class ChildrenBasePrice extends BasePrice {

    @Override
    int getPrice() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        int result = 0;
        result += 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}

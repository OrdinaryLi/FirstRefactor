package com.kyle.refactor.chapter01;

/**
 * @author Kyle
 */
public class RegularBasePrice extends BasePrice {

    @Override
    int getPrice() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        int result = 0;
        result += 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}

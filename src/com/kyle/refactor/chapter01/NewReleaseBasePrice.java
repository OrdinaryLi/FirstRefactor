package com.kyle.refactor.chapter01;

/**
 * @author Kyle
 */
public class NewReleaseBasePrice extends BasePrice {

    @Override
    int getPrice() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;

    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 2 ? 2 : 1;
    }
}

package com.kyle.refactor.chapter01;

/**
 * @author Kyle
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private BasePrice price;

    public Movie(String title, int price) {
        this.title = title;
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price.getPrice();
    }

    public void setPrice(int flag) {
        switch (flag) {
            case Movie.REGULAR:
                price = new RegularBasePrice();
                break;
            case Movie.CHILDRENS:
                price = new ChildrenBasePrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleaseBasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}

package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        super("House");
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }


}

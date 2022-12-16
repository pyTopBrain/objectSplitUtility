package com.sts;

public class DummyLocation {
    private int locationCode;
    private String city;

    public int getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(int locationCode) {
        this.locationCode = locationCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "DummyLocation{" +
                "locationCode=" + locationCode +
                ", city='" + city + '\'' +
                '}';
    }
}

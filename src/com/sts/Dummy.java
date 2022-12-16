package com.sts;

import java.util.List;

public class Dummy {
    private List<DummyLocation> locations;



    public List<DummyLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<DummyLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "locations=" + locations.toString() +
                '}';
    }
}

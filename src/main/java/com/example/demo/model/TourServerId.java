package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class TourServerId implements Serializable {
    private Integer tourId;
    private Integer serverId;

    // Constructors, getters, setters, equals, hashCode
    public TourServerId() {}

    public TourServerId(Integer tourId, Integer serverId) {
        this.tourId = tourId;
        this.serverId = serverId;
    }

    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(Object o) {
		return false;
        // Implement equals
    }

    @Override
    public int hashCode() {
		return serverId;
        // Implement hashCode
    }
}

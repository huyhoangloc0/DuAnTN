package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Tour_Server")
public class Tour_Server {

    @EmbeddedId
    private TourServerId id;

    @ManyToOne
    @MapsId("tourId")  // Mapping tourId in the composite key
    @JoinColumn(name = "tour_id")
    private Tour tour;

    @ManyToOne
    @MapsId("serverId")  // Mapping serverId in the composite key
    @JoinColumn(name = "server_id")
    private Server server;

    // Constructors, getters, setters
    public Tour_Server() {}

    public TourServerId getId() {
        return id;
    }

    public void setId(TourServerId id) {
        this.id = id;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
}

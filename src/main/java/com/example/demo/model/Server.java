package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Server")
public class Server implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer server_id;

    private String server_type;
    private String server_name;
    private String location;
    private String contact_info;

    @OneToMany(mappedBy = "server", fetch = FetchType.LAZY)
    private List<Tour_Server> tourServers;

	public Integer getServer_id() {
		return server_id;
	}

	public void setServer_id(Integer server_id) {
		this.server_id = server_id;
	}

	public String getServer_type() {
		return server_type;
	}

	public void setServer_type(String server_type) {
		this.server_type = server_type;
	}

	public String getServer_name() {
		return server_name;
	}

	public void setServer_name(String server_name) {
		this.server_name = server_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact_info() {
		return contact_info;
	}

	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}

	public List<Tour_Server> getTourServers() {
		return tourServers;
	}

	public void setTourServers(List<Tour_Server> tourServers) {
		this.tourServers = tourServers;
	}

	public Server(Integer server_id, String server_type, String server_name, String location, String contact_info,
			List<Tour_Server> tourServers) {
		super();
		this.server_id = server_id;
		this.server_type = server_type;
		this.server_name = server_name;
		this.location = location;
		this.contact_info = contact_info;
		this.tourServers = tourServers;
	}

	public Server() {
		super();
	}
    
    
}

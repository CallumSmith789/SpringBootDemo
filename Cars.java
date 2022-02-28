package com.example.cars.domain;

public class Cars {
	
	private Integer id;
	
	private String make;
	
	private String model;
	
	private Integer seats;
	
	private Integer engsize;
	
	public Cars() {
		super();
	}

	public Cars(Integer id, String make, String model, Integer seats, Integer engsize) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.seats = seats;
		this.engsize = engsize;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getEngsize() {
		return engsize;
	}

	public void setEngsize(Integer engsize) {
		this.engsize = engsize;
	}

	@Override
	public String toString() {
		return "Cars [make=" + make + ", model=" + model + ", seats=" + seats + ", engsize=" + engsize + "]";
	}

}

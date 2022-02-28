package com.example.cars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.cars.domain.Cars;

@Service
public class CarsService {
	
	private List<Cars> vehicles = new ArrayList<>();
	
	public Cars createCars(Cars c) {
		this.vehicles.add(c);
		Cars created = this.vehicles.get(this.vehicles.size() - 1);
		return created;
	}
	
	public List<Cars> getAllCars(){
		return this.vehicles;
	}
	
	public Cars getCars(Integer id) {
		return this.vehicles.get(id);
	}
	
	public Cars replaceCars(Integer id, Cars newCars) {
		Cars body = this.vehicles.set(id, newCars);
		return body;
	}
	
	public void removeCars(@PathVariable Integer id) {
		this.vehicles.remove(id.intValue());
	}

}

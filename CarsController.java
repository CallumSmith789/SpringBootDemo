package com.example.cars.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cars.domain.Cars;
import com.example.cars.service.CarsService;

@RestController 
public class CarsController {

	private CarsService service;
	
	@Autowired
	public CarsController(CarsService service) {
		super();
		this.service=service;
	}

	@PostMapping("/create")

	public ResponseEntity<Cars> createCars(@RequestBody Cars c) {
		Cars created = this.service.createCars(c);
		ResponseEntity<Cars> response = new ResponseEntity<Cars>(created, HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/getAll") 
	public ResponseEntity<List<Cars>> getAllVehicles() {
		return ResponseEntity.ok(this.service.getAllCars()); 
	}
	
	@GetMapping("/get/{id}") 
	public Cars getCar(@PathVariable Integer id) {
		return this.service.getCars(id);
	}
	@PutMapping("/replace/{id}")
	public ResponseEntity<Cars> replaceCar(@PathVariable Integer id, @RequestBody Cars newCar) {
		Cars body = this.service.replaceCars(id, newCar);
		ResponseEntity<Cars> response = new ResponseEntity<Cars>(body, HttpStatus.ACCEPTED);
		return response;
	}
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeCar(@PathVariable Integer id) {
		this.service.removeCars(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}

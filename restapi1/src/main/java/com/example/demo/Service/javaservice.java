package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentsDetails;
import com.example.demo.Repository.StudentsRepo;
@Service
public class javaservice {
	@Autowired
	StudentsRepo repository;
	
	public String addCustomer(StudentsDetails customer)
	{
		repository.save (customer);
		return "Added";
	}
	public List<StudentsDetails> getCustomer()
	{
		return repository.findAll();
	
	}
	public Optional<StudentsDetails> getCustomerById(int id)
	{
		return repository.findById(id);
		
	}
	public String updatecustomerdetails(StudentsDetails customer)
	{
		repository.save(customer);
		return "Updated";
				
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
	

}

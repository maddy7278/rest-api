package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StudentsDetails;


@Repository
public interface StudentsRepo extends JpaRepository<StudentsDetails, Integer>
{
	
}
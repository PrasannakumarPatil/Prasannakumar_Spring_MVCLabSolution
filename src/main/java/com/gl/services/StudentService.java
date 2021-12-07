package com.gl.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.gl.entities.Student;

@Service
public interface StudentService {
	
	public List<Student> findAll();
	
	public Student	findById(int id);
	
	public void save(Student student);
	
	public void deletById(int id);

	
}
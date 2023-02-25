package com.example.demo.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StudentService {
@Autowired
StudentRepository repository;

public Optional<details> getStudent(int id){
	return repository.findById( id);
}

public String updateDetails(details stu) {
	repository.save( stu);
	return "updated";
}

public String deleteDetails(int id) {
	repository.deleteById(id);
	return  "ID DELETED";
	
}

public List<details> setPages(@PathVariable int offset,@PathVariable int pageSize ){
	Page<details> page=repository.findAll(PageRequest.of(offset, pageSize));
	return page.getContent();
	
}

public List<details> getSort(String field){
	return repository.findAll(Sort.by( Sort.Direction.ASC,field));
	
}
}

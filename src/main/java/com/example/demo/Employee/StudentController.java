package com.example.demo.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class StudentController {
	@Autowired
	StudentRepository serviceRepository;
    @Autowired
    StudentService service;
	@GetMapping("/getValue")
	List<details> getList(){
		return serviceRepository.findAll();
	}
	@PostMapping("/post")
	public details create(@RequestBody details d) {
		return serviceRepository.save(d);
	}
	@GetMapping("/getvalues/{id}")
	public Optional<details> getbyid(@PathVariable int id){
		return service.getStudent(id);
		
	}
	@PutMapping("/update")
	public String update(@RequestBody details d) {
		return  service.updateDetails(d);
		
	}
	@DeleteMapping("/deleted")
	public String delete(@RequestParam int id) {
		return service.deleteDetails(id);
		
	}
	@GetMapping("/details/{offset}/{pageSize}")
	public List<details> studentWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		return service.setPages(offset, pageSize);
	}
	
	@GetMapping("/details/{field}")
	public List<details> studentSortList(@PathVariable String field){
		return service.getSort(field);
	}
}

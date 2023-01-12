package com.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {
	@Autowired
	CollegeService cs;
	@PostMapping(value="/add")
	public String adddetail(@RequestBody CollegeStuEnity cmm) {
		return cs.adddetail(cmm);
	}
	@PutMapping(value="update")
	public String updateinfo(@RequestBody CollegeStuEnity cc) {
		return cs.updateinfo(cc);
	}
	@DeleteMapping(value="delete/{id}")
	public String deleteinfo(@PathVariable Integer id) {
	return cs.deleteinfo(id);
	}

@GetMapping(value="/getInfo1")
public  List<CollegeStuEnity>getAll() {
	return cs.getAll();
}
}


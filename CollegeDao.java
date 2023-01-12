package com.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CollegeDao {
	@Autowired
	CollegeRepo cr;
	public String adddetail(CollegeStuEnity cm) {
		cr.save(cm);
		return "Successfull added";
	}
	public String updateinfo(CollegeStuEnity bc) {
		cr.save(bc);
		return "data update";
	}
public String deleteinfo(Integer id) {
	cr.deleteById(id);
	return "data delete";
}
public List<CollegeStuEnity>getAll() {
	return cr.findAll();
}
}

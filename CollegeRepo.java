package com.boot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CollegeRepo extends JpaRepository<CollegeStuEnity, Integer> {
	@org.springframework.data.jpa.repository.Query (value="select * from CollegeStudent where name like %:name%", nativeQuery = true)
	public List<CollegeStuEnity>getByName(@Param("name")String name);

}

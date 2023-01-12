package com.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {
@Autowired
CollegeDao cd;
public String adddetail(CollegeStuEnity cm) {
	return cd.adddetail(cm);
}
public String updateinfo(CollegeStuEnity bc) {
return cd.updateinfo(bc);	
}
public String deleteinfo(Integer id) {
return cd.deleteinfo(id);
}
public List<CollegeStuEnity>getAll(){
return cd.getAll();
}


}

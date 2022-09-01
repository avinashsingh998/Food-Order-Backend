package com.springboot.foodorder.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.foodorder.main.model.Admin;
import com.springboot.foodorder.main.service.CommonService;

@RestController
@RequestMapping("/administration")
@CrossOrigin("http://localhost:4200")
public class AdminController {
	
	static String msg = "fail";
	
	@Autowired
	CommonService cs;
	
	@PostMapping("/verify")
	public String verifyAdmin(@RequestBody Admin admin) {
		
		this.msg = "fail";
		
		List<Admin> admins = cs.getAdmin(admin.getUsername());
		
		if(!admins.isEmpty()) {
			admins.stream().forEach(obj -> {
			if(obj.getPassword().equals(admin.getPassword())) 
				{msg ="success"+ String.valueOf(obj.getId());}
			
			
		}
		);}
		
		return msg;
		
	}
	
	@GetMapping("/add")
	public void addAdmin(@RequestBody Admin admin) {
		cs.addAdmin(admin);
	}

	

}

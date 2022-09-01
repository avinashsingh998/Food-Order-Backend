package com.springboot.foodorder.main.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.foodorder.main.model.Food;
import com.springboot.foodorder.main.service.CommonService;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200")
public class FoodController {
	
	@Autowired
	CommonService cs;
	
	@PostMapping("administration/home/add")
	public String addFood(HttpServletRequest req, @RequestBody Food food) {
		String result  = "fail";
		cs.addFood(food);
		result = "success";
	
		return result;
		
	}
	
	@GetMapping("/foods")
	public List<Food> getFoods(){
		
		
		List<Food> foods = cs.getAllFoods();
		return foods;
		
	}
	@GetMapping("/food")
	public Food getFood(@RequestParam ("id") String id){
		long ids = Long.parseLong(id);		
		Food food = cs.getFoodById(ids);
		return food;
		
	}

}

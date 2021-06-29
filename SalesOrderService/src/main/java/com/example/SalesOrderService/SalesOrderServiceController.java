package com.example.SalesOrderService;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import antlr.collections.List;

@RestController
@RequestMapping("/port")
public class SalesOrderServiceController {

	
	@Autowired
	private RestTemplate sales;
	
	@GetMapping("/salesorderservice")
	public List<Object> getsalesitems(){
		
		String url = "http://8082/services3/orders";
		Object objects = sales.getForObject(url,Object[].class);
		return Arrays.asList(objects);
	}
	
	
	
}

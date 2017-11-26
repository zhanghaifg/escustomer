package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Card;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
public class CustomerControl {

	@Autowired
	private CustomerRepository customerRepository;
	/*@Autowired
	private Card card;
	@Autowired
	private Customer customer;*/
	
	@RequestMapping(value="/customers",method=RequestMethod.POST)
	public String addCustomer(@RequestBody Customer c){
		System.out.println("---------Print Customer--------");
		System.out.println(c.toString());
		String id = customerRepository.save(c).getId();
		System.out.println("Id:"+id);
		return id;
//		return "success";
	}
	
	@RequestMapping(value="/customers/{id}",method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable("id") String id){
		System.out.println("---------Print Id----------");
		System.out.println(id);
		customerRepository.delete(id);
	}
}

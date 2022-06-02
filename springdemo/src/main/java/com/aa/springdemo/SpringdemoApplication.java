package com.aa.springdemo;

import com.aa.springdemo.entity.*;
import com.aa.springdemo.repository.CustomerCustomRepository;
import com.aa.springdemo.service.CustomerService;
import com.aa.springdemo.service.ItemService;
import com.aa.springdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

//https://programmer.ink/think/a-java-shopping-cart-model.html
@SpringBootApplication
public class SpringdemoApplication implements CommandLineRunner
{

	@Autowired
	private OrderService orderService;
	@Autowired
	private ItemService itemService;
	@Autowired
	private CustomerService customerService;

	@Autowired
	private CustomerCustomRepository customerCustomRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Item item = new Item("item1");
		itemService.createItem(item);
		Address address = new Address("South Austin,tx");
		List<Address> addresses = new ArrayList<>();
		addresses.add(address);
		Customer cust = new Customer("Amit",addresses);
		customerService.createCustomer(cust);
		List<Item> items = itemService.getAllItems();
		Order order = new Order(cust,items,1.0,2.0);
		orderService.createOrder(order);
		System.out.println( "saved item"  + customerService.getAllCustomer().get(0).getName());
		System.out.println(" finding  user by name " + customerService.getCustomerByName("Amit").getName());
		System.out.println("Joining thread, you can press Ctrl+C to shutdown application");
		System.out.println(customerCustomRepository.getAllCustomer().get(0));
		Thread.currentThread().join();
	}
}

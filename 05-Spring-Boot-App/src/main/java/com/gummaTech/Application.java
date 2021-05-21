package com.gummaTech;

import java.util.ArrayList;
import java.util.List;
import  java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gummaTech.entity.Customer;
import com.gummaTech.repository.CustomerRepo;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cst=SpringApplication.run(Application.class, args);
		CustomerRepo  cr=cst.getBean(CustomerRepo.class);
		Customer c=new Customer();
		Boolean b=cr.existsById(601);
		if(!b)
		{
			c.setCid(601);
			c.setCname("hari");
			c.setCadd("hydrabd");
			cr.save(c);
			System.out.println("inserted new record ");
			
		}
		System.out.println("*******##############*******");
		Optional<Customer> cu=cr.findById(302);
		if(cu.isPresent())
		{
			c.setCid(602);
			c.setCname("koti");
			c.setCadd("Guntur");
			cr.save(c);
			System.out.println("inserted one more record");
		}
		
		Integer d=(int) cr.count();
		System.out.println(d);
		
		
		System.out.println("***&&&&&&&&&&&********");
		List<Customer> cus=new ArrayList<>();
		cus.add(new Customer(801,"mohan","kukatpally"));
		cus.add(new Customer(802,"asok","lbnagar"));
		cr.saveAll(cus);
		System.out.println("multiple records inserted");
                System.out.println("welcome oracel");
System.out.println("*********==========******");




		
	
		
		
		
		
		cst.close();
		

	}

}

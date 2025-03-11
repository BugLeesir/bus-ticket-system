package com.lyr.busticketsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yunruili
 */
@SpringBootApplication
@MapperScan("com.lyr.busticketsystem.dao")
public class BusTicketSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTicketSystemApplication.class, args);
	}

}

package com.example.car_api_test;

import com.example.car_api_test.Main.Menu;
import com.example.car_api_test.models.Carro;
import com.example.car_api_test.service.ConsumirApi;
import com.example.car_api_test.service.Converter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApiTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarApiTestApplication.class, args);
	}
	private Menu menu = new Menu();
	@Override
	public void run(String... args) throws Exception {
		menu.Menu();
	}
}

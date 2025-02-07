package com.example.lamp;

import org.springframework.boot.SpringApplication;

public class TestLampApplication {

	public static void main(String[] args) {
        Object LampApplication;
        SpringApplication.from(LampApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

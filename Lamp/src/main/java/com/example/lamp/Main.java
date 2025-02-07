package com.example.lamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
	public static void main(String[] args) {
		// Создаем Spring-контейнер
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

		// Получаем объект Switch из Spring-контейнера
		Switch switchDevice = context.getBean(Switch.class);

		// Вызов метода turnOn()
		switchDevice.turnOn();
	}
}
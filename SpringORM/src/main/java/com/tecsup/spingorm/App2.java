package com.tecsup.spingorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.tecsup.spingorm.model.Programa;

public class App2 {

	public static void main(String[] args) {

		App negocio = new App();
			List<Programa> listado = negocio.createCars();
			System.out.println(listado.size());
	}
	
}

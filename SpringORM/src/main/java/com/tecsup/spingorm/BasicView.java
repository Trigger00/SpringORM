package com.tecsup.spingorm;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.tecsup.spingorm.model.Programa;

 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private List<Programa> cars;
         private App service;
 

    public void init() {
        cars = service.createCars();
        System.out.println("mira esa nota papa"+cars);
    }
     
    public List<Programa> getCars() {
    	

		App negocio = new App();
			List<Programa> listado = negocio.createCars();
			System.out.println(listado.size());
    	
    	 cars = listado;
        System.out.println("mira esa nota papa 2"+cars);
    	return cars;
        
    }
 
    public void setService(App service) {
        this.service = service;
    }
}
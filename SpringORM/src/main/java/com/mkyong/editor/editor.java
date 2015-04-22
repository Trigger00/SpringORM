package com.mkyong.editor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean(name = "mapaBean")
@RequestScoped
public class editor {

	private MapModel modelo = new DefaultMapModel();

	public editor() {
		modelo.addOverlay(new Marker(new LatLng(-12.043729, -76.953144), "Tecsup"));
		modelo.addOverlay(new Marker(new LatLng(-12.0421367, -76.9501667), "BCP - Mercado Productores"));
	}

	public MapModel getModelo() {
		return this.modelo;
	}
}

package com.distribuida.soap;

import java.util.Date;

public class Ojeo {
	private String comentarios,clubActual, fecha;
	private double costoPase;

	public Ojeo () {

	}



	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}



	public void setClubActual(String clubActual) {
		this.clubActual = clubActual;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public void setCostoPase(double costoPase) {
		this.costoPase = costoPase;
	}



	public String getComentarios() {
		return comentarios;
	}

	public String getClubActual() {
		return clubActual;
	}

	public String getFecha() {
		return fecha.toString ();
	}

	public double getCostoPase() {
		return costoPase;
	}



}

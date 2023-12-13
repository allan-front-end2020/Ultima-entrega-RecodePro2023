package com.exemple.services;

import java.util.List;

import com.exemple.models.Destino;



public interface DestinoService {
	
	List<Destino> getAllDestino();
	
	Destino getDestinoById(Long id);
	
	Destino saveDestino ( Destino destino);
	
	Destino upDateDestino(Long id, Destino destinoUpdated);
	
	
	void deleteById(Long id);
	
	
	
	
	
	
	
	
	
	
	
	
	

}

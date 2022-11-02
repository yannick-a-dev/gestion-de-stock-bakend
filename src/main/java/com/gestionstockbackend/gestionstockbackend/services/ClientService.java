package com.gestionstockbackend.gestionstockbackend.services;

import java.util.List;

import com.gestionstockbackend.gestionstockbackend.dto.ClientDTO;

public interface ClientService {

	ClientDTO save(ClientDTO dto);
	
	ClientDTO findById(Integer id);
	
	List<ClientDTO> findAll();
	
	void delete(Integer id);
}

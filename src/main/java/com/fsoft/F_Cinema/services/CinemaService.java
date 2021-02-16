package com.fsoft.F_Cinema.services;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fsoft.F_Cinema.dto.CinemaDTO;
import com.fsoft.F_Cinema.entities.CinemaEntity;

@Service
public interface CinemaService {
	/**
	 * 
	 * @param cinemaDTO
	 * @return CinemaEntity
	 */
	CinemaEntity save(CinemaDTO cinemaDTO);
	
	/**
	 * 
	 * @return List<CinemaEntity>
	 */
	List<CinemaEntity> findAll();
	
	/**
	 * find specify cinema base on username of manager
	 * 
	 * @param username
	 * @return CinemaEntity
	 */
	CinemaEntity findByOwner(Principal principal);
	
}

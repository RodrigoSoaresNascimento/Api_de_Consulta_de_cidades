package com.github.rodrigosoares.citiesnortheastapi.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.rodrigosoares.citiesnortheastapi.states.state.State;

public interface  StateRepository extends JpaRepository <State, Long>{
	

}

package com.github.rodrigosoares.citiesnortheastapi.states.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rodrigosoares.citiesnortheastapi.states.repositories.StateRepository;
import com.github.rodrigosoares.citiesnortheastapi.states.state.State;

@RequestMapping("/states")
@RestController
public class StateResource {
	
	private final StateRepository repository;

	  public StateResource(final StateRepository repository) {
	    this.repository = repository;
	  }

	  @GetMapping
	  public List<State> states() {
	    return repository.findAll();
	  }
	
	

}

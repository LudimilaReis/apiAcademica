package com.apiacademica.resource;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notas")
public class NotasResource {
	
	@GetMapping()
	public void listNotaResource() {
		
	}
	
	@PostMapping()
	public void salvarNotaResource() {
		
	}
	
	@PutMapping()
	public void atualizarNotaResource() {
		
	}
	@DeleteMapping()
	public void excluirNotaResource() {
		
	}

	

}
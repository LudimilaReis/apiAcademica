package com.apiacademica.resource;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvalicoesResource {
	
	@GetMapping()
	public void listAvalicaoResource() {
		
	}
	
	@PostMapping()
	public void salvarAvalicaoResource() {
		
	}
	
	@PutMapping()
	public void atualizarAvalicaoResource() {
		
	}
	@DeleteMapping()
	public void excluirAvalicaoResource() {
		
	}

	

}
package br.com.fiap.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String dataNascimento;
	private BigDecimal telefone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public BigDecimal getTelefone() {
		return telefone;
	}
	public void setTelefone(BigDecimal telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + "]";
	}
	
	
}	
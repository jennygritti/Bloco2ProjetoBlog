package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity // transforma em tabela
@Table(name="tb_postagens") //nomeia a tabela
public class PostagemModel {
	
	@Id // informa que é um ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremento
	private Long id; //long é o mesmo que int, mas com maior quantidade
	
	@NotNull //preechimento obrigatoria
	private String titulo;
	
	@NotNull
	@Size(min=4, max=50) //quantidade de caracteres
	private String texto;
	
	@UpdateTimestamp //usa o mesmo horário do computador
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	
}

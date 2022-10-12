package com.algaworks.cobranca.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Id>{

}

package com.project.demo.Repositorio;

import com.project.demo.Model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCliente extends CrudRepository<Cliente,Long> {



}


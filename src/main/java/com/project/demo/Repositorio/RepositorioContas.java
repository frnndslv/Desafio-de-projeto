package com.project.demo.Repositorio;

import com.project.demo.Model.Cliente;
import com.project.demo.Model.Contas;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioContas extends CrudRepository<Contas,Integer>{

}

package com.example.EventorParties.IService;

import com.example.EventorParties.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);
    Cliente save(Cliente Cliente);
    void update(Cliente Cliente, Long id);
    void delete(Long id);
}

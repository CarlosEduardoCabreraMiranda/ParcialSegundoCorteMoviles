package com.example.EventorParties.Controller;

import com.example.EventorParties.Entity.Cliente;
import com.example.EventorParties.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    //Inyectar el servicio
    @Autowired
    private IClienteService Cservice;

    @GetMapping("/clientes")
    public List<Cliente> findAll() {
        return Cservice.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {
        return Cservice.findById(id);
    }

    @PostMapping("/guardar")
    public Cliente save(@RequestBody Cliente cliente) {
        return Cservice.save(cliente);
    }


    @PutMapping("editar/{id}")
    public void update(@RequestBody Cliente cliente, @PathVariable Long id) {
        Cservice.update(cliente, id);
    }
    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable Long id) {
        Cservice.delete(id);
    }
}

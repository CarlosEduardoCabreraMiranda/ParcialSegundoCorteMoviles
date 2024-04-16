package com.example.EventorParties.Controller;

import com.example.EventorParties.Entity.Evento;
import com.example.EventorParties.IService.IEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/evento")
public class EventoController {

    //Inyectar el servicio
    @Autowired
    private IEventoService Eservice;

    @GetMapping("/eventos")
    public List<Evento> findAll() {
        return Eservice.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Evento> findById(@PathVariable Long id) {
        return Eservice.findById(id);
    }

    @PostMapping("/guardar")
    public Evento save(@RequestBody Evento evento) {
        return Eservice.save(evento);
    }

    @PutMapping("editar/{id}")
    public void update(@RequestBody Evento evento, @PathVariable Long id) {
        Eservice.update(evento, id);
    }
    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable Long id) {
        Eservice.delete(id);
    }
}

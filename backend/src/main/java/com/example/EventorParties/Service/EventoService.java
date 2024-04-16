package com.example.EventorParties.Service;


import com.example.EventorParties.Entity.Evento;
import com.example.EventorParties.IRepository.IEventoRepository;
import com.example.EventorParties.IService.IEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService implements IEventoService {

    @Autowired
    private IEventoRepository Erepository;

    @Override
    public List<Evento> findAll() {return Erepository.findAll();}

    @Override
    public Optional<Evento> findById(Long id) {
        return Erepository.findById(id);
    }

    @Override
    public Evento save(Evento libro) {
        return Erepository.save(libro);
    }

    @Override
    public void update(Evento libro, Long id) {
       /*Optional<Autor>*/Optional<Evento> ps = Erepository.findById(id);

        //Cargar nuevo objeto
        if (ps.isPresent()){
            Evento eventoUpdate = ps.get();
            eventoUpdate.setNombre(libro.getNombre());
            eventoUpdate.setFecha(libro.getFecha());
            eventoUpdate.setCliente(libro.getCliente());
            Erepository.save(eventoUpdate);
        }else{
            System.out.println("No existe el evento");
        }
    }

    @Override
    public void delete(Long id) {
        Erepository.deleteById(id);
    }

}

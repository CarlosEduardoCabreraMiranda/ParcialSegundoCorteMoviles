package com.example.EventorParties.Service;

import com.example.EventorParties.Entity.Cliente;
import com.example.EventorParties.IRepository.IClienteRepository;
import com.example.EventorParties.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    //Conectar con los datos - IRepository
    // Inyección de dependencia
    @Autowired
    private IClienteRepository Crepository;


    @Override
    public List<Cliente> findAll() {
       return Crepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return Crepository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return Crepository.save(cliente);
    }

    @Override
    public void update(Cliente cliente, Long id) {
        //Obtener el objeto cliente y el id
        //Verificar con el id, si exiten los datos
        Optional<Cliente> ps = Crepository.findById(id);

        //Cargar nuevo objeto
        if (ps.isPresent()) {
            Cliente clienteUpdate = ps.get();
            clienteUpdate.setNombre(cliente.getNombre());
            clienteUpdate.setCorreo_electronico(cliente.getCorreo_electronico());
            //Actualizar el objeto cliente
            Crepository.save(clienteUpdate);
        }else{
            System.out.println("No existe el Cliente");
        }
    }

    @Override
    public void delete(Long id) {
        Crepository.deleteById(id);
    }
}

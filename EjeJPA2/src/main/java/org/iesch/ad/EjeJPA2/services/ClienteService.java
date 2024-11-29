package org.iesch.ad.EjeJPA2.services;

import org.iesch.ad.EjeJPA2.model.Cliente;
import org.iesch.ad.EjeJPA2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getClientesConDatos() {
        return clienteRepository.findAll();
    }

    public Cliente getOne(Long id) {
//      return clienteRepository.findById(id).orElse(null);
        return clienteRepository.findIdOptimizado(id);
    }

}

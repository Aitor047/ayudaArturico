package org.iesch.ad.Ejemplo2.services;

import org.iesch.ad.Ejemplo2.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Object getAll() {
       return clienteRepository.findAll();
    }

}

package org.iesch.ad.Ejemplo2.controler;

import org.iesch.ad.Ejemplo2.repositorio.ClienteRepository;
import org.iesch.ad.Ejemplo2.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteControler {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(clienteService.getAll());
    }

}

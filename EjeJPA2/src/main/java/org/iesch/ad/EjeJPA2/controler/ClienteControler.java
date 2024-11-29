package org.iesch.ad.EjeJPA2.controler;

import org.iesch.ad.EjeJPA2.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteControler {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<?> getClientes() {
        return ResponseEntity.ok(clienteService.getClientesConDatos());
    }

    @GetMapping("/clientes/getOne")
    public ResponseEntity<?> getCliente(@RequestParam Long id) {
        return ResponseEntity.ok(clienteService.getOne(id));
    }

}

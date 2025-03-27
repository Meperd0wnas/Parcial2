package com.parcial.pagos.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.parcial.pagos.model.Pago;
import com.parcial.pagos.service.PagosService;



@RestController
@RequestMapping("/pagos")
@CrossOrigin(origins = "*") 
public class PagosController {

    @Autowired
    private PagosService pagosService;

    // POST /pagar
    @PostMapping
    public Pago Pagar(@RequestBody Pago pago) {
        return pagosService.crearPago(pago);
    }

    // GET /para ver los detalles del pago
    @GetMapping("/{id}")
    public Optional<Pago> obtenerPorId(@PathVariable String id) {
        return pagosService.obtenerPorId(id);
    }


}
package com.parcial.pagos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.parcial.pagos.model.Pago;
import com.parcial.pagos.repository.PagosRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class PagosService {

    private final PagosRepository pagosRepository;

    // Guardar
    public Pago crearProducto(Pago pago) {
        return  pagosRepository.save(pago);
    }

    // Obtener todos 
    public List<Pago> obtenerTodos() {
        return pagosRepository.findAll();
    }

    // Obtener
    public Optional<Pago> obtenerPorId(String id) {
        return pagosRepository.findById(id);
    }

    // Actualizar 
    public Pago actualizarProducto(Pago pago) {
        return pagosRepository.save(pago);
    }

    // Eliminar 
    public void eliminarProducto(String id) {
        pagosRepository.deleteById(id);
    }
}
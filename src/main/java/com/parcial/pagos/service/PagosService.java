package com.parcial.pagos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.parcial.pagos.model.Pago;
import com.parcial.pagos.model.Producto;
import com.parcial.pagos.repository.PagosRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class PagosService {

    private final PagosRepository pagosRepository;

    // registrar el pago con la validacion (Crear)
    public Pago crearPago(Pago pago) {
        int valorTotalEsperado = pago.getValorTotal();
        int ValorTotalReal = 0;
        ArrayList<Producto> productosDePago = pago.getProductos();
        for(Producto producto: productosDePago){
            ValorTotalReal += producto.getPrecio();
        }
        if( ValorTotalReal == valorTotalEsperado){
            return  pagosRepository.save(pago);
        }else{return null;
        }
        
    }

    // Obtener
    public Optional<Pago> obtenerPorId(String id) {
        return pagosRepository.findById(id);
    }

    // Actualizar 
    public Pago actualizarPago(Pago pago) {
        return pagosRepository.save(pago);
    }

    // Eliminar 
    public void eliminarPago(String id) {
        pagosRepository.deleteById(id);
    }
}
package com.parcial.pagos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.parcial.pagos.model.Pago;

@Repository
public interface PagosRepository extends MongoRepository< Pago ,String> {
    
}

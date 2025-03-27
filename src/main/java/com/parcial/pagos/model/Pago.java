package com.parcial.pagos.model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
@Indexed
public class Pago {
    private String id;
    private ArrayList<Producto> productos;
    private int valorTotal;

    
}

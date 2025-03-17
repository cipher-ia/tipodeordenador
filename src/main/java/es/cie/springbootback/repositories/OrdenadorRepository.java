package es.cie.springbootback.repositories;

import java.util.List;

import es.cie.springbootback.Ordenador;

public interface OrdenadorRepository {

    List<Ordenador> buscarTodos();
    void insertar (Ordenador ordenador);
    Ordenador buscarUno(String serie);
    void borrar (Ordenador ordenador);
    List<Ordenador> mostrarElementos(int atras, int vista);
        
    
}

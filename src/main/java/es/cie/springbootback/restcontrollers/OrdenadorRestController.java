package es.cie.springbootback.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cie.springbootback.Ordenador;
import es.cie.springbootback.repositories.OrdenadorRepository;

@RestController
@RequestMapping("webapi/ordenador")

public class OrdenadorRestController {

    @Autowired
    @Qualifier("jdbc")

    private OrdenadorRepository ordenadorRepository;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List <Ordenador> buscarTodos() {

        return ordenadorRepository.buscarTodos();
        
    }


    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public void insertar(@RequestBody Ordenador ordenador){

        ordenadorRepository.insertar(ordenador);

    }

    @GetMapping ({"/{serie}"})
    @CrossOrigin(origins = "http://localhost:4200")
    public Ordenador buscarUno (@PathVariable String serie){

        return ordenadorRepository.buscarUno(serie);

    }

    @DeleteMapping("/{serie}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void borrar(@PathVariable String serie){

        ordenadorRepository.borrar(new Ordenador(serie));

    }
}

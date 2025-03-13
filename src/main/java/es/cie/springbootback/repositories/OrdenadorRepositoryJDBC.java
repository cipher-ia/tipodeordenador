package es.cie.springbootback.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.cie.springbootback.Ordenador;

@Repository
@Qualifier("jdbc")
public class OrdenadorRepositoryJDBC implements OrdenadorRepository {

    @Autowired
    private JdbcTemplate plantilla;

    @Override
    public List<Ordenador> buscarTodos() {
       
        return plantilla.query("select * from ordenador ", new OrdenadorRowMapper());

    }

    @Override
    public void insertar(Ordenador ordenador) {
        plantilla.update("insert into ordenador values (?,?,?,?)", ordenador.getModelo(),ordenador.getMarca(), ordenador.getPrecio(), ordenador.getSerie());
    }

    @Override
    public Ordenador buscarUno(String serie) {
        return plantilla.queryForObject("select * from ordenador where numerodeserie=?", new OrdenadorRowMapper(),serie);
    }

    @Override
    public void borrar(Ordenador ordenador) {
        plantilla.update("delete from ordenador where numerodeserie=?", ordenador.getSerie());
    }

}

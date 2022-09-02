package org.example.domain;

import co.com.sofka.domain.generic.Entity;
import org.example.domain.values.JugadorId;
import org.example.domain.values.Mazo;

public class Jugador extends Entity<JugadorId> {
    private final String alias;

    public Jugador(JugadorId id, String alias, Mazo mazo) {
        super(id);
        this.alias = alias;
    }



    public String alias() {
        return alias;
    }
}

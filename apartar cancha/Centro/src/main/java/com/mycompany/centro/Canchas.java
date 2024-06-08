
package com.mycompany.centro;

import com.mycompany.centro.people.Deportista;
import com.mycompany.centro.people.Entrenador;
import com.mycompany.centro.people.type.TypeSport;

public class Canchas {
    private String name;
    private String location;
    private TypeSport escenary;
    private Deportista reserved;
    
    public Canchas(String name, String location, TypeSport escenary) {
        this.name = name;
        this.location = location;
        this.escenary = escenary;
         this.reserved = null;
    }

    public boolean reservar(Deportista deportista) {
        if (this.reserved == null) {
            this.reserved = deportista;
            System.out.println("La cancha " + this.name + " ha sido reservada por " + deportista.getName());
            return true;
        } else {
            System.out.println("La cancha " + this.name + " ya está reservada por " + this.reserved.getName());
            return false;
        }
    }
    
    public void liberar() {
        if (this.reserved != null) {
            System.out.println("La cancha " + this.name + " ha sido liberada.");
            this.reserved = null;
        } else {
            System.out.println("La cancha " + this.name + " ya está libre.");
        }
    }

    
    
    
}

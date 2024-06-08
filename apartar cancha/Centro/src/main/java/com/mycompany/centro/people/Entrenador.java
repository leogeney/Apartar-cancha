
package com.mycompany.centro.people;

import com.mycompany.centro.interfaces.informarse;
import com.mycompany.centro.people.type.TypeSport;


public class Entrenador extends Person implements informarse{
    
   private int experience;
   private Deportista reserved;
    public Entrenador(int experience, String name, String id, TypeSport sport) {
        super(name, id, sport);
        this.experience = experience;
        this.reserved = null;
    }

    @Override
    public void InformarseDeLoNuevo() {
        System.out.println("entrenador informandose...");
    }
   
    @Override
    public void irEntrenar(){
    
        System.out.println("Ir a entrenar un deportista");
    }

    @Override
    public String toString() {
        return  "experience:"+experience + " name:" +name+" id:" + id +" deporte:" + sport ;
    }

    public String getName() {
        return name;
    }
    
    
    public boolean reservar(Deportista deportista) {
        if (this.reserved == null) {
            this.reserved = deportista;
            System.out.println("El entrenador " + this.name + " tendra clases con " + deportista.getName());
            return true;
        } else {
            System.out.println("el entrenador " + this.name + " ya tiene clases con " + this.reserved.getName());
            return false;
        }
    }
    
    public void liberar() {
        if (this.reserved != null) {
            System.out.println("el entrenador " + this.name + " ha terminado.");
            this.reserved = null;
        } else {
            System.out.println("el entrenador " + this.name + " ya está libre.");
        }
    }
    
    
   
    
}


package com.mycompany.centro.people;

import com.mycompany.centro.interfaces.Dopping;
import com.mycompany.centro.interfaces.dieta;
import com.mycompany.centro.people.type.TypeSport;


public class Deportista extends Person implements Dopping , dieta{
    boolean professional;

    public Deportista(boolean professional, String name, String id, TypeSport sport) {
        super(name, id, sport);
        this.professional = professional;
    }

    @Override
    public void PruebaDopping() {
        
        System.out.println("prueba dopping");
    }

    @Override
    public void HacerDieta() {
        System.out.println("haciendo dieta");
    }
    
    @Override
    public void irEntrenar(){
    
        System.out.println("entrenando");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "professional"+professional + " name:" +name+" id:" + id +" deporte:" + sport;
    }
    
    
    
}

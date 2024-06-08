package com.mycompany.centro;

import com.mycompany.centro.people.Deportista;
import com.mycompany.centro.people.Entrenador;
import static com.mycompany.centro.people.type.TypeSport.FUTBOL;
import static com.mycompany.centro.people.type.TypeSport.VOLEY;
import java.util.Scanner;

public class Centro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bucle = true;
        int opcEntrenador;
        Entrenador entren1 = new Entrenador(3, "leonardoFIT", "1234", FUTBOL);
        Entrenador entren2 = new Entrenador(3, "leoCOACH", "14534", VOLEY);

        Deportista depor1 = new Deportista(true, "leitoFUT", "1232", FUTBOL);
        Deportista depor2 = new Deportista(true, "heloVOL", "1421", VOLEY);

        Canchas canch1 = new Canchas("polideportivo", "hoyito", FUTBOL);
        Canchas canch2 = new Canchas("BERNABEU", "ESTADIO", VOLEY);
        
        
        
        entren1.reservar(depor1);
        
        entren1.reservar(depor2);
        
        entren1.liberar();
        entren1.liberar();
        
        canch1.reservar(depor2);

     /*   while (bucle) {
            System.out.println("1. Deportista 1");
            System.out.println("2. Deportista 2");
            System.out.println("3. Cerrar programa");
            int opc = entrada.nextInt();
            switch (opc) {

                case 1:
                    System.out.println("entrenadores:");
                    System.out.println("1. " + entren1);
                    System.out.println("2." + entren2);
                    System.out.println("elegi entrenador");
                    opcEntrenador = entrada.nextInt();

                    try {

                        if (opcEntrenador == 1) {
                            entren1.reservar(depor1);

                        } else if (opcEntrenador == 2) {

                            System.out.println("no puedes reservar un entrenador de otro deporte ");
                        }

                    } catch (Exception ex) {
                        System.out.println("error " );
                    }
                    
                    System.out.println("canchas:");
                    
                    
                 
                    
                    
                   
                    
                    
                    
                    

                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("has salido del programa");
                    bucle = false;
                    break;

            }

        } */

    }
}

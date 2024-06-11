package com.mycompany.parte2;

import static com.mycompany.parte2.actividades.Activitys.FIFA;
import static com.mycompany.parte2.actividades.Activitys.KRUNKER;
import static com.mycompany.parte2.actividades.Activitys.VALORANT;
import com.mycompany.parte2.students.Students;
import java.util.ArrayList;

public class Parte2 {

    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList();

        Students students1 = new Students("LEONARDO JOSE GENEY LOPEZ", "SISTEMAS", FIFA);
        Students students2 = new Students("LEONARDO JOSE GENEY LOPEZ", "SISTEMAS", KRUNKER);
        Students students3 = new Students("MARIA PAULA GENEY LOPEZ", "ESTUDIANTE", VALORANT);

        System.out.println("Estudiantes registrados");
        System.out.println("1. " + students1);
        System.out.println("2. " + students2);
        System.out.println("3. " + students3);

        if (students1.getName() == students2.getName()) {
            System.out.println("el estudiante " + students1.getName() + " ya tiene actividad " + students1.getActivity());

            students1.crearArchivo();
            students1.escribirArchivo();

            students3.crearArchivo();
            students3.escribirArchivo();

            list.add(students1);
            list.add(students3);
            System.out.println("total de admitidos:" + list.size() );
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));

            }
        }

        if (students1.getName() == students3.getName()) {

            System.out.println("el estudiante " + students1.getName() + " ya tiene actividad " + students1.getActivity());

            students1.crearArchivo();
            students1.escribirArchivo();

            students2.crearArchivo();
            students2.escribirArchivo();
            list.add(students1);
            list.add(students2);

            System.out.println("total de admitidos:" + list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }}

            if (students2.getName() == students3.getName()) {
                System.out.println("el estudiante " + students2.getName() + " ya tiene actividad " + students2.getActivity());

                students2.crearArchivo();
                students2.escribirArchivo();

                students3.crearArchivo();
                students3.escribirArchivo();

                list.add(students2);
                list.add(students3);

                System.out.println("total de admitidos:" + list.size() );
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));

                }

            }
        }}

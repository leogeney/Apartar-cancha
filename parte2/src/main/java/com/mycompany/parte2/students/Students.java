package com.mycompany.parte2.students;

import com.mycompany.parte2.actividades.Activitys;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Students {

    private String name;
    private String carrera;
    private Activitys activity;
    private File file;
    
    

    public Students(String name, String carrera, Activitys activity) {
        this.name = name;
        this.carrera = carrera;
        this.activity = activity;
    }
    
    
    public void crearArchivo(){
        file = new File("datos.txt");
    try{
        if(file.createNewFile()){
        }
        
        
    
    
    }catch(IOException ex){
        System.out.println("error al crear el archivo");
    }
    
    
    }
    
    
    

    public String getName() {
        return name;
    }

    public Activitys getActivity() {
        return activity;
    }
    
    
    
    
    
    
    

    @Override
    public String toString() {
        String names[] = name.split(" ");
        char name1 = names[0].charAt(0); 
        char name2 = names[1].charAt(0);
        char name3 = names[2].charAt(0);
        char name4 = names[3].charAt(0);
        int aleatorio =(int)(Math.random() * 100);
        String number = aleatorio+"";
        return  "name:" + name + " activity:" + activity + " CODIGO:"+name1 +name2 +name3 +name4+number;
        
        
        
        
    }
    public void escribirArchivo(){
    
    try{
        FileWriter writer = new FileWriter(file,true);
        
        writer.write(name+";"+carrera+";"+activity);
       writer.write("\n");
        writer.close();
    
    }catch(IOException ex){
        System.out.println("error" );
    
    }
    }
    
    

}

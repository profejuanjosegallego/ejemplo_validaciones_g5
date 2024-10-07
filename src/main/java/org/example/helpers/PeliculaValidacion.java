package org.example.helpers;

import org.example.modelos.Pelicula;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeliculaValidacion {

    //Voy a traer otra clase:
    //INYECCION DE DEPENDENCIAS
    private Pelicula pelicula=new Pelicula();

    //Implementar metodos para validar informacion
    public boolean validarId(Integer id){
        //id no puede ser un numero negativo
        //id no puede ser mayor a 5000000
        if(id<0){
           return false;
        }else if(id>5000000){
            return false;
        }else{
            return true;
        }


    }

    public boolean validarNombre(String nombre){
        //se prohiben los numeros
        //se prohiben los caracteres especiales
        return true;
    }

    public boolean validarFecha(LocalDate fecha){
        //peliculas anteriores a 1920
        int anio=fecha.getYear();
        if(anio<1920){
            return false;
        }else{
            return true;
        }
    }

    public boolean validarDuracion(Integer duracion){
        //peliculas prohibidas si duran mas de 200 minutos
        if(duracion>200){
            return false;
        }else{
            return true;
        }
    }

    public boolean validarSinopsis(String sinopsis){
        //no debe tener menos de 100 caracteres
        //no debe tener mas 500 caracteres

        if(sinopsis.length()<100 || sinopsis.length()>500){
            return false;
        }else{
            return true;
        }


    }




}

package com.Sofka.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Jugador {
    //atributos
    private String jugador;
    private double premio;
    private static int idJugador;
    private List<String> listaJugadores = new ArrayList<>();


    //constructores
    public Jugador(){

    }

    public Jugador(String jugador){
        this.jugador = jugador;
    }

    //metodos
    public String validarNombreJugador(){
        Scanner capturarNombre = new Scanner(System.in);
        String validarNombre = "";
        while (validarNombre.isEmpty()){
            System.out.println("Ingrese el nombre del jugador:");
            String nombreUsuario = capturarNombre.nextLine();
            if(nombreUsuario.isEmpty()) {
                System.out.println("Debe ingresar un nombre de usuario.");
            }
            validarNombre = nombreUsuario;
        }
        return validarNombre;
    }

    public void guardarNombreJugador(String nombreJugador){
        if(listaJugadores.contains(nombreJugador)){
            System.out.println("El usuario ya esta registrado");
        }
        listaJugadores.add(nombreJugador);
    }

    public void mostrarListaJugadores(){
        if (listaJugadores.isEmpty()){
            System.out.println("No hay registro de usuarios");
        }
        int contador = 1;
        for (String jugador : listaJugadores){
            System.out.println(contador + ": " + jugador);
            contador++;
        }
    }

}

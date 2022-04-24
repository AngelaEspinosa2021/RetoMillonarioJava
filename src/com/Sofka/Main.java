package com.Sofka;

import com.Sofka.controladores.Consultas;
import com.Sofka.entidades.Juego;
import com.Sofka.entidades.Jugador;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        Jugador jugador = new Jugador();
        Consultas jugadores = new Consultas();
        jugadores.agregarJugador();
        jugadores.consultarJugadores();
        int opcion = -1;
        while(opcion != 0){
            try {
                System.out.println("=================================");
                System.out.println("           BIENVENIDO            ");
                System.out.println("=================================");
                System.out.println("  1. Iniciar Partida.            ");
                System.out.println("  2. Mostrar Record de Jugadores.");
                System.out.println("  0. Salir del Juego.            ");
                System.out.println("=================================");
                Scanner menu = new Scanner(System.in);
                opcion = menu.nextInt();

                switch (opcion) {
                    case 1:
                        var nombreJugador = jugador.validarNombreJugador();
                        jugador.guardarNombreJugador(nombreJugador);
                        int valor = juego.iniciarJuego(nombreJugador);
                        if(valor == 0){
                            break;
                        }
                        break;
                    case 2:
                        jugador.mostrarListaJugadores();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Seleccione una opcion valida");
                        break;

                }
                System.out.println("===========================");
                System.out.println("Seleccion una opcion:      ");
                System.out.println(" 1. Iniciar Nueva Partida. ");
                System.out.println(" 0. Salir del Juego      . ");
                opcion=menu.nextInt();

            } catch (Exception e) {
                System.out.println("Favor ingresar solo números.");
                opcion = 9;
            }
        }
        System.out.println("Muchas Gracias Hasta Pronto");
    }
}
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
        int opcion = -1;
        while(opcion != 0){
            try {
                System.out.println("-----Bienvenido a la TRIVIA-----");
                System.out.println("SELECCIONE UNA OPCION"
                        + "\n 1. Jugar."
                        + "\n 0. salir.");
                Scanner menu = new Scanner(System.in);
                opcion = menu.nextInt();

                switch(opcion){
                    case 1:
                        int opcion2 = -1;
                        while (opcion2 != 3){
                            System.out.println("=================================");
                            System.out.println("           BIENVENIDO            ");
                            System.out.println("=================================");
                            System.out.println("  1. Iniciar Partida.            ");
                            System.out.println("  2. Mostrar Record de Jugadores.");
                            System.out.println("  0. Salir del Juego.            ");
                            System.out.println("=================================");
                            Scanner menu2 = new Scanner(System.in);
                            int opcion3 = menu2.nextInt();
                            switch (opcion3) {
                                case 1:
                                    var nombreJugador = jugador.validarNombreJugador();
                                    jugadores.agregarJugador(nombreJugador);
                                    int valor = juego.iniciarJuego(nombreJugador);
                                    if(valor == 0){
                                        break;
                                    }
                                    break;
                                case 2:
                                    jugadores.consultarJugadores();
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
                            Scanner menu3 = new Scanner(System.in);
                            opcion2=menu3.nextInt();
                        }
                    case 0:
<<<<<<< HEAD
                        System.out.println("Salio del juego");
=======
                        jugadores.eliminarJugadores();
>>>>>>> 4f8e13c64c311ad5665dc4a64c937cae90e6595a
                        break;

                    default:
                        System.out.println("No seleccionaste una opcion valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Favor ingresar solo números.");
                opcion = 2;
            }
        }
        System.out.println("Muchas Gracias Hasta Pronto");
    }
}
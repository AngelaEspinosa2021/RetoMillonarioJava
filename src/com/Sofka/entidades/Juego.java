package com.Sofka.entidades;

import com.Sofka.bancopregunta.*;
import com.Sofka.controladores.Consultas;

import java.util.Scanner;

public class Juego {
    /*Jugador jugador = new Jugador();
    Consultas jugadores = new Consultas();*/
    public BancoPregunta bancoPregunta = new BancoPregunta();

    public int puntajeFinal;
    int validacion = 0;
    int comprobar = -1;
    int idNivel = 1;

    Scanner opcionJugador = new Scanner(System.in);

    public int iniciarJuego(String jugador) {
        this.puntajeFinal = 0;
        System.out.println("Primera Pregunta");
        int nivelUno = this.primerNivel();
        if (nivelUno == 1)
        {
            siguienteNivel(nivelUno, jugador);
            System.out.println("Segunda Pregunta");
            int nivelDos = this.segundoNivel();
            if (nivelDos == 1) {
                siguienteNivel(nivelDos, jugador);
                System.out.println("Tercera Pregunta");
                int nivelTres = this.tercerNivel();
                if (nivelTres == 1) {
                    siguienteNivel(nivelTres, jugador);
                    System.out.println("Cuarta Pregunta");
                    int nivelCuatro = this.cuartoNivel();
                    if (nivelCuatro == 1) {
                        siguienteNivel(nivelCuatro, jugador);
                        System.out.println("Ultima Pregunta, Por el Premio Mayor");
                        int nivelCinco = this.quintoNivel();
                        if (nivelCinco == 1) {
                            System.out.println("----FELICIDADES GANASTE EL PREMIO MAYOR----");
                            siguienteNivel(nivelCinco, jugador);
                        }
                        siguienteNivel(nivelCinco, jugador);
                    }
                    siguienteNivel(nivelCuatro, jugador);
                }
                siguienteNivel(nivelTres, jugador);
            }
            siguienteNivel(nivelDos, jugador);
        }
        siguienteNivel(nivelUno, jugador);
        return 0;
    }


    private int siguienteNivel(int nivel,String jugador){
        if (nivel == 1) {
            asignarScoreJugador(nivel, jugador, idNivel);
            idNivel++;
            return 0;
        }
        if (nivel == 2){
            asignarScoreJugador(nivel, jugador, idNivel);
            this.puntuacion(jugador, this.puntajeFinal);
            return 0;
        }
        if (nivel == 0){
            asignarScoreJugador(nivel, jugador, idNivel);
            this.puntuacion(jugador, this.puntajeFinal);
            return 0;
        }
        return 0;
    }

    private int primerNivel() {
        bancoPregunta.setPrimerNivel();
        while(comprobar != 3){
            String respuesta = opcionJugador.nextLine();
            String resultado = bancoPregunta.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validacion = asignarValidacion(resultado);
            switch (validacion)
            {
                case -1:
                    comprobar = 1;
                    bancoPregunta.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validacion;
    }

    private int segundoNivel() {
        bancoPregunta.setSegundoNivel();
        while (comprobar != 3){
            String respuesta = opcionJugador.nextLine();
            String resultado = bancoPregunta.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validacion = asignarValidacion(resultado);
            switch (validacion)
            {
                case -1:
                    comprobar = 1;
                    bancoPregunta.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validacion;
    }

    private int tercerNivel() {
        bancoPregunta.setTercerNivel();
        while(comprobar!=3){
            String respuesta = opcionJugador.nextLine();
            String resultado = bancoPregunta.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validacion = asignarValidacion(resultado);
            switch (validacion)
            {
                case -1:
                    comprobar = 1;
                    bancoPregunta.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validacion;
    }

    private int cuartoNivel() {
        bancoPregunta.setCuartoNivel();
        while(comprobar!=3){
            String respuesta = opcionJugador.nextLine();
            String resultado = bancoPregunta.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validacion = asignarValidacion(resultado);
            switch (validacion)
            {
                case -1:
                    comprobar = 1;
                    bancoPregunta.setCuartoNivel();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validacion;
    }

    private int quintoNivel() {
        bancoPregunta.setQuintoNivel();
        while(comprobar != 3){
            String respuesta = opcionJugador.nextLine();
            String resultado = bancoPregunta.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validacion = asignarValidacion(resultado);
            switch (validacion)
            {
                case -1:
                    comprobar = 1;
                    bancoPregunta.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validacion;
    }

    public int asignarValidacion(String resultado){
        int validacion = -1;
        if (resultado.equalsIgnoreCase("Respuesta incorrecta")){
            validacion = 0;
        }
        if (resultado.equalsIgnoreCase("El usuario se retira")){
            validacion = 2;
        }
        if (resultado.equalsIgnoreCase("Respuesta correcta")){
            validacion = 1;
        }
        return validacion;
    }

    public void asignarScoreJugador(int nivel, String jugador,int idNivel)
    {
        if((nivel == 1)&&(nivel == 2)){
            switch (idNivel){
                case(1):
                    puntajeFinal = 100;
                    this.puntuacion(jugador, this.puntajeFinal);
                    break;
                case(2):
                    puntajeFinal = 150;
                    this.puntuacion(jugador, this.puntajeFinal);
                    break;
                case(3):
                    puntajeFinal = 200;
                    this.puntuacion(jugador, this.puntajeFinal);
                    break;
                case(4):
                    puntajeFinal = 250;
                    this.puntuacion(jugador, this.puntajeFinal);
                    break;
                case(5):
                    puntajeFinal = 300;
                    this.puntuacion(jugador, this.puntajeFinal);
                    break;
            }

        }
        this.puntajeFinal = 0;
    }

    public void puntuacion(String jugador, int puntajeFinal) {

        System.out.println(jugador + " Tu puntaje fue de: " + puntajeFinal);
    }

}

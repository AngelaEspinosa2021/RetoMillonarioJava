package com.Sofka.entidades;

import com.Sofka.bancopregunta.*;

import java.util.Scanner;

public class Juego {

    public BancoPregunta bancoPregunta = new BancoPregunta();

    public int puntajeFinal;
    int[] resultadoPorNivel = new int[2];
    int validacion = 0;
    int comprobar = -1;
    Scanner jugador = new Scanner(System.in);

    public int iniciarJuego(String jugador){
        this.puntajeFinal = 0;

        System.out.println("Primera Pregunta");
        int[] nivelUno = this.primerNivel();
        asignarScoreJugador(nivelUno,jugador);
        System.out.println("Segunda Pregunta");
        int[] nivelDos = this.segundoNivel();
        asignarScoreJugador(nivelDos,jugador);
        System.out.println("Tercera Pregunta");
        int[] nivelTres = this.tercerNivel();
        asignarScoreJugador(nivelTres,jugador);
        System.out.println("Cuarta Pregunta");
        int[] nivelCuatro = this.cuartoNivel();
        asignarScoreJugador(nivelCuatro,jugador);
        System.out.println("Ultima Pregunta, Por el Premio Mayor");
        int[] nivelCinco = this.quintoNivel();
        asignarScoreJugador(nivelCinco,jugador);

        System.out.println("----FELICIDADES GANASTE EL PREMIO MAYOR----");
        this.puntuacion(jugador, this.puntajeFinal);
        return 1;
    }

    public int asignarScoreJugador(int[] nivel, String jugador){
        if(nivel[0] == 0){
            this.puntajeFinal = 0;
            this.puntuacion(jugador, this.puntajeFinal);
            return 0;
        }
        if(nivel[0] == 2){
            this.puntuacion(jugador, this.puntajeFinal);
            return 0;
        }
        this.puntajeFinal += nivel[1];
        return 0;
    }


    private int[] primerNivel() {
        bancoPregunta.setPrimerNivel();
        while(comprobar != 3){
            String respuesta = jugador.nextLine();
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
        int scoreNivel = 100;
        resultadoPorNivel[0]=validacion;
        resultadoPorNivel[1]=scoreNivel;
        return resultadoPorNivel;
    }

    private int[] segundoNivel() {
        bancoPregunta.setSegundoNivel();
        while (comprobar != 3){
            String respuesta = jugador.nextLine();
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
        int scoreNivel = 100;
        resultadoPorNivel[0]=validacion;
        resultadoPorNivel[1]=scoreNivel;
        return resultadoPorNivel;
    }

    private int[] tercerNivel() {
        bancoPregunta.setTercerNivel();
        while(comprobar!=3){
            String respuesta = jugador.nextLine();
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
        int scoreNivel = 100;
        resultadoPorNivel[0]=validacion;
        resultadoPorNivel[1]=scoreNivel;
        return resultadoPorNivel;
    }

    private int[] cuartoNivel() {
        bancoPregunta.setCuartoNivel();
        while(comprobar!=3){
            String respuesta = jugador.nextLine();
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
        int scoreNivel = 100;
        resultadoPorNivel[0]=validacion;
        resultadoPorNivel[1]=scoreNivel;
        return resultadoPorNivel;
    }

    private int[] quintoNivel() {
        bancoPregunta.setQuintoNivel();
        while(comprobar != 3){
            String respuesta = jugador.nextLine();
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
        int scoreNivel = 100;
        resultadoPorNivel[0]=validacion;
        resultadoPorNivel[1]=scoreNivel;
        return resultadoPorNivel;
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

    public void puntuacion(String jugador, int puntajeFinal) {
        System.out.println(jugador + " Tu puntaje fue de: " + puntajeFinal);

    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego("Jaime");
    }
}

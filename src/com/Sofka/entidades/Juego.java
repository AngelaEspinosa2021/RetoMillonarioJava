package com.Sofka.entidades;

import com.Sofka.bancopregunta.BancoPregunta;
import com.Sofka.bancopregunta.PrimerNivel;

import java.util.Scanner;

public class Juego {

<<<<<<< HEAD
    public Scanner consola= new Scanner(System.in);
    BancoPregunta  bancoPregunta = new BancoPregunta();

    public void iniciarJuego(){
        this.pasarNivel();
    }

    public void pasarNivel(){
        bancoPregunta.setPrimerNivel();
        System.out.println(bancoPregunta.evaluarRespuesta("A","B"));
    }

    public int validadorNivel(String valor){
        switch (valor){
            case "Respuesta correcta": return 1;
            case "Respuesta Incorrecta": return 2;
            case "Salir del juego":return 3;
        }
        return  0;
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego();
=======
    public int puntajeFinal;

    public int iniciarJuego(String jugador){
        this.puntajeFinal = 0;
        System.out.println("Primera Pregunta");
        int primerNivel = this.primerNivel();
        if(primerNivel == 0){
            this.puntajeFinal = 0;
            this.puntuacion(jugador, this.puntajeFinal);
            return 0;
        }
        if(primerNivel == 0){
            this.puntuacion(jugador, this.puntajeFinal);
            return 0;
        }
        this.puntajeFinal += 100;
        System.out.println("Segunda Pregunta");

        return 1;
    }

    private int primerNivel() {

        Scanner jugador = new Scanner(System.in);
        PrimerNivel primerNivel = new PrimerNivel();
        String primeraPregunta = primerNivel.preguntasNivelUno();

        int validacion = 0;
        int comprobar = -1;
        while(comprobar != 3){
            String respuesta = jugador.nextLine();
            BancoPregunta preguntaDos = new BancoPregunta();
            String resultado = preguntaDos.evaluarRespuesta(primeraPregunta,respuesta);
            System.out.println(resultado);
            validacion = -1;
            if (resultado.equalsIgnoreCase("Respuesta incorrecta")){
                validacion = 0;
            }
            if (resultado.equalsIgnoreCase("El usuario se retira")){
                validacion = 2;
            }
            if (resultado.equalsIgnoreCase("Respuesta correcta")){
                validacion = 1;
            }
            switch (validacion)
            {
                case -1:
                    comprobar = 1;
                    //primerNivel.imprimirPregunta();
                    break;
                default:
                    comprobar = 3;
                    break;
            }

        }

        return validacion;
    }

    public void puntuacion(String jugador, int puntajeFinal) {
        System.out.println(jugador + " Tu puntaje fue de: " + puntajeFinal);
>>>>>>> main
    }

}

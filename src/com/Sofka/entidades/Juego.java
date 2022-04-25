package com.Sofka.entidades;

import com.Sofka.bancopregunta.*;
import com.Sofka.controladores.Consultas;

import java.util.Scanner;

public class Juego {

    public int puntajeFinal;
    public int retorno;
    public int iniciarJuego(String usuario) {

        System.out.println("Primera Pregunta");
        int nivelUno = this.nivelUno();
        this.puntajeFinal += 100;
        retorno= this.avanzarNivel(nivelUno,usuario,this.puntajeFinal,100);
        if(retorno==0){
            return 0;
        }
        System.out.println("Segunda Pregunta");
        int nivelDos = this.nivelDos();
        retorno= this.avanzarNivel(nivelDos,usuario,this.puntajeFinal,200);
        if(retorno==0){
            return 0;
        }
        System.out.println("Tercera Pregunta");
        int nivelTres = this.nivelTres();
        retorno= this.avanzarNivel(nivelTres,usuario,this.puntajeFinal,300);
        if(retorno==0){
            return 0;
        }
        System.out.println("Cuarta Pregunta");
        int nivelCuatro = this.nivelCuatro();
        retorno= this.avanzarNivel(nivelCuatro,usuario,this.puntajeFinal,400);
        if(retorno==0){
            return 0;
        }
        System.out.println("Ultima Pregunta, Por el Premio Mayor");
        int nivelCinco = this.nivelCinco();
        retorno= this.avanzarNivel(nivelCinco,usuario,this.puntajeFinal,500);
        if(retorno==0){
            return 0;
        }

        System.out.println("----FELICIDADES GANASTE EL PREMIO MAYOR----");
        this.puntuacion(usuario, this.puntajeFinal);

        return 1;
    }

    public int nivelUno() {
        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaUno = new BancoPregunta();
        bancoPreguntaUno.setPrimerNivel();
        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaUno.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaUno.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }


    public int nivelDos() {

        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaDos = new BancoPregunta();
        bancoPreguntaDos.setSegundoNivel();

        int validadcion = -1;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaDos.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaDos.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int nivelTres() {

        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaTres = new BancoPregunta();
        bancoPreguntaTres.setTercerNivel();

        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaTres.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaTres.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int nivelCuatro() {
        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaCuatro = new BancoPregunta();
        bancoPreguntaCuatro.setCuartoNivel();
        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaCuatro.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaCuatro.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int nivelCinco() {

        Scanner usuario = new Scanner(System.in);
        BancoPregunta bancoPreguntaCinco = new BancoPregunta();
        bancoPreguntaCinco.setQuintoNivel();

        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            String resultado = bancoPreguntaCinco.evaluarRespuesta(respuesta);
            System.out.println(resultado);
            validadcion = this.validarRepuesta(resultado);
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaCinco.mostraInformacion();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int validarRepuesta(String resultado){
        if (resultado.equalsIgnoreCase("Respuesta incorrecta")) {
            return  0;
        }
        if (resultado.equalsIgnoreCase("El usuario se retira")) {
            return  2;
        }
        if (resultado.equalsIgnoreCase("Respuesta correcta")) {
            return  1;
        }
        return -1;
    }

    public int avanzarNivel(int nivel, String usuario, int puntajeFinal, int putajePregunta){
        switch (nivel){
            case 0:
                this.puntajeFinal = 0;
                this.puntuacion(usuario, this.puntajeFinal);
                return 0;
            case 2:
                this.puntuacion(usuario, this.puntajeFinal);
                return 0;
            default:
                this.puntajeFinal+=putajePregunta;
        }
        return 1;
    }

    public void puntuacion(String usuario, int puntajeFinal) {
        System.out.println(usuario + " Tu puntaje fue de: " + puntajeFinal);
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


}

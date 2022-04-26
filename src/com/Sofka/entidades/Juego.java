package com.Sofka.entidades;

import com.Sofka.domain.bancopregunta.*;
import com.Sofka.controladores.Consultas;
import com.Sofka.domain.controlnivel.ControlNivel;

import java.util.Scanner;

public class Juego {
    Consultas nueva = new Consultas();
    public int puntajeFinal;
    public int retorno;
    public ControlNivel controlNivel = new ControlNivel();

    public int iniciarJuego(String usuario) {
        this.puntajeFinal = 0;
        int nivelUno = controlNivel.nivelUno();
        retorno = this.avanzarNivel(nivelUno, usuario, this.puntajeFinal, 100);
        switch (retorno) {
            case 0:
                return 0;
        }
        int nivelDos = controlNivel.nivelDos();
        retorno = this.avanzarNivel(nivelDos, usuario, this.puntajeFinal, 200);
        switch (retorno) {
            case 0:
                return 0;
        }
        int nivelTres = controlNivel.nivelTres();
        retorno = this.avanzarNivel(nivelTres, usuario, this.puntajeFinal, 300);
        switch (retorno) {
            case 0:
                return 0;
        }
        int nivelCuatro = controlNivel.nivelCuatro();

        retorno = this.avanzarNivel(nivelCuatro, usuario, this.puntajeFinal, 400);

        switch (retorno) {
            case 0:
                return 0;
        }

        int nivelCinco = controlNivel.nivelCinco();
        retorno = this.avanzarNivel(nivelCinco, usuario, this.puntajeFinal, 500);
        switch (retorno) {
            case 0:
                return 0;
        }
        System.out.println("----FELICIDADES GANASTE EL PREMIO MAYOR----");
        this.puntuacion(usuario, this.puntajeFinal);

        return retorno;
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
        nueva.agregarJugador(usuario, puntajeFinal);
        System.out.println(usuario + " Tu puntaje fue de: " + puntajeFinal);
    }

}

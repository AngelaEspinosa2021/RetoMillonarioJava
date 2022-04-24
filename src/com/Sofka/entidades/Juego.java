package com.Sofka.entidades;

import com.Sofka.bancopregunta.BancoPregunta;

import java.util.Scanner;

public class Juego {

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
    }

}

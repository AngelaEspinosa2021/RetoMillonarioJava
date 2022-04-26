package com.Sofka.domain.controlnivel;

import com.Sofka.domain.servicionivel.*;

public class ControlNivel {
    public PrimerNivel primerNivel;
    public SegundoNivel segundoNivel;
    public TercerNivel tercerNivel;
    public CuartoNivel cuartoNivel;
    public QuintoNivel quintoNivel;

    public int nivelUno() {
        System.out.println("Primera Pregunta");
        primerNivel = new PrimerNivel();
        int nivelUno = primerNivel.nivel();
        return nivelUno;
    }

    public int nivelDos() {
        System.out.println("Segunda Pregunta");
        segundoNivel = new SegundoNivel();
        int nivelUno = segundoNivel.nivel();
        return nivelUno;
    }

    public int nivelTres() {
        System.out.println("Tercera Pregunta");
        tercerNivel = new TercerNivel();
        int nivelUno = tercerNivel.nivel();
        return nivelUno;
    }

    public int nivelCuatro() {
        System.out.println("Cuarta Pregunta");
        cuartoNivel = new CuartoNivel();
        int nivelUno = cuartoNivel.nivel();
        return nivelUno;
    }

    public int nivelCinco() {
        System.out.println("Quinta Pregunta");
        quintoNivel = new QuintoNivel();
        int nivelUno = quintoNivel.nivel();
        return nivelUno;
    }

}

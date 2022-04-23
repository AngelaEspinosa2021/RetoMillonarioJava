package com.Sofka.bancopregunta;

import java.util.Random;

public class BancoPregunta {
    protected String pregunta;
    protected String respuestaA;
    protected String respuestaB;
    protected String respuestaC;
    protected String respuestaD;
    protected String correcta;
    protected double puntaje;

    public BancoPregunta(){

    }

    public BancoPregunta(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        this.pregunta = pregunta;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
        this.respuestaD = respuestaD;
        this.correcta=correcta;
        this.puntaje = puntaje;
    }


    public int numeroAleatorio(){
        Random random = new Random();
        return  random.nextInt(5) + 1;
    }

    public void asignarPregunta(){
        int numero = numeroAleatorio();
        System.out.println(numero);
    }


    @Override
    public String toString() {
        return "BancoPregunta{" +
                "pregunta='" + pregunta + '\'' +
                ", respuestaA=" + respuestaA +
                ", respuestaB=" + respuestaB +
                ", respuestaC=" + respuestaC +
                ", respuestaD=" + respuestaD +
                ", puntaje=" + puntaje +
                '}';
    }

    public static void main(String[] args) {
        BancoPregunta bancoPregunta = new BancoPregunta();
        bancoPregunta.asignarPregunta();
    }

}

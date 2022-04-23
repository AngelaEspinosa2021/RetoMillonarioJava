package com.Sofka.bancopregunta;

import java.util.Random;
import java.util.prefs.BackingStoreException;

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


    //calcular aleatorio
    public int numeroAleatorio(){
        Random random = new Random();
        return  random.nextInt(5) + 1;
    }

    public BancoPregunta asignarPregunta(BancoPregunta preguntaUno,BancoPregunta preguntaDos,BancoPregunta preguntaTres,BancoPregunta preguntaCuatro,BancoPregunta preguntaCinco){
        BancoPregunta bancoPregunta = new BancoPregunta();
        int numero = numeroAleatorio();
        switch (numero){
            case 1:
                bancoPregunta=preguntaUno;
                break;
            case 2:
                bancoPregunta=preguntaDos;
                break;
            case 3:
                bancoPregunta=preguntaTres;
                break;
            case 4:
                bancoPregunta=preguntaCuatro;
                break;
            case 5:
                bancoPregunta=preguntaCinco;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + numero);
        }
        return bancoPregunta;

    }

    public String imprimirPregunta(BancoPregunta pregunta){
      return pregunta.toString();

    }



    @Override
    public String toString() {
        return "Juguemos por " + puntaje + " puntos" + "\n"
                + pregunta + "\n" + respuestaA + "\n" + respuestaB +
                "\n" + respuestaC + "\n" + respuestaD +
                "\nEn Cualquier momento preciona R para retirarte";
    }
}

package com.Sofka.bancopregunta;

import java.util.Random;

public class ServicioPregunta {

    //Atributos
    protected String pregunta;
    protected String respuestaA;
    protected String respuestaB;
    protected String respuestaC;
    protected String respuestaD;
    protected String correcta;
    protected double puntaje;

    //contructor vacio
    public ServicioPregunta(){

    }
//Constructor con argumentos
    public ServicioPregunta(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
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

    //Agregar pregunta
    public ServicioPregunta asignarPregunta(ServicioPregunta preguntaUno, ServicioPregunta preguntaDos, ServicioPregunta preguntaTres, ServicioPregunta preguntaCuatro, ServicioPregunta preguntaCinco){
        int numero = numeroAleatorio();
        ServicioPregunta preguntaAsignada= new ServicioPregunta();
        switch (numero){
            case 1:
                preguntaAsignada =preguntaUno;
                break;
            case 2:   preguntaAsignada =preguntaDos;
                break;
            case 3:   preguntaAsignada =preguntaTres;
                break;
            case 4:   preguntaAsignada =preguntaCuatro;
                break;
            case 5:   preguntaAsignada =preguntaCinco;
                break;
            }
        return preguntaAsignada;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void imprimirPregunta(BancoPregunta bancoPregunta){
        System.out.println(bancoPregunta.toString());

    }

    @Override
    public String toString() {
        return "Juguemos por " + puntaje + " puntos" + "\n"
                + pregunta + "\n" + respuestaA + "\n" + respuestaB +
                "\n" + respuestaC + "\n" + respuestaD +
                "\nEn Cualquier momento preciona R para retirarte";
    }
}

package com.Sofka.bancopregunta;

import java.util.Random;

public class ServicioPregunta {

    protected String pregunta;
    protected String respuestaA;
    protected String respuestaB;
    protected String respuestaC;
    protected String respuestaD;
    protected String correcta;
    protected double puntaje;

    public ServicioPregunta(){

    }

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
    public String asignarPregunta(ServicioPregunta preguntaUno, ServicioPregunta preguntaDos, ServicioPregunta preguntaTres, ServicioPregunta preguntaCuatro, ServicioPregunta preguntaCinco){
        int numero = numeroAleatorio();
        String preguntaAsignada;
        switch (numero){
            case 1:
                preguntaAsignada =preguntaUno.getCorrecta();
                System.out.println(preguntaUno.toString());
                break;
            case 2:   preguntaAsignada =preguntaDos.getCorrecta();
                System.out.println(preguntaDos.toString());
                break;
            case 3:   preguntaAsignada =preguntaTres.getCorrecta();
                System.out.println(preguntaTres.toString());
                break;
            case 4:   preguntaAsignada =preguntaCuatro.getCorrecta();
                System.out.println(preguntaCuatro.toString());
                break;
            case 5:   preguntaAsignada =preguntaCinco.getCorrecta();
                System.out.println(preguntaCinco.toString());
                break;
            default:
                return  ("Unexpected value: " + numero);
        }
        return preguntaAsignada;
    }

    public String getCorrecta() {
        return correcta;
    }

    @Override
    public String toString() {
        return "Juguemos por " + puntaje + " puntos" + "\n"
                + pregunta + "\n" + respuestaA + "\n" + respuestaB +
                "\n" + respuestaC + "\n" + respuestaD +
                "\nEn Cualquier momento preciona R para retirarte";
    }
}

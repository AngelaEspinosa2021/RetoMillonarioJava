package com.Sofka.bancopregunta;

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

}

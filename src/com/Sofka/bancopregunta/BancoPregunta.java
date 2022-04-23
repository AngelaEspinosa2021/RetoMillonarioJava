package com.Sofka.bancopregunta;

public class BancoPregunta {


    private String pregunta;
    private String respuestaA;
    private String respuestaB;
    private String respuestaC;
    private String respuestaD;
    private String correcta;
    private double puntaje;

    public BancoPregunta() {

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

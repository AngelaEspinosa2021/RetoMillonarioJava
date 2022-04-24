package com.Sofka.bancopregunta;

public class BancoPregunta {
    public PrimerNivel TercerNivel;
    public SegundoNivel segundoNivel;
    public TercerNivel tercerNivel;
    public CuartoNivel cuartoNivel;
    public QuintoNivel quintoNivel;

    public BancoPregunta(){

    }

    public void setPrimerNivel(){
        TercerNivel = new PrimerNivel();
        System.out.println(TercerNivel.preguntasNivelUno());
    }

    public void setSegundoNivel(){
        segundoNivel = new SegundoNivel();
        System.out.println(segundoNivel.preguntaNivelDos());

    }
    public void setTercerNivel(){
        tercerNivel = new TercerNivel();
        System.out.println(tercerNivel.preguntaNivelTres());

    }
    public void setCuartoNivel(){
        cuartoNivel = new CuartoNivel();
        System.out.println(cuartoNivel.preguntaNivelCuatro());

        }
    public void setQuintoNivel() {
        quintoNivel = new QuintoNivel();
        System.out.println(quintoNivel.preguntaNivelCinco());

    }

    public static void main(String[] args) {
        BancoPregunta bancoPregunta = new BancoPregunta();
        System.out.println("Pregunta uno");
        bancoPregunta.setPrimerNivel();
        System.out.println("Pregunta Dos");
        bancoPregunta.setSegundoNivel();
        System.out.println("Pregunta tres");
        bancoPregunta.setTercerNivel();
        System.out.println("Pregunta cuatro");
        bancoPregunta.setCuartoNivel();
        System.out.println("Pregunta cinco");
        bancoPregunta.setQuintoNivel();


    }


}

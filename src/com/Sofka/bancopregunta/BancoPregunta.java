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






}

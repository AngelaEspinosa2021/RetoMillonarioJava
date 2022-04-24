package com.Sofka.bancopregunta;

public class BancoPregunta {
    public PrimerNivel TercerNivel;
    public SegundoNivel segundoNivel;
    public TercerNivel tercerNivel;
    public CuartoNivel cuartoNivel;
    public QuintoNivel quintoNivel;
    public String respuestaCorrecta;

    public BancoPregunta(){

    }

    public void setPrimerNivel(){
        TercerNivel = new PrimerNivel();
       respuestaCorrecta = TercerNivel.preguntasNivelUno();
    }

    public void setSegundoNivel(){
        segundoNivel = new SegundoNivel();
        respuestaCorrecta = (segundoNivel.preguntaNivelDos());
    }
    public void setTercerNivel(){
        tercerNivel = new TercerNivel();
        respuestaCorrecta = (tercerNivel.preguntaNivelTres());
    }
    public void setCuartoNivel(){
        cuartoNivel = new CuartoNivel();
        respuestaCorrecta = (cuartoNivel.preguntaNivelCuatro());
    }
    public void setQuintoNivel() {
        quintoNivel = new QuintoNivel();
        respuestaCorrecta = (quintoNivel.preguntaNivelCinco());
    }

    public String evaluarRespuesta(String correcta, String usuario) {

        this.respuestaCorrecta = correcta;
        String opciones[] = {"A", "B", "C", "D", "R"};
        String captura = "";
        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equalsIgnoreCase(usuario)) {
                captura = usuario;
                break;
            } else {
                captura = "nula";

            }
        }

        if (correcta.equalsIgnoreCase(captura)) {
            return "respuesta correcta";
        }
        if (captura.equalsIgnoreCase("R")) {
            return "El usuario se retira";
        }
        if (captura.equalsIgnoreCase("nula")) {
            return "Selecciona una opcion corecta";
        } else {
            return "Respuesta incorrecta";
        }
    }



    public static void main(String[] args) {
        BancoPregunta bancoPregunta = new BancoPregunta();
        bancoPregunta.setPrimerNivel();
        System.out.println(bancoPregunta.evaluarRespuesta("A","B"));
        System.out.println("------------");
        bancoPregunta.setSegundoNivel();
        System.out.println(bancoPregunta.evaluarRespuesta("A","B"));
        System.out.println("------------");
        bancoPregunta.setTercerNivel();
        System.out.println(bancoPregunta.evaluarRespuesta("A","B"));
        System.out.println("------------");
        bancoPregunta.setCuartoNivel();
        System.out.println(bancoPregunta.evaluarRespuesta("A","B"));
        System.out.println("-----------");
        bancoPregunta.setQuintoNivel();
        System.out.println(bancoPregunta.evaluarRespuesta("A","B"));
        System.out.println("-----------");

    }


}

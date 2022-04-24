package com.Sofka.bancopregunta;

public class BancoPregunta {

    public PrimerNivel primerNivel;
    public SegundoNivel segundoNivel;
    public TercerNivel tercerNivel;
    public CuartoNivel cuartoNivel;
    public QuintoNivel quintoNivel;
    public String respuestaCorrecta;

    public BancoPregunta(){

    }
//Agregar preguntas al juego
    public void setPrimerNivel(){
        primerNivel = new PrimerNivel();
        respuestaCorrecta = primerNivel.preguntasNivelUno();
        System.out.println(primerNivel.toString());
    }

    public void setSegundoNivel(){
        segundoNivel = new SegundoNivel();
        respuestaCorrecta = segundoNivel.preguntaNivelDos();
    }

    public void setTercerNivel(){
        tercerNivel = new TercerNivel();
        respuestaCorrecta = tercerNivel.preguntaNivelTres();
        System.out.println(tercerNivel.toString());
    }
    public void setCuartoNivel(){
        cuartoNivel = new CuartoNivel();
        respuestaCorrecta = cuartoNivel.preguntaNivelCuatro();
    }
    public void setQuintoNivel() {
        quintoNivel = new QuintoNivel();
        respuestaCorrecta = quintoNivel.preguntaNivelCinco();
    }


    //Vereficar respuesta
    public String evaluarRespuesta(String usuario) {
        String opciones[] = {"A", "B", "C", "D", "R"};
        String captura = "";
        for (String elemento:opciones) {
            if(elemento.equalsIgnoreCase(usuario)){
                captura=usuario;
                break;
            }
                captura="N";
        }

        switch (captura.toUpperCase()){
            case "N":
                return "Ingrese una opcion validad";
            case "R":
                return "Salio del juego";
            default:
                return this.validarRespuesta(captura);
        }
    }

    public String validarRespuesta(String usuario){
        if(respuestaCorrecta.equalsIgnoreCase(usuario)){
            return "Respuesta Correcta";
        }
            return "Respuesta Incorrecta";
    }

    public static void main(String[] args) {
        BancoPregunta bancoPregunta = new BancoPregunta();
        bancoPregunta.setPrimerNivel();
    }

    }




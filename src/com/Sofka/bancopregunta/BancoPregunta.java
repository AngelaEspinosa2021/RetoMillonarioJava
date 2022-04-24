package com.Sofka.bancopregunta;

public class BancoPregunta {
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> ed396372a7b27a20cdbc9c535d062b0e9781cb42
>>>>>>> main
    public PrimerNivel TercerNivel;
    public SegundoNivel segundoNivel;
    public TercerNivel tercerNivel;
    public CuartoNivel cuartoNivel;
    public QuintoNivel quintoNivel;
    public String respuestaCorrecta;
<<<<<<< HEAD

=======
>>>>>>> ed396372a7b27a20cdbc9c535d062b0e9781cb42

    public BancoPregunta(){

    }
//Agregar preguntas al juego
    public void setPrimerNivel(){
        TercerNivel = new PrimerNivel();
        respuestaCorrecta = TercerNivel.preguntasNivelUno();
    }

    public void setSegundoNivel(){
        segundoNivel = new SegundoNivel();
        respuestaCorrecta = (segundoNivel.preguntaNivelDos());
    }
<<<<<<< HEAD

=======
>>>>>>> ed396372a7b27a20cdbc9c535d062b0e9781cb42
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

    //Vereficar respuesta
    public String evaluarRespuesta(String correcta, String usuario) {
        String opciones[] = {"A", "B", "C", "D", "R"};
        String captura = "";
        for (String elemento:opciones) {
            if(respuestaCorrecta.equalsIgnoreCase(usuario)){
                captura=usuario;
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

    }




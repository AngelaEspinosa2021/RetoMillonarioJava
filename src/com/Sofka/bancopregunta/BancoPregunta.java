package com.Sofka.bancopregunta;

public class BancoPregunta {

<<<<<<< HEAD
    public PrimerNivel TercerNivel;
    public SegundoNivel segundoNivel;
    public TercerNivel tercerNivel;
    public CuartoNivel cuartoNivel;
    public QuintoNivel quintoNivel;
    public String respuestaCorrecta;

=======
    public String correcta;
    public String informacion;
>>>>>>> 222363283428c74be7dfa1ff27e2f90c927aa826

    public BancoPregunta(){

    }
//Agregar preguntas al juego
    public void setPrimerNivel(){
       PrimerNivel primerNivel = new PrimerNivel();
       ServicioPregunta pregunta=primerNivel.preguntasNivelUno();
        System.out.println(informacion=pregunta.toString());
        correcta=pregunta.getCorrecta();
    }

    public void setSegundoNivel(){
        PrimerNivel primerNivel = new PrimerNivel();
        ServicioPregunta pregunta=primerNivel.preguntasNivelUno();
        System.out.println(informacion=pregunta.toString());
        correcta=pregunta.getCorrecta();
    }

<<<<<<< HEAD
    public void setTercerNivel(){
        tercerNivel = new TercerNivel();
        respuestaCorrecta = (tercerNivel.preguntaNivelTres());
    }
=======

       public void setTercerNivel(){
           PrimerNivel primerNivel = new PrimerNivel();
           ServicioPregunta pregunta=primerNivel.preguntasNivelUno();
           System.out.println(informacion=pregunta.toString());
           correcta=pregunta.getCorrecta();
       }
>>>>>>> 222363283428c74be7dfa1ff27e2f90c927aa826
    public void setCuartoNivel(){
        PrimerNivel primerNivel = new PrimerNivel();
        ServicioPregunta pregunta=primerNivel.preguntasNivelUno();
        System.out.println(informacion=pregunta.toString());
        correcta=pregunta.getCorrecta();

    }
    public void setQuintoNivel() {
        PrimerNivel primerNivel = new PrimerNivel();
        ServicioPregunta pregunta=primerNivel.preguntasNivelUno();
        System.out.println(informacion=pregunta.toString());
        correcta=pregunta.getCorrecta();

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

    public void mostraInformacion(){
        System.out.println(this.informacion);
    }

    public String validarRespuesta(String usuario){
        if(this.correcta.equalsIgnoreCase(usuario)){
            return "Respuesta Correcta";
        }
            return "Respuesta Incorrecta";
    }

    public static void main(String[] args) {
        BancoPregunta bancoPregunta = new BancoPregunta();
        bancoPregunta.setPrimerNivel();
        System.out.println(bancoPregunta.evaluarRespuesta("B"));
        bancoPregunta.mostraInformacion();
    }

 }




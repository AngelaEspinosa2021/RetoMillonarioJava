package com.Sofka.bancopregunta;

import static java.lang.System.exit;

public class BancoPregunta {

    public String correcta;
    public String informacion;

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
        SegundoNivel segundoNivel = new SegundoNivel();
        ServicioPregunta pregunta=segundoNivel.preguntaNivelDos();
        System.out.println(informacion=pregunta.toString());
        correcta=pregunta.getCorrecta();
    }

       public void setTercerNivel(){
           TercerNivel tercerNivel = new TercerNivel();
           ServicioPregunta pregunta=tercerNivel.preguntaNivelTres();
           System.out.println(informacion=pregunta.toString());
           correcta=pregunta.getCorrecta();
       }
    public void setCuartoNivel(){
        CuartoNivel cuartoNivel = new CuartoNivel();
        ServicioPregunta pregunta= cuartoNivel.preguntaNivelCuatro();
        System.out.println(informacion=pregunta.toString());
        correcta=pregunta.getCorrecta();

    }
    public void setQuintoNivel() {
        QuintoNivel quintoNivel = new QuintoNivel();
        ServicioPregunta pregunta=quintoNivel.preguntaNivelCinco();
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
                System.out.println("Ingrese una opción valida");
                break;
            case "R":
                System.out.println("Salio del juego");
                break;
            default:
                return this.validarRespuesta(captura);
        }
        return "FIN.";
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

 }




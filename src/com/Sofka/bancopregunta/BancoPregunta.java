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
        PrimerNivel primerNivel = new PrimerNivel();
        ServicioPregunta pregunta=primerNivel.preguntasNivelUno();
        System.out.println(informacion=pregunta.toString());
        correcta=pregunta.getCorrecta();
    }

       public void setTercerNivel(){
           PrimerNivel primerNivel = new PrimerNivel();
           ServicioPregunta pregunta=primerNivel.preguntasNivelUno();
           System.out.println(informacion=pregunta.toString());
           correcta=pregunta.getCorrecta();
       }
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




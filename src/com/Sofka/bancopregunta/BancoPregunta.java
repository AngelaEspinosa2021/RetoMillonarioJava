package com.Sofka.bancopregunta;

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




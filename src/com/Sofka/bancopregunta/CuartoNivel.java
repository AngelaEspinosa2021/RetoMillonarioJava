package com.Sofka.bancopregunta;

public class CuartoNivel extends BancoPregunta {
    //Constructor vacio
    public CuartoNivel() {

    }

    //contructor con super del padre
    public CuartoNivel(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        super(pregunta, respuestaA, respuestaB, respuestaC, respuestaD, correcta, puntaje);
    }

    //Agregando preguntas al primer nivel


    public String preguntaNivelDos() {

        BancoPregunta primeraPregunta = new CuartoNivel("¿En que año gano Roger Federer su primer Grand Slam?",
                "A. 2000", "B. 2005", "C. 2003", "D. 2004",
                "C", 250);

        BancoPregunta segundaPregunta = new CuartoNivel("¿Cómo comenzó la Primera Guerra Mundial?",
                "A. Con el intento de asesinato del príncipe belga Leopold",
                "B. Con el asesinato del archiduque Francisco Fernando",
                "C. Con la batalla de Gallipoli",
                "D. Con la caida del imperio Otomano", "B", 250);

        BancoPregunta terceraPregunta = new CuartoNivel("¿Como se llama el actor que interpreta a Severus Snape en Harry Potter?",
                "A. Alan Rickman", "B. Gary Oldman", "C. Jason Isaacs",
                "D. Richard Harris", "A", 250);

        BancoPregunta cuartaPregunta = new CuartoNivel("¿Cuantos cromosomas tiene el ser humano?", "A.  45",
                "47", "C. 46", "D. 35", "A", 250);

        BancoPregunta quintaPregunta = new CuartoNivel("¿En que continente esta ubicado Surinam?", "A. Asia",
                "B. America del sur", "C. Europa", "D. Africa", "B", 250);

        BancoPregunta pregunta=this.asignarPregunta(primeraPregunta,segundaPregunta,terceraPregunta,cuartaPregunta,quintaPregunta);
        return this.imprimirPregunta(pregunta);
    }
}

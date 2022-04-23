package com.Sofka.bancopregunta;

public class TercerNivel extends BancoPregunta {

    //Constructor vacio
    public TercerNivel() {

    }

    //contructor con super del padre
    public TercerNivel(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        super(pregunta, respuestaA, respuestaB, respuestaC, respuestaD, correcta, puntaje);
    }

    //Agregando preguntas al primer tercer nivel


    public String preguntaNivelDos() {

        BancoPregunta primeraPregunta = new TercerNivel("¿En que año se jugo el primer Mundial de Futbol?", "A. 1935",
                "B. 1930", "C. 1829", "D. 1945", "B", 200);

        BancoPregunta segundoPregunta = new TercerNivel("¿Qué inició la Segunda Guerra Mundial?",
                "A. La invacion de Alemania a Polonia",
                "B. La invacion de Alemania a Austria", "C. La invacion de Alemania a Fancia",
                "D. El bombardeo de Japon a Pearl Harbor", "A", 200);

        BancoPregunta tercerPreguta = new TercerNivel("¿En que pelicula, Harry Potter libera a un elfo domestico?",
                "A. Harry Potter y el Misterio del Principe", "B. Harry Potter y la Camara de los secretos",
                "C. Harry Potter y el Prisionero de Azkaban", "D. Harry Potter y la Piedra Filosofal",
                "B", 200);

        BancoPregunta cuartaPregunta = new TercerNivel("¿Cual es el hueso mas grande del cuerpo humano?", "A. Femur",
                "B. Perone", "C. Esternocleidomastoideo", "D. Torax", "A", 150);

        BancoPregunta quintaPregunta = new TercerNivel("¿Cual es el rio mas largo del mundo?", "A. Rio Nilo",
                "B. Rio Amazonas", "C. Rio Danubio", "D. Rio Ganges", "B", 150);

        return "";
    }

}

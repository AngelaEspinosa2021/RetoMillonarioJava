package com.Sofka.domain.bancopregunta;

public class TercerNivel extends ServicioPregunta {

    //Constructor vacio
    public TercerNivel() {

    }

    //contructor con super del padre
    public TercerNivel(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        super(pregunta, respuestaA, respuestaB, respuestaC, respuestaD, correcta, puntaje);
    }

    //Agregando preguntas al primer tercer nivel


    public ServicioPregunta preguntaNivelTres() {

        ServicioPregunta primeraPregunta = new TercerNivel("¿En que año se jugo el primer Mundial de Futbol?", "A. 1935",
                "B. 1930", "C. 1829", "D. 1945", "B", 200);

        ServicioPregunta segundaPregunta = new TercerNivel("¿Qué inició la Segunda Guerra Mundial?",
                "A. La invasion de Alemania a Polonia",
                "B. La invasion de Alemania a Austria", "C. La invacion de Alemania a Fancia",
                "D. El bombardeo de Japon a Pearl Harbor", "A", 200);

        ServicioPregunta terceraPregunta = new TercerNivel("¿En que pelicula, Harry Potter libera a un elfo domestico?",
                "A. Harry Potter y el Misterio del Principe", "B. Harry Potter y la Camara de los secretos",
                "C. Harry Potter y el Prisionero de Azkaban", "D. Harry Potter y la Piedra Filosofal",
                "B", 200);

        ServicioPregunta cuartaPregunta = new TercerNivel("¿Que es un viviparo?", "A. Alguien que es mas vivo que los demas",
                "B. Un animal que nace del utero de su madre", "C. Un animal que nace vivo",
                "D. Un animal que nace y se muere", "B", 200);

        ServicioPregunta quintaPregunta = new TercerNivel("¿Cuál es el país más grande del mundo?", "A. China",
                "B. Estados Unidos", "C. Rusia", "D. Canada", "C", 200);


        ServicioPregunta pregunta=this.asignarPregunta(primeraPregunta,segundaPregunta,terceraPregunta,cuartaPregunta,quintaPregunta);
        return (pregunta);

    }

}

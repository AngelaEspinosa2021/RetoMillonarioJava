package com.Sofka.domain.bancopregunta;

public class QuintoNivel extends ServicioPregunta {
    //Constructor vacio
    public QuintoNivel() {

    }

    //contructor con super del padre
    public QuintoNivel(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        super(pregunta, respuestaA, respuestaB, respuestaC, respuestaD, correcta, puntaje);
    }

    //Agregando preguntas al primer nivel


    public ServicioPregunta preguntaNivelCinco() {

        ServicioPregunta primeraPregunta = new QuintoNivel("¿Cuándo se realizaron los primeros Juegos Olímpicos?",
                "A. 1850", "B. 1896", "C. 1829",
                "D. 1930", "B", 300);

        ServicioPregunta segundaPregunta = new QuintoNivel("¿En qué año cayo el Imperio Romano de Occidente?",
                "A. 572", "B. 476", "C. 387",
                "D. 457", "B", 300);

        ServicioPregunta terceraPregunta = new QuintoNivel("¿Quien hizo la voz de Mufasa en el rey leon?",
                "A. James Earl Jones", "B. Jorge Gonzalez",
                "C. Eduardo Perez", "D. David Fernandez", "A", 300);

        ServicioPregunta cuartaPregunta = new QuintoNivel("¿En quimica que es la fusion?",
                "A. Una sustancia pasa de liquido a gaseoso",
                "B. Una sustancia pasa de liquido a solido",
                "C. Una sustancia pasa de solido a liquido",
                "D. Una sustancia pasa de solido a gaseoso", "C", 300);

        ServicioPregunta quintaPregunta = new QuintoNivel("¿Cuál es la única ciudad que está en dos continentes distintos?",
                "A. Moscu", "B. Estambul", "C. Novosibirsk",
                "D. Perm", "B", 300);

        ServicioPregunta pregunta=this.asignarPregunta(primeraPregunta,segundaPregunta,terceraPregunta,cuartaPregunta,quintaPregunta);
        return (pregunta);

    }
}

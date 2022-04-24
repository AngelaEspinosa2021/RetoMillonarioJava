package com.Sofka.bancopregunta;

public class SegundoNivel extends ServicioPregunta {

    //Constructor vacio
    public SegundoNivel() {

    }

    //contructor con super del padre
    public SegundoNivel(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        super(pregunta, respuestaA, respuestaB, respuestaC, respuestaD, correcta, puntaje);
    }

    //Agregando preguntas al primer nivel


    public ServicioPregunta preguntaNivelDos() {

        ServicioPregunta primeraPregunta = new SegundoNivel("¿A que jugador de futbol le dicen el VICHO?", "A. Lionel Messi",
                "B. Rhonaldinho", "C. Cristiano Ronaldo", "D. Kylian Mbappe", "C", 150);

        ServicioPregunta segundaPregunta = new SegundoNivel("¿Que famoso filosofo, fue maestro de Alejandro Magno?", "A. Socrates",
                "B. Platon", "C. Aristoteles", "D. Descartes", "C", 150);

        ServicioPregunta terceraPregunta = new SegundoNivel("¿Cual es el nombre del villano principal del señor de los anillos?", "A. Gandalf",
                "B. Saruman", "C. Frodo", "D. Sauron", "D", 150);

        ServicioPregunta cuartaPregunta = new SegundoNivel("¿Cual es el hueso mas grande del cuerpo humano?", "A. Femur",
                "B. Perone", "C. Esternocleidomastoideo", "D. Torax", "A", 150);

        ServicioPregunta quintaPregunta = new SegundoNivel("¿Cual es el rio mas largo del mundo?", "A. Rio Nilo",
                "B. Rio Amazonas", "C. Rio Danubio", "D. Rio Ganges", "B", 150);

        ServicioPregunta pregunta=this.asignarPregunta(primeraPregunta,segundaPregunta,terceraPregunta,cuartaPregunta,quintaPregunta);
        return (pregunta);


    }
}

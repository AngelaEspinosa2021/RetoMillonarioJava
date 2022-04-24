package com.Sofka.bancopregunta;

public class SegundoNivel extends BancoPregunta{

    //Constructor vacio
    public SegundoNivel() {

    }

    //contructor con super del padre
    public SegundoNivel(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        super(pregunta, respuestaA, respuestaB, respuestaC, respuestaD, correcta, puntaje);
    }

    //Agregando preguntas al primer nivel


    public String preguntaNivelDos() {

        BancoPregunta primeraPregunta = new SegundoNivel("¿A que jugador de futbol le dicen el VICHO?", "A. Lionel Messi",
                "B. Rhonaldinho", "C. Cristiano Ronaldo", "D. Kylian Mbappe", "C", 150);

        BancoPregunta segundaPregunta = new SegundoNivel("¿Que famoso filosofo, fue maestro de Alejandro Magno?", "A. Socrates",
                "B. Platon", "C. Aristoteles", "D. Descartes", "C", 150);

        BancoPregunta terceraPregunta = new SegundoNivel("¿Cual es el nombre del villano principal del señor de los anillos?", "A. Gandalf",
                "B. Saruman", "C. Frodo", "D. Sauron", "D", 150);

        BancoPregunta cuartaPregunta = new SegundoNivel("¿Cual es el hueso mas grande del cuerpo humano?", "A. Femur",
                "B. Perone", "C. Esternocleidomastoideo", "D. Torax", "A", 150);

        BancoPregunta quintaPregunta = new SegundoNivel("¿Cual es el rio mas largo del mundo?", "A. Rio Nilo",
                "B. Rio Amazonas", "C. Rio Danubio", "D. Rio Ganges", "B", 150);

        String pregunta=this.asignarPregunta(primeraPregunta,segundaPregunta,terceraPregunta,cuartaPregunta,quintaPregunta);
        return (pregunta.toString());

    }
}

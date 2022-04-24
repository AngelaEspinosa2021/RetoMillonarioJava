package com.Sofka.bancopregunta;

public class PrimerNivel extends BancoPregunta {

    //Constructor vacio
    public PrimerNivel() {

    }

    //contructor con super del padre
    public PrimerNivel(String pregunta, String respuestaA, String respuestaB, String respuestaC, String respuestaD, String correcta, double puntaje) {
        super(pregunta, respuestaA, respuestaB, respuestaC, respuestaD, correcta, puntaje);
    }

    //Agregando preguntas al primer nivel
    public String preguntasNivelUno() {

        BancoPregunta primeraPregunta = new PrimerNivel("Que equipo ha ganado mas copas del mundo", "A. Colombia",
                "B. Argentina", "C. Peru", "D. Brasil", "D", 100);

        BancoPregunta segundaPregunta = new PrimerNivel("Cuantos enanos encontro Blanca Nieves en el bosque", "A. 5",
                "B. 7", "C. 9", "D. 101", "B", 100);

        BancoPregunta terceraPregunta = new PrimerNivel("La composicion quimica del agua es:", "A. HO2",
                "B. 2H2O", "C. 2HO", "D. H2O", "D", 100);

        BancoPregunta cuartaPregunta = new PrimerNivel("El autor de cien anos de soledad es:", "A. Gabriel Garcia Marquez",
                "B. J.K. Rowling", "C. J.R.R. Tolkien", "D. David Sanchez Juliao", "A", 100);

        BancoPregunta quintaPregunta = new PrimerNivel("Nombre del libertador de Colombia", "A. Cristobal Colon",
                "B. Napoleon Bonaparte", "C. Simon Bolivar", "D. Diomedez Diaz", "C", 100);

        String pregunta=this.asignarPregunta(primeraPregunta,segundaPregunta,terceraPregunta,cuartaPregunta,quintaPregunta);
        return (pregunta);


    }

    /*public void imprimirPregunta() {
        System.out.println(this.informacion);
    }*/

    public static void main(String[] args) {
        PrimerNivel primerNivel = new PrimerNivel();
        System.out.println(primerNivel.preguntasNivelUno());
    }

}


package com.Sofka.controladores;

import javax.swing.*;
import java.sql.*;

public class Consultas {
        dbController conn = new dbController();
        Connection conex = conn.conectar();

        public void consultarJugadores(){
            try{
                String sql = "SELECT rowid, * FROM jugadores";
                Statement nueva = conex.createStatement();

                ResultSet result = nueva.executeQuery(sql);;
                while(result.next()){
                    Integer id = result.getInt("rowid");
                    String name = result.getString("nombre");
                    String score = result.getString("puntaje");
                    System.out.println("id: "+id+ " nombre: "+name+" Puntaje: "+score);
                }
            }catch (Exception e){
                System.out.println("Error al consultar en la base de datos");
                e.printStackTrace();
            }
        }

        public void agregarJugador(String jugador, int puntaje){
            try{
                String ps = "INSERT INTO jugadores VALUES(?, ?)";
                PreparedStatement nueva = conex.prepareStatement(ps);
                nueva.setString(1, jugador);
                nueva.setInt(2, puntaje);
                nueva.executeUpdate();

            }catch (Exception e){
                System.out.println("Error al consultar en la base de datos");
                e.printStackTrace();
            }
        }

    public void eliminarJugadores(){
        try{
            String sql = "DELETE FROM jugadores";
            PreparedStatement nueva = conex.prepareStatement(sql);
            nueva.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registros Eliminados");
        }catch (Exception e){
            System.out.println("Error al consultar en la base de datos");
            e.printStackTrace();
        }
    }
}


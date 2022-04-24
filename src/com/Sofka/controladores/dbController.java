package com.Sofka.controladores;

import javax.swing.*;
import java.sql.*;
import java.sql.PreparedStatement;

public class dbController {

    Connection conexion;

    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:src/com/Sofka/database/millonario.db");
            if (conexion != null) {
                JOptionPane.showInternalMessageDialog(null, "Conectado a la base de datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString() + "No se pudo conectar a la base de datos");
        }
        return conexion;
    }
}


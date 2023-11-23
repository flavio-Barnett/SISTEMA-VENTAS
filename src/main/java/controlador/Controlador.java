/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Interfaces.Login;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.Empleado;
import modelo.ModeloConexion;
import modelo.OperacionesBDModelo;

/**
 *
 * @author flavi
 */
public class Controlador {

    private static ModeloConexion modeloConexion;
    private static OperacionesBDModelo operacionesBDModelo;

    public Controlador(ModeloConexion modeloConexion) {
        Controlador.modeloConexion = modeloConexion;
        Controlador.operacionesBDModelo = new OperacionesBDModelo(modeloConexion.getConexion());

    }

    public  void iniciar() {
        modeloConexion.establecerConexion();

        SwingUtilities.invokeLater(() -> {
            Login login = new Login(new Controlador(modeloConexion));
            login.setVisible(true);
        });
    }

    public static void iniciarSesion(String usuario, String contrasena) {
        try {
            if (operacionesBDModelo.validarEmpleado(usuario, contrasena)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
    }

    public static void Registrar(Empleado empleado) {

        if (operacionesBDModelo.insertarEmpleado(empleado)) {
            JOptionPane.showMessageDialog(null, "Usuario Exitosamente Creado");

        } else {
          JOptionPane.showMessageDialog(null, "No se pudo crear el usuario");

        }

    }

}

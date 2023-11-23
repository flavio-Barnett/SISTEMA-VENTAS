/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author flavi
 */
public class OperacionesBDModelo {
    
     private final Connection conexion;

    public OperacionesBDModelo(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean validarEmpleado(String usuario, String contraseña) throws SQLException {
        String consulta = "SELECT * FROM empleado WHERE correo = ? AND contrasena = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario);
            statement.setString(2, contraseña);

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); // Devuelve true si hay al menos una fila (usuario y contraseña válidos)
        }
    }
    
    public boolean insertarEmpleado(Empleado empleado){
             try {
            // SQL para la inserción de datos
            String sql = "INSERT INTO empleado (genero,nombre,apellido,tipo_documento,numero_documento,correo,contrasena,cargo,n_celular) VALUES (?,?,?,?,?,?,?,?,?)";

            // Crear la declaración preparada con parámetros
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);

            // Establecer los valores de los parámetros
            preparedStatement.setString(1,empleado.getGender() );
            preparedStatement.setString(2, empleado.getFirstName());
            preparedStatement.setString(3, empleado.getLastname());
            preparedStatement.setString(4, empleado.getDocumentType());
            preparedStatement.setString(5, empleado.getDocumentNumber());
            preparedStatement.setString(6, empleado.getEmail());
            preparedStatement.setString(7, empleado.getPassword());
            preparedStatement.setString(8, empleado.getWorkStation());
            preparedStatement.setString(9, empleado.getCellphoneNumber());
            


            // Ejecutar la inserción
            int filasAfectadas = preparedStatement.executeUpdate();

            // Cerrar la declaración preparada
            preparedStatement.close();

            // Verificar si se insertaron filas correctamente
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    
    }
    
   
    
}

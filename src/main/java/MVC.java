
import controlador.Controlador;
import modelo.ModeloConexion;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flavi
 */
public class MVC {
    
    public static void main(String[] args) {
     
       ModeloConexion conexion = new    ModeloConexion();

        // Crear una instancia de ControladorLogin, pasando el modeloConexion si es necesario
        Controlador controlador = new Controlador(conexion);

        // Iniciar el controlador
        controlador.iniciar();

        // Configurar un hook de apagado para cerrar la conexión al finalizar el programa
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Llamar al método cerrarConexion de la instancia de modeloConexion
            conexion.cerrarConexion();
        }));
    }
    
}

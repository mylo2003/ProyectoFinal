package proyectofinal;

import java.util.Locale;

public class ProyectoFinal {
    
    // Agrega una variable para almacenar el lenguaje seleccionado como objeto Locale
    private static Locale lenguajeSeleccionado = new Locale("en", "US"); // Puedes establecer un valor predeterminado

    
    public static void main(String[] args) {
        PantallaInicio inicio = new PantallaInicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    } 
    
    // Agrega un método para obtener el lenguaje seleccionado como objeto Locale
    public static Locale getLenguajeSeleccionado() {
        return lenguajeSeleccionado;
    }

    // Agrega un método para establecer el lenguaje seleccionado como objeto Locale
    public static void setLenguajeSeleccionado(Locale locale) {
        lenguajeSeleccionado = locale;
    }
}
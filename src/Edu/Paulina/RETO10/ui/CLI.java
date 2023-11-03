package edu.Paulina.RETO10.ui;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
public class CLI {
    private static ResourceBundle bundle;

    public static void main(String[] args) {
        cargarIdioma("es");  // Cambiar a "en" para inglés
        mostrarMenu();
    }

    private static void cargarIdioma(String language) {
        Locale locale = new Locale(language);
        bundle = ResourceBundle.getBundle("menu", locale);
    }

    private static void mostrarMenu() {
        System.out.println(bundle.getString("welcome_message"));
        System.out.println("1. " + bundle.getString("tu opcion es"));
        System.out.println("2. " + bundle.getString("tu otra opcion es"));
        System.out.println("0. " + bundle.getString("exit"));
    }

}

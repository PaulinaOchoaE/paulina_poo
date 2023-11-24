package edu.Paulina.RETO9.Ayudante.Pelota.process.ui.process;

public class Pelota {
    private String tipo;
    private String color;
    private double tamano;

    public Pelota(int tipo, int color, double tamano) {
        // Convertir opciones a valores específicos
        switch (tipo) {
            case 1:
                this.tipo = "Fútbol";
                break;
            case 2:
                this.tipo = "Baloncesto";
                break;
            case 3:
                this.tipo = "Tenis";
                break;
            default:
                this.tipo = "Desconocido";
                break;
        }

        switch (color) {
            case 1:
                this.color = "Rojo";
                break;
            case 2:
                this.color = "Azul";
                break;
            case 3:
                this.color = "Verde";
                break;
            default:
                this.color = "Desconocido";
                break;
        }

        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", tamano=" + tamano +
                '}';
    }
}

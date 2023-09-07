package Edu.Paulina.reto2.pau.boletos.process;

public class boletos {

    public void venderBoleto(String tipoBoleto) {
        double precio;

        switch (tipoBoleto) {
            case "Adulto":
                precio = 100;
                break;
            case "Niño":
                precio = 70;
                break;
            case "Adulto Mayor con INAPAM":
                precio = 50;
                break;
            case "Adulto Mayor sin credencial":
                precio = 70;
                break;
            default:
                precio = 0.00;
                break;
        }

        if (precio > 0) {
            System.out.println("El precio del boleto de " + tipoBoleto + " es: $" + precio);
        }

        else {
            System.out.println("Tipo de boleto no válido.");
        }
    }
}

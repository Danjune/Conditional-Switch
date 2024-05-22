import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random random = new Random();
        //Switch Normal
        int dia = 5;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "No existe ese dia";
        };

        System.out.println("El dia es: " + nombreDia);

    }
}
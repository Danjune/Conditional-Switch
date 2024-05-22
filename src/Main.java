import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        //Switch Enhanced
        int dia = random.nextInt(10);
        String numberDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "No existe ese dia";
        };
        System.out.println("Día: " + dia);
        System.out.println("El dia es: " + numberDia);

    }
}
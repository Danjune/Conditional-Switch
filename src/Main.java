import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random random = new Random();

        int dia = 5;
        String nombreDia = null;

        switch (dia){
            case 1:
                nombreDia = "Lunes";
            break;

            case 2:
                nombreDia = "Martes";
            break;

            case 3:
                nombreDia = "Miercoles";
            break;

            case 4:
                nombreDia = "Jueves";
            break;

            case 5:
                nombreDia = "Viernes";
            break;

            case 6:
                nombreDia = "Sabado";
            break;

            case 7:
                nombreDia = "Domingo";
            break;

            default:
                nombreDia = "No existe ese dia";
            break;
        }
        System.out.println("El dia es: " + nombreDia);

    }
}
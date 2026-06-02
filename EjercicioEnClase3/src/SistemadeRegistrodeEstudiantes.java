
import java.util.Scanner;

class Estudiante {
    String Nombre;
    int Edad;
    double Indice;

    Estudiante(String N, int E, Double IN) {
        Nombre = N;
        Edad = E;
        Indice = IN;
    }

    void RegistrarEstudiante() throws Exception {

        Scanner Escaneo = new Scanner(System.in);
        try {

            System.out.println("Ingrese  el nombre del estudiante");
            Nombre = Escaneo.nextLine();
            if (Nombre == null) {

                throw new Exception("Error: El nombre no puede estar vacío.");
            }
            System.out.println("Ingrese la edad:");
            Edad = Escaneo.nextInt();
            Escaneo.nextLine();
            if (Edad < 18) {

                throw new Exception("Error: La edad debe ser mayor o igual a 18 años");
            }
            System.out.println("Ingrese el indice Academico");
            Indice = Escaneo.nextDouble();
            if (Indice > 4.0) {

                throw new Exception("Error: El índice debe estar entre 0 y 4.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado");

        }

    }
}

public class SistemadeRegistrodeEstudiantes {

    public static void main(String[] args) {
        Estudiante P = new Estudiante("", 0, 0.0);
        try {
            P.RegistrarEstudiante();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

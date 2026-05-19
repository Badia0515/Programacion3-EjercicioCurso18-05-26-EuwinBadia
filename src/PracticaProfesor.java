
import java.util.Scanner;

import java.util.ArrayList;

class Paciente {

    Scanner Escaneo = new Scanner(System.in);

    String Nombre;
    String Apellido;
    int Edad;
    double Peso;
    String Sangre;
    double Altura;

    Paciente(String N, String A, int E, double P, String S, double Al) {

        Nombre = N;
        Apellido = A;
        Edad = E;
        Peso = P;
        Sangre = S;
        Altura = Al;
    }

    void RegistrarPaciente() {

        System.out.println("\nIngrese los datos del paciente");

        System.out.print("Nombre: ");
        Nombre = Escaneo.nextLine();

        System.out.print("Apellido: ");
        Apellido = Escaneo.nextLine();

        System.out.print("Edad: ");
        Edad = Escaneo.nextInt();

        System.out.print("Peso: ");
        Peso = Escaneo.nextDouble();

        Escaneo.nextLine();

        System.out.print("Tipo de Sangre: ");
        Sangre = Escaneo.nextLine();

        System.out.print("Altura: ");
        Altura = Escaneo.nextDouble();

        Escaneo.nextLine();

        System.out.println("Paciente registrado correctamente.");
    }

    void MostrarPaciente() {

        System.out.println("\n----- DATOS DEL PACIENTE -----");

        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
        System.out.println("Peso: " + Peso);
        System.out.println("Tipo de Sangre: " + Sangre);
        System.out.println("Altura: " + Altura);
    }

    void CalcularIMC() {

        double IMC = Peso / (Altura * Altura);

        System.out.println("\nIMC: " + IMC);

        if (IMC < 18.5) {

            System.out.println("Tiene peso bajo");

        } else if (IMC < 24.9) {

            System.out.println("Tiene peso normal");

        } else {

            System.out.println("Tiene sobrepeso");
        }
    }

}

public class PracticaProfesor {

    static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {

        Scanner Escaneo = new Scanner(System.in);

        int Opcion;

        do {

            System.out.println("\n------- MENU -------");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Mostrar Pacientes");
            System.out.println("3. Calcular IMC y Saber sobrePeso");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opcion: ");
            Opcion = Escaneo.nextInt();

            switch (Opcion) {

                case 1:

                    Paciente P1 = new Paciente("", "", 0, 0, "", 0);

                    P1.RegistrarPaciente();

                    pacientes.add(P1);

                    break;

                case 2:

                    for (Paciente p : pacientes) {

                        p.MostrarPaciente();
                    }

                    break;

                case 3:

                    for (Paciente p : pacientes) {

                        p.CalcularIMC();
                    }

                    break;

                case 4:

                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (Opcion != 4);

        Escaneo.close();
    }
}
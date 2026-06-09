import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Estudiante {

    String Nombre;
    int Edad;
    String Carrera;

    ArrayList<Estudiante> G = new ArrayList<>();

    Estudiante(String N, int E, String C) {
        Nombre = N;
        Edad = E;
        Carrera = C;
    }

    void GuardarEstudiante() {

        try {

            FileWriter Archivo = new FileWriter("estudiante.txt", true);
            BufferedWriter Buff = new BufferedWriter(Archivo);

            Scanner Escaneo = new Scanner(System.in);
            System.out.println("Ingrese Nombre");
            Nombre = Escaneo.nextLine();
            System.out.println("Ingrese la edad");
            Edad = Escaneo.nextInt();
            System.out.println("INgrese la Carrera");
            Escaneo.nextLine();
            Carrera = Escaneo.nextLine();
            
            Buff.write("\n"+ Nombre +"\n"+ Edad + "\n"+Carrera);
            Buff.close();
            Archivo.close();

        } catch (Exception e) {

        }

    }

    void MostrarEstudiante() {

        try {
            FileReader Leer = new FileReader("estudiante.txt");
            BufferedReader BUffLeer = new BufferedReader(Leer);
            String Linea;

            while ((Linea = BUffLeer.readLine()) != null) {
                System.out.println(Linea);
            }
        } catch (Exception e) {

        }

    }

}

class RegitroEstudiante {

    public static void main(String[] args) {
        Scanner Escaneo = new Scanner(System.in);
        int Opcion;
        System.out.println("1 - Agregar Estudiante");
        System.out.println("2 - Mostrar Estudiante");
        System.out.println("3 - Salir");
        Estudiante Es = new Estudiante("", 0, "");

        do {
            Opcion = Escaneo.nextInt();
            switch (Opcion) {
                case 1:
                    Es.GuardarEstudiante();
                    break;
                case 2:
                    Es.MostrarEstudiante();
                default:
                    break;
            }
        } while (Opcion != 3);

    }

}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("--------------Menu---------------");
        System.out.println("Hola, quien desea ingresar?:");
        System.out.println("Si eres estudiante agrega 1, si eres profesor agrega 2");
        int opcion = sc.nextInt();
        sc.nextLine();

        //Profesor
        if (opcion == 2) {
            System.out.println("Ingresa la informacion del profesor: ");
            String nombreProfesor = sc.nextLine();
            int edadProfesor = sc.nextInt();
             sc.nextLine();
            String documentoProfesor = sc.nextLine();
            String areaProfesor = sc.nextLine();
            int horasProfesor = sc.nextInt();
            int salarioTotal = (horasProfesor * 8333) + 1750905;
            Persona profesor = new Profesor(nombreProfesor,edadProfesor, documentoProfesor, areaProfesor, 1750905, salarioTotal);
            profesor.mostrarInfo();
        }
        //Estudiante
        if (opcion == 1 ){
            System.out.println("Ingresa la informacion del estudiante: ");
            String nombreEstudiante = sc.nextLine();
            int edadEstudiante = sc.nextInt();
            sc.nextLine();
            String documentoEstudiante = sc.nextLine();
            String programaEstudiante = sc.nextLine();
            double promedioEstudiante = sc.nextDouble();
            sc.nextLine();
            Persona estudiante = new Estudiante(nombreEstudiante, edadEstudiante, documentoEstudiante, programaEstudiante, promedioEstudiante);
            estudiante.mostrarInfo();
        }
    }
}


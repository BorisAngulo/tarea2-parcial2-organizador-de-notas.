import java.util.Scanner;

public class Notas{
    private int[] notas;
    public Notas(int n){
        notas = new int[n];
        System.out.println ("limite de estudiantes: " + notas.length);
    }
    
    public void aniadirNotas(){
        System.out.println(" las notas a ingresar son \n menores o iguales a 100 y mayores o iguales a 0 \n si no sigue estas instrucciones el programa \n no se hace responsable de errores en las notas gracias :) ");
        int notaDeEstudiante;
        int promedioTodos = 0,sumaNotas = 0,sumaAprobados = 0;
        int promedioAprobados;
        int numeroAprobados = 0;
        int numeroReprobados = 0;
        int notaMasAlta = 0;
        int contador = 0, contador1 = 0;
        int ej;
        Scanner entrada = new Scanner(System.in);
        for(int i = 0 ; i < notas.length; i++){ 
            System.out.println("INGRESE NOTA DE ESTUDIANTE " + (i + 1) + ":");
            notaDeEstudiante = entrada.nextInt();
            notas[i] = notaDeEstudiante;
            
        }
        for(int i = 0; i < notas.length; i++){
            sumaNotas += notas[i];
            contador++;
        }
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > 50){
                numeroAprobados++;
            }else{
                numeroReprobados++;
            }
        }
        
        for(int i = 0; i <= numeroAprobados; i++){
            if(notas[i] > 50){
            sumaAprobados += notas[i];
            ej = sumaAprobados;
            contador1++;
        }else{
            sumaAprobados = sumaAprobados *  1;
        }
        }
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > notaMasAlta){
                notaMasAlta = notas[i];
            }
        }
        
        promedioTodos = sumaNotas / contador;
        promedioAprobados = sumaAprobados / contador1;
        System.out.println("El promedio de todos los estudiantes es: " + promedioTodos);
        System.out.println("El promedio de todos los estudiantes aprobados es: " + promedioAprobados);
        System.out.println("La cantidad de aprobados es: " + numeroAprobados);
        System.out.println("La cantidad de reprobados es: " + numeroReprobados);
        System.out.println("La nota mas alta es: " + notaMasAlta);
    }
}


import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);
    public static Basicas op = new Basicas();

    public static void main(String[] args){

        int Opcion;

        do{
        System.out.println("1. Sumar: ");
        System.out.println("2. Factorial: ");
        System.out.println("3. Números Primos: ");
        System.out.println("4. Sumas De Matrices: ");
        System.out.println("5. Buscar Número: ");
        System.out.println("0. Salir:");

        Opcion = sc.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.println("Introduce El Primer Número:");
                    int num1 = sc.nextInt();
                    System.out.println("Introduce El Segundo Número: ");
                    int num2 = sc.nextInt();
                    int res = op.Sumar(num1,num2);
                    System.out.println("El Resultado De" + num1 + "+" + num2 + "=" + res);
                    break;

                case 2:
                    System.out.println("Cual Número Deseas Saber Su Fatorial: ");
                    long x = sc.nextInt();
                    System.out.println("Su Factorial Es:" + op.Factorial(x));
                    break;

                case 3:
                    System.out.println("Introduce Cuantos Números Deseas Imprimir: ");
                    int Lim = sc.nextInt();
                    System.out.println("" + op.Primos(Lim));
                    break;

                /*case 4:
                    System.out.println("Introduce EL Numero De Filas De La Matríz 1: ");
                    int Fil1 = sc.nextInt();
                    System.out.println("Introduce El Numero De Columnas De La Matriz 1:");
                    int Col1 = sc.nextInt();
                    System.out.println("Introduce El Numero De Filas De La Matriz 2: ");
                    int Fil2 = sc.nextInt();
                    System.out.println("Introduce El Numero De Columnas De La Matriz 2:");
                    int Col2 = sc.nextInt();
                    System.out.println("El Resultado de" + M1 + "+" + M2 + "=" + MR);
                    break;*/
            }
        }
        while (Opcion != 6);
    }
}

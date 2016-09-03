import java.util.Scanner;

public class Basicas {
    /*int[][] arreglo1 = new int [4][4];
    int[][] arreglo2 = new int [4][4];*/
    Scanner sc = new Scanner(System.in);



    public int Sumar (int x, int y){
        int num1 = x;
        int num2 = y;
        int res = num1 + num2;
        return res;
        }



    public long Factorial (long n){
        long fact = 1;
        while (n >= 1){
            fact *= n;
            n--;
        }
        return fact;
    }



    public int Primos(int Lim){
        int cta1 = 2;
        int cta2;
        int contador = 0;

        while (contador < Lim){
            cta2=0;
            int divisor;
            for(divisor = 1 ; divisor <= cta2; divisor++){
                if(cta1%divisor==0)
                    cta2++;
            }
            if(cta2==2){
                cta1 = sc.nextInt();
                contador++;
            }
            cta1++;
        }
        return cta1;
    }



    public int SumaMatrices(int FilasMatriz1, int ColumnasMatriz1, int FilasMatriz2, int ColumnasMatriz2, int SumaMatriz){


        return SumaMatriz;
    }



    //public int BNumero(){

    //}


}


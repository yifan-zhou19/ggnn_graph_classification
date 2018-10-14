package EjerciciosPropios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        int n1=0,n2=1,n3,n;
        String cadena;
        Scanner teclado = new Scanner(System.in);
        int[] secuencia;
        
        System.out.print("Introduzca el número de dígitos que quiera ver de la secuencia de Fibonacci: ");
        cadena = teclado.next();
        n = Integer.parseInt(cadena);
        
        secuencia = new int[n];
        secuencia[0]=0;
        secuencia[1]=1;
        
        if(n>2){
            for(int i=2; i<n; i++){
                n3 = n1+n2;
                n1 = n2;
                n2 = n3;
                secuencia[i]=n3;
            }
        }
        
        System.out.println("Secuencia de Fibonacci con "+n+" dígitos:");
        
        for(int i=0; i<n; i++){
            System.out.print(" "+secuencia[i]+" ");
        }
    }
}
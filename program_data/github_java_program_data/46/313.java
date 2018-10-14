package javapenis;

import java.util.Scanner;

public class JavaPenis {

    public static int buscaBinaria(int vetor[], int maior, int chave){
        
        int menor = 0;
        int iteracoes = 0;
        
        while(menor <= maior){
            int meio = (menor+maior)/2;
            iteracoes = iteracoes + 1;
            if(chave == vetor[meio]){
                System.out.printf("Foram realizadas %d iterações e a chave %d foi encontrada na posição %d\n", iteracoes, chave, meio);
                return meio;
            }else if(chave < vetor[meio]){
                maior = meio - 1;
            }else{
                menor = meio + 1;
            }
        }   
        System.out.printf("Foram realizadas %d iterações e a chave %d não foi encontrada!\n", iteracoes, chave);
        
        return 0;
    }
       
    public static int numeroChave(){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Entre com o número a ser buscado: ");
        int numero = reader.nextInt();
        return numero;
    }
    
    public static int maior(int vetor[]){
        return vetor.length - 1;
    }
    
    public static void main(String[] args) {
        int[] vetor = {21, 45, 51, 55, 68, 85, 90};
        int chave = numeroChave();
        buscaBinaria(vetor, maior(vetor), chave);

    }    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
public class Insertionsort {
    public static void insertionSort(double[] tablica){
 
    double klucz; 
    int j;
 
    //dla kazdego elementu tablicy do posortowania, poczawszy od drugiego
    for (int i=1;i<tablica.length;i++){
        j=i;
        klucz=tablica[i];
    //poszukaj miejsca dla aktualnego elementu
    //szukaj tylko w posortowanej juz czescie tablicy
    //(czyli wsrod elementow o indeksach mniejszych od aktualnego)
    //przesuwaj element w kiedunku poczatku tablicy
    //tak dlugo, az przed nim jest element wiekszy i
    //nie znajduje sie na poczatku tablicy
        while (j>0 && tablica[j-1]>klucz){
        tablica[j]=tablica[j-1];
        j--;
        }
        tablica[j]=klucz;
    }
 
    //wypisz zawartosc posortowanej tablicy
    for(int i = 0 ; i<tablica.length; i++){
    System.out.println("#"+ (i+1) +" :\t" + tablica[i]);
        }
    System.out.println();
    }
}
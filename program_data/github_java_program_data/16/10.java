package singlethreaded;

import interfaces.SortingBase;
import java.util.ArrayList;

public class Radixsort implements SortingBase {

  /**
   * Gibt die Ziffer einer Zahl am Index "digit" aus. (von hinten nach vorne: digit = 0 => Einerziffer, digit = 1 => Zehnerziffer, ...)
   * Falls digit > Länge der Zahl wird 0 zurückgegeben
   *
   * @param element Integer
   * @param digit int
   * @return int
   * @throws IllegalArgumentException Negative Zahlen sind nicht erlaubt
   */
  private int key(int element, int digit) throws IllegalArgumentException {
    // Negative Zahl?
    if (element < 0) {
      throw new IllegalArgumentException("Negative Zahlen sind nicht erlaubt!");
    }

    String tmp = String.valueOf(element);

    // "Vorne mit Nullen auffüllen"
    if (tmp.length() <= digit) {
      return 0;
    }

    // Ziffer bestimmen
    tmp = Character.toString(tmp.charAt(tmp.length() - digit - 1));

    return Integer.parseInt(tmp);
  }

  /**
   * Buckets zusammenführen
   *
   * @param buckets ArrayList<Integer>[]
   * @param elements Integer[]
   */
  private void concatenate(ArrayList<Integer>[] buckets, int[] elements) {
    int counter = 0;

    // Buckets in Array zusammenführen
    for (int i = 0; i < buckets.length; i++) {
      ArrayList<Integer> bucket = buckets[i];

      for (Integer integer : bucket) {
        elements[counter++] = integer;
      }
    }
  }

  /**
   * Teilt die Elemente anhand der Ziffer am Index "digit" in die verschiedenen Buckets auf
   *
   * @param elements Integer[]
   * @param digit int
   */
  private void kSort(int[] elements, int digit) {
    ArrayList<Integer>[] buckets = new ArrayList[10];

    // Buckets initialisieren
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new ArrayList<>();
    }

    // Elemente in Buckets aufteilen
    for (Integer element : elements) {
      buckets[key(element, digit)].add(element);
    }

    // Buckets zusammenfügen
    concatenate(buckets, elements);
  }

  /**
   * Sortiert das Integer Array mit Radixsort
   *
   * @param elements Integer[]
   */
  public void sort(int[] elements) {
    // Länge der größten Zahl bestimmen
    int d = 0;
    int tmp;

    for (int element : elements) {
      tmp = String.valueOf(element).length();
      if (tmp > d) {
        d = tmp;
      }
    }

    // Sortieren
    for (int i = 0; i < d; i++) {
      kSort(elements, i);
    }
  }

  @Override
  public String getName() { return "Radixsort"; }
}

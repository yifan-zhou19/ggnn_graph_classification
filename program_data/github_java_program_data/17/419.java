package singlethreaded;

import interfaces.SortingBase;

public class Mergesort implements SortingBase {

  /**
   * Sortiert das Array mit Hilfe von sortHelper()
   *
   * @param numbers int[]
   */
  public void sort(int[] numbers) {
    sortHelper(numbers, 0, numbers.length - 1);
  }


  /**
   * Sortiert ein int-Array mit Mergesort
   *
   * @param numbers int[]
   * @param left int
   * @param right int
   */
  private void sortHelper(int[] numbers, int left, int right) {
    // Abbruchbedingung
    if (left == right) {
      return;
    }

    // Mitte berechnen
    int middle = (right + left) / 2;

    // Partitionen sortieren
    sortHelper(numbers, left, middle);
    sortHelper(numbers, middle + 1, right);

    // Mergen
    int j = left;
    int k = middle + 1;
    int[] tmp = new int[numbers.length];

    for (int i = 0; i <= right - left; i++) {
      // Linker Teil ist leer
      if (j > middle) {
        tmp[i] = numbers[k++];
      } else {
        // Rechter Teil ist leer
        if (k > right) {
          tmp[i] = numbers[j++];
        } else {
          if (numbers[j] <= numbers[k]) {
            tmp[i] = numbers[j++];
          } else {
            tmp[i] = numbers[k++];
          }
        }
      }
    }

    // Wieder zurück kopieren
    for (int i = 0; i <= right - left; i++) {
      numbers[left + i] = tmp[i];
    }
  }

  public String getName() {
    return "Mergesort";
  }
}

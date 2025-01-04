package vzdornov.algo;

public class InsertionSort implements ISort {

  @Override
  public void sort(int[] arr) {
    insertionSort(arr);
  }

  // Time complexity: average O(n^2) and best O(n) - Space complexity: O(1)
  public static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int temp = arr[i];
      int j = i;
      while (j > 0 && arr[j - 1] > temp) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = temp;
    }
  }

}

package vzdornov.algo;

public class BubbleSort implements ISort {

  @Override
  public void sort(int[] arr) {
    bubbleSort(arr);
  }

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }

}

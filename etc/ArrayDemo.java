public class ArrayDemo {
  public static void main(String[] args) {
    // Deklarasi dan inisialisasi array
    int[] array = new int[3];
    array[0] = 10;
    array[1] = 10;
    array[2] = 10;

    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // for each

    for (int bil : array) {
      System.out.println(bil);
    }

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);

    int[] array2 = {1, 2, 3, 4, 5}; // Deklarasi dan inisialisasi dengan nilai

    int[] array3;
    array3 = new int[10];
  }
}

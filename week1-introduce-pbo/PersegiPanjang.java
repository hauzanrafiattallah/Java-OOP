import java.util.Scanner;

public class PersegiPanjang {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String temp_panjang = input.nextLine();
    String temp_lebar = input.nextLine();

    float panjang = Float.parseFloat(temp_panjang);
    float lebar = Float.parseFloat(temp_lebar);

    float luas = panjang * lebar;

    System.out.println(luas);
  }
}

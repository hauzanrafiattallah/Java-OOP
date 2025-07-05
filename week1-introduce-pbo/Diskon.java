import java.util.Scanner;

public class Diskon {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String temp_harga = input.nextLine();
    String temp_diskon = input.nextLine();

    int harga = Integer.parseInt(temp_harga);
    double diskon = Double.parseDouble(temp_diskon);


    double total = harga;

    if (harga >= 1000000) {
      total = total - harga * diskon;
    
    } 

    System.out.println(total);
  }
}

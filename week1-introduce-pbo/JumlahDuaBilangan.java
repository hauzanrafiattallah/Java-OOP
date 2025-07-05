import java.util.Scanner;

public class JumlahDuaBilangan {
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);

    // int b1 = input.nextInt();
    // int b2 = input.nextInt();

    // int b3 = b1 + b2;

    // System.out.println(b3);

    Scanner input = new Scanner(System.in);

    String temp_b1 = input.nextLine();
    String temp_b2 = input.nextLine();

    float b1 = Float.parseFloat(temp_b1);
    float b2 = Float.parseFloat(temp_b2);

    float b3 = b1 + b2;

    System.out.println(b3);
  }


}

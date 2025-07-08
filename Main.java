public class Main {
  public static void main(String[] args) {
    Bus D10 = new Bus("D 4 NJ", "Supri", 3);

    D10.addPenumpang("Jamal");
    D10.addPenumpang("JuJu");
    D10.addPenumpang("Jatim");
    D10.addPenumpang("Jabar");

    System.out.println(D10.toString());
  }
}

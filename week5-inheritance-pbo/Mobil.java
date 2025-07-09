public class Mobil extends Kendaraan {
  // Constructor
  public Mobil(String merek, int tahun) {
    super(merek, tahun); // Call parent constructor
  }

  void mogok() {
    System.out.println("Mobil " + merek + " tahun " + tahun + " mogok.");
  }
}

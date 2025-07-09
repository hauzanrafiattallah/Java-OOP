public class Kendaraan {
  protected String merek;
  protected int tahun;

  // Constructor
  public Kendaraan(String merek, int tahun) {
    this.merek = merek;
    this.tahun = tahun;
  }

  void start() {
    System.out.println("Kendaraan " + merek + " tahun " + tahun + " mulai berjalan.");
  }
}

public class Mobil extends Kendaraan {
  // atribut
  String warna;
  
  // Constructor for Mobil
  public Mobil(String merek, int tahun, String warna) {
    super(merek, tahun); // Call parent constructor
    this.warna = warna;
  }

  // getter
  String getWarna() {
    return warna;
  }
  
  void mogok() {
    System.out.println("Mobil " + merek + " warna " + warna + " tahun " + tahun + " mogok.");
  }
}

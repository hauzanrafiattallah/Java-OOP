public class Motor extends Kendaraan {
  public Motor(String merek, int tahun) {
    super(merek, tahun); // Call parent constructor
  }

  void standar() {
    System.out.println("Motor " + merek + " tahun " + tahun + " menggunakan standar.");
  }
}

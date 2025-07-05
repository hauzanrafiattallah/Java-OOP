public class Mobil {
  // Atribut
  private String merk;
  private int tahunProduksi;

  // Konstruktor 
  public Mobil(String merk, int tahun) {
    this.merk = merk;
    this.tahunProduksi = tahun;
  }

  //Overloading Konstruktor
  public Mobil(String merk) {
    this.merk = merk;
    this.tahunProduksi = 2023; // Default tahun produksi
  }

  // Overloading Konstruktor
  public Mobil() {
    this.merk = "Tidak diketahui"; // Default merk
    this.tahunProduksi = 2023; // Default tahun produksi
  }

  // Setter
  public void setMerk(String merk) {
    this.merk = merk;
  }
  public void setTahunProduksi(int tahunProduksi) {
    this.tahunProduksi = tahunProduksi;
  }

  // Getter
  public String getMerk() {
    return merk;
  }
  public int getTahunProduksi() {
    return tahunProduksi;
  }


  // Metode
  void berjalan() {
    System.out.println("Mobil " + merk + " tahun " + tahunProduksi + " sedang berjalan.");
  }

}
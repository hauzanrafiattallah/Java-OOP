package etc;
public class Bus {
  // atribut
  private String nopol;
  private String supir;
  private String[] penumpang;
  private int jumlahPenumpang = 0;

  // metode overloading konstruktor
  public Bus(String nopol, String supir, int kapasitas){
    this.nopol = nopol;
    this.supir = supir;
    this.penumpang = new String[kapasitas];
  }

  // setter
  public void setNopol(String nopol) {
    this.nopol = nopol;
  }

  public void setSupir(String supir) {
    this.supir = supir;
  }

  public void setPenumpang(String[] penumpang) {
    this.penumpang = penumpang;
  }

  public void setJumlahPenumpang(int jumlahPenumpang) {
    this.jumlahPenumpang = jumlahPenumpang;
  }

  // Getter
  public String getNopol() {
    return nopol;
  }
  public String getSupir() {
    return supir;
  }

  public String[] getPenumpang() {
    return penumpang;
  }

  public int jumlahPenumpang(){
    return jumlahPenumpang;
  }

  public void addPenumpang(String p) {
      if (jumlahPenumpang < penumpang.length) {
        penumpang[jumlahPenumpang] = p;
        jumlahPenumpang++;
        System.out.println("Jumlah penumpang: " + jumlahPenumpang);
      }else{
        System.out.println("Bus sudah penuh");
      }
  }

  @Override
  // metode toString untuk menampilkan informasi bus
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Nopol: ").append(nopol).append("\n");
    sb.append("Supir: ").append(supir).append("\n");
    sb.append("Penumpang: ");


    for (int i = 0; i < jumlahPenumpang; i++) {
      sb.append(penumpang[i]);
      if (i < jumlahPenumpang - 1) {
        sb.append(", ");
      }
    }
    sb.append("\n");
    sb.append("Jumlah Penumpang: ").append(jumlahPenumpang).append("\n");
    return sb.toString(); 
  }
  
}

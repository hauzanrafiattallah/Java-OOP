public class Lingkaran {
  // Atribut
  double radius;
  double luas; 
  double keliling;

  // Konstruktor
  


  //Setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // public void setLuas(double luas) {
  //   this.luas = luas;
  // }

  // public void setKeliling(double keliling) {
  //   this.keliling  = keliling;
  // }

  //Getter

  public double getRadius() {
    return radius;
  }

  // public double getLuas() {
  //   return luas;
  // }

  // public double getKeliling() {
  //   return keliling;
  // }


  public double hitungLuas(double radius) {
    return Math.PI * Math.pow(radius, 2);
  }

  // atau

  public double hitungLuas2() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  public double hitungKeliling(double radius) {
    return 2 * Math.PI * radius;
  }

  // atau
  public double hitungKeliling2() {
    return 2 * Math.PI * this.radius;
  }


  // metode main

  public static void main(String[] args) {
    // membuat kelas
    Lingkaran L1 = new Lingkaran();
    Lingkaran L2 = new Lingkaran();
    
    L1.radius = 10.00; // Cara terlarang dalam oop tidak boleh mengakses langsung atribut
    L2.setRadius(10.00); // Cara yang benar

    System.out.println(L1.hitungLuas2());
    System.out.println(L1.hitungKeliling2());

    System.out.println(L2.hitungLuas2());
    System.out.println(L2.hitungKeliling2());
  }

}
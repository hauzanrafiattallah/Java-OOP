public class Car implements Colorable, Cloneable { // bisa implement lebih dari 1 interface
  // atribute
  private Color color;
  private String pemilik;
  private String platNomor;

  public Car() {
    System.out.println("Constructor Car");
    color = Color.BLACK; // default color
    pemilik  = "";
    platNomor = "";
  }

  // setter
  public void setColor(Color color) {
    this.color = color;
  }
  public void setPemilik(String pemilik) {
    this.pemilik = pemilik;
  }
  public void setPlatNomor(String platNomor){
    this.platNomor = platNomor;
  }

  //Getter
  public Color getColor(){
    return color;
  }
  public String getPemilik() {
    return pemilik;
  }
  public String getPlatNomor() {
    return platNomor;
  }
}

public class Main {
  public static void main(String[] args) {
    // Create a Kendaraan object
    Kendaraan kendaraan = new Kendaraan("Toyota", 2020);
    kendaraan.start();
    
    // Create a Mobil object (inheritance example)
    Mobil mobil = new Mobil("Honda", 2018, "Merah");
    mobil.start(); // Inherited method from Kendaraan
    mobil.mogok(); // Mobil's own method

    // Create a Motor object (inheritance example)
    Motor motor = new Motor("yamaha", 2021);
    motor.start(); // Inherited method from Kendaraan
    motor.standar(); // Motor's own method
  }
}
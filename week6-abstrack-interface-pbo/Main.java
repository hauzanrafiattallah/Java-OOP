public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(10);

    circle.display();

    System.out.println("Luas: " + circle.area());
    System.out.println("Keliling: " + circle.perimeter());
  }
}

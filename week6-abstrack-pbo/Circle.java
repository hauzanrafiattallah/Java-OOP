public class Circle extends Shape {
  // atribut
  private double radius;

  // constructor method
  public Circle(double radius) {
    this.radius = radius;
  }

  // implement method abstract from Circle
  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }
  public double perimeter() {
    return 2 * Math.PI * radius;
  }


}

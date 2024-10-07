public class Main {
    public static void main(String[] args) {
        // instance of person
       Rectangle rectangle = new Rectangle(5.0, 10.0);

       double area = rectangle.calculateArea();
       double perimeter = rectangle.calculatePerimeter();

        System.out.println("Perimeter " + perimeter);
        System.out.println("Area  " +area);
    }
}
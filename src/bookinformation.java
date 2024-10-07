public class bookinformation {
    public static void main (String[] args) {
        // this is for book information
        String bookTitle = "Java Programming";
        String auThor = "John Doe";
        int publicationYear = 2023;
        Float price = 45.99f;

        // this is for rectange dimensions
        int length = 10;
        int width = 5;
        int area = length * width;


        // calculated area rectange dimension result
        Float pricePerSquareMeter  = price / area;


        // SYSTEM OUT PRINT
        System.out.println("book title : " + bookTitle);
        System.out.println("author : " + auThor);
        System.out.println("Publication Year : " + publicationYear);
        System.out.println("price : " + price);
        System.out.println("length and width ? " + area + " square meter");
        System.out.println("Price Per Square : $ " + pricePerSquareMeter);

    }
}

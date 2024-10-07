public class PanjangKaliLebar {
    public static void main (String[] args) {
        // buat integer
        int length=8;
        int width=4;
        int area;
        int perimeter;

        // menghitung
        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Length is  " + length);
        System.out.println("width is " + width);
        System.out.println("total area " + area);
        System.out.println("total perimeter " + perimeter);
        System.out.println("total area + perimeter = " + (area + perimeter));
    }
}

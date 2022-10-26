import java.util.Scanner;

public class Lesson2_hw3 {
    public static void main(String[] args) {
        // Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình chữ nhật đó.
        Scanner input = new Scanner(System.in);
        System.out.print("height=");
        double height = input.nextDouble();
        System.out.print("length=");
        double length = input.nextDouble();
        // find the real Height & Length
        double Height = Math.max(height, length);
        double Length = Math.min(height, length);
        double perimeter = 2 * ( Height + Length );
        double area = Height * Length;
        System.out.println("The perimeter of the rectangle is " +perimeter);
        System.out.println("The area of the rectangle is " +area);
    }
}


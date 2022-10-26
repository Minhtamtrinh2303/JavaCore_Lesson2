import java.util.Scanner;

public class Lesson2_hw6 {
    public static void main(String[] args) {
        //Nhập bán kính hình tròn, tính diện tích hình tròn đó
        Scanner input = new Scanner(System.in);
        System.out.print("The radius of the circle is:");
        double radius = input.nextDouble();
        final double PI = 3.14;
        double area = PI * Math.pow(radius,2);
        String result = (radius > 0) ? "The area of the circle is:" +area : "The radius of the circle must be a positive number.";
        System.out.println(result);
    }
}

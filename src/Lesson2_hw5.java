import java.util.Scanner;

public class Lesson2_hw5 {
    public static void main(String[] args) {
        // a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó.
        Scanner input = new Scanner(System.in);
        // nhập vào một chuỗi
        System.out.print("String=");
        String String = input.nextLine();
        // nhập vào ký tự muốn kiểm tra
        System.out.print("Character=");
        char Character = input.nextLine().charAt(0);
        // // Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của ký tự đó trong chuỗi vừa nhập.
        System.out.println("The position of the first occurrence of a character is: " +String.indexOf(Character));
        System.out.println("The position of the last occurrence of a character is: " +String.lastIndexOf(Character));
    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lesson2_hw4 {
    public static void main(String[] args) {
        //Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định, tính tuổi của người đó
        //(chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).
        Scanner input = new Scanner(System.in);
        System.out.println("Someone's birthday: ");
        String D = input.nextLine();
        LocalDate Birthday = LocalDate.parse(D, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate timeNow = LocalDate.now();
        // Tính tuổi
        int age = timeNow.getYear()-Birthday.getYear();
        System.out.println("Age=" +age);
    }
}


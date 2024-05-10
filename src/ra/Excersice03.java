package ra;

//[Bài tập] Tính chu vi và diện tính của hình vuông
//        1. Mục tiêu:
//        Luyện tập sử dụng biến, kiểu dữ liệu và các toán tử
//
//        2. Mô tả:
//        Xây dựng một ứng dụng tính toán chu vi và diện tích của hình vuông, hiển thị kết quả ra màn hình

import java.util.Scanner;

public class Excersice03 {
    public static void main(String[] args) {
        //1. Khai báo biến chiều dài cạnh hình vuông.
        double sideLength;

        //2. Khai báo biến để lưu chu vi và diện tích.
        double perimeter, area;

        //3. Khởi tạo đối tượng Scanner.
        Scanner scanner = new Scanner(System.in);

        //4. Nhập chiều dài cạnh hình vuông.
        System.out.print("Chiều dài cạnh của hình vuông: ");
        sideLength = scanner.nextDouble();

        //5. Tính chu vi hình vuông
        perimeter = 4 * sideLength;

        //5. Tính diện tích hình vuông.
        area = sideLength * sideLength;

        //6. hiển thị kết quả.
        System.out.println("Chu vi của hình vuông là: " + perimeter);
        System.out.println("Diện tích của hình vuông là: " + area);
    }
}

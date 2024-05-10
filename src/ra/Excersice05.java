package ra;

//[Bài tập] Nhập từ bàn phím bán kính hình tròn. Tính chu vi và diện tích hình tròn
//        1. Mục tiêu:
//        Luyện tập và hiểu về những toán tử toán tử toán học và nhập xuất trong Java
//
//        2. Mô tả:
//        Nhập vào bán kính đường tròn và thực hiện tính toán chu vi và diện tích của đường tròn
//        Để tính chu vi dùng công thức: 2 * pi * r
//        Để tính diện tích công thức: pi * r * r
//        Với r là bán kính đường tròn

import java.util.Scanner;

public class Excersice05 {
    public static void main(String[] args) {
        //1. Khai báo biến cho bán kính và hằng số pi.
        double radius, pi = Math.PI;

        //2. Khai báo biến cho chu vi và diện tích.
        double circumference, area;

        //3. khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        //4. Nhập vào bán kính.
        System.out.print("Nhập vào bán kính của hình tròn: ");
        radius = scanner.nextDouble();

        //5. Tính chu vi hình tròn.
        circumference = 2 * pi * radius;

        //6. Tính diện tích hình tròn
        area = pi * radius * radius;

        //7. Hiển thị kết quả
        System.out.println("Chu vi của hình tròn là: " + circumference);
        System.out.println("Diện tích của hình tròn là: " + area);
    }
}

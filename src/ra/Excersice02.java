package ra;

//[Bài tập] Ứng dụng chuyển đổi tiền tệ
//        1. Mục tiêu:
//        Luyện tập sử dụng biến, kiểu dữ liệu và toán tử
//
//        2. Mô tả:
//        Xây dựng một ứng dụng chuyển đổi tiền tệ,
//        cho phép tính giá trị tiền VNĐ dựa trên một tỉ giá cho trước và giá trị tiền USD được nhập vào.

import java.util.Scanner;

public class Excersice02 {
    public static void main(String[] args) {
        //1. Khai báo biến tỉ giá đối hoái và gán giá trị: 1 USD = 25,500 VNĐ
        double exchangeRate = 25.500;

        //2. Khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        //3. Nhập giá trị tiền USĐ từ người dùng
        System.out.print("Số tiền USĐ cần chuyển đổi: ");
        double usdAmount = scanner.nextDouble();

        //4. Tính giá trị tiền VNĐ
        double vndAmount = usdAmount * exchangeRate;

        //5. Hiển thị kết quả
        System.out.println( usdAmount + " USĐ" + " = " + vndAmount + " VNĐ");
    }
}

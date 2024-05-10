package ra;

//[Bài tập] Hiển thị lời chào
//        1. Mục tiêu:
//        Luyện tập thao tác nhập dữ liệu từ bàn phím

//        2. Mô tả:
//        Trong phần này, chúng ta sẽ phát triển một ứng dụng Java cho phép nhập tên của người dùng từ bàn phím,
//        sau đó hiển thị lời chào kèm theo tên của người đó.
//        Nội dung sẽ hiển thị trên chương trình chạy:

import java.util.Scanner;

public class Excersice01 {
    public static void main(String[] args) {
        //1. khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        //2. Yêu cầu người dùng  nhập tên
        System.out.println("Enter your name:");

        //3. Lấy dữ liệu lưu vào biến
        String name = scanner.nextLine();

        //4. In ra xin chào + "tên"
        System.out.println("Hello: " + name);
    }
}

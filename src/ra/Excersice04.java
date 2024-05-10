package ra;

//[Bài tập] Tính điểm trung bình của 3 điểm môn học (Toán, Văn, Anh)
//        1. Mục tiêu:
//        Luyện tập thao tác với những câu lệnh nhập xuất và các toán tử toán học
//
//        2. Mô tả:
//        Chương trình chúng ta sẽ cần nhập vào 3 giá trị tương đương với 3 điểm môn học (Toán, Văn, Anh)
//        sau đó tỉnh tổng trung bình cộng ba điểm và hiển thị trên màn hình

import java.util.Scanner;

public class Excersice04 {
    public static void main(String[] args) {
        //1. Khai báo biến cho điểm Toán, Văn, Anh.
        double mathScore, literatureScore, englishScore;

        //2. Khai báo biến điểm trung bình.
        double averageScore;

        //3. Khởi tạo đối tượng Scanner.
        Scanner scanner = new Scanner(System.in);

        //4. Nhập điểm toán
        System.out.print("Nhập điểm môn Toán: ");
        mathScore = scanner.nextDouble();

        //5. Nhâp điểm văn
        System.out.print("Nhập điểm môn Văn: ");
        literatureScore = scanner.nextDouble();

        //6. Nhập điểm tiếng Anh
        System.out.print("Nhập điểm môn Anh: ");
        englishScore = scanner.nextDouble();

        //7. Tính điểm trung bình
        averageScore = (mathScore + literatureScore + englishScore) / 3;

        //8. Hiển thị kết quả
        System.out.println("Tổng điểm trung bình là: " + averageScore);
    }
}

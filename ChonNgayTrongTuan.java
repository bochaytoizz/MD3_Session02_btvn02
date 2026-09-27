package session02;

import java.util.Scanner;

public class ChonNgayTrongTuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên từ 1 - 7");
        int n = scanner.nextInt();

        switch (n){
            case 1 :
                System.out.println("Chủ Nhật");
                break;
            case 2:
                System.out.println("Thứ Hai");
                break;
            case 3:
                System.out.println("Thứ Ba");
                break;
            case 4:
                System.out.println("Thứ Tư");
                break;
            case 5:
                System.out.println("Thứ Năm");
                break;
            case 6:
                System.out.println("Thứ Sáu");
                break;
            case 7:
                System.out.println("Thứ Bảy");
                break;
            default:
                System.out.println("Số nhập vào không hợp lệ!!!!");
        }
        scanner.close();
    }
}

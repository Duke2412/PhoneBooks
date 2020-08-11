import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBookManager phoneBookManager=new PhoneBookManager();
        boolean check = true;
        while (check) {
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ-----:");
            System.out.println("Chọn chức năng theo số(để tiếp tục):");
            System.out.println("1.Xem danh sách.");
            System.out.println("2.Thêm mới.");
            System.out.println("3.Cập nhật.");
            System.out.println("4.Xóa.");
            System.out.println("5.Tìm kiếm.");
            System.out.println("6.Đọc từ file CSV.");
            System.out.println("7.Ghi ra file CSV.");
            System.out.println("8.Thoát.");
            System.out.println("Chọn chức năng: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
    
                switch (choice) {
                    case 1:
                        phoneBookManager.show();
                        System.out.println("Đã hiển thị hết");
                        break;
                    case 2:
                        phoneBookManager.add();
                        System.out.println("Đã thêm xong");
                        break;
                    case 3:
                        System.out.println("Nhập số điện thoại muốn cập nhật: ");
                        int id=scanner.nextInt();
                        scanner.nextLine();
                        phoneBookManager.edit(id);
                        break;
                    case 4:
                        System.out.println("Nhập số điện thoại muốn xóa: ");
                        int id1=scanner.nextInt();
                        scanner.nextLine();
                        phoneBookManager.delete(id1);
                        break;
                    case 5:
                        System.out.println("Nhập từ khóa tìm kiếm :");
                        String key=scanner.nextLine();
                        phoneBookManager.searchProduct(key);
                        break;
                    case 6:
                        System.out.println("Nhập đường dẫn file CSV: ");
                        String filename=scanner.nextLine();
                        phoneBookManager.readCSV(filename);
                        break;
                    case 7:
                        System.out.println("Nhập đường dẫn File CSV: ");
                        phoneBookManager.writeCSV();
                        break;
                    case 8:
                        check=false;
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                        
                }
            } catch (InputMismatchException ex) {
                System.err.println("Yêu cầu nhập số chính xác");
                scanner.nextLine();
            }
        }
    }
}

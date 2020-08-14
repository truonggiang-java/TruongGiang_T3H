package baitapT3H;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Information im = new Information();
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.Nhập thông tin");
			System.out.println("2.Tính tiền khách phải trả và giảm giá");
			System.out.println("3.In thông tin");
			System.out.println("4.Thoát");
			System.out.print("Mời bạn chọn: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				im.inputData();
				break;
			case 2:
				im.payableMoney();
				break;
			case 3:
				im.displayData();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Bạn chỉ nhập từ 1-4. Yêu cầu bạn nhập lại");
				break;
			}
		} while (true);
	}
}



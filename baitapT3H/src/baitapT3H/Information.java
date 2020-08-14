package baitapT3H;

import java.util.Scanner;

public class Information implements IClient{
	
	public String LoaiVe;
	public String HoTen;
	public String GioiTinh;
	public int Tuoi;
	public String TenChuyenBay;
	public int ThoiGianBay;
	public int SoLuong;
	public int Tien1Ve;
	public int TienPhaiTra;

	public Information() {
		super();
	}

	public Information(String loaiVe, String hoTen, String gioiTinh, int tuoi, String tenChuyenBay, int thoiGianBay,
			int soLuong, int tien1Ve, int tienPhaiTra) {
		super();
		LoaiVe = loaiVe;
		HoTen = hoTen;
		GioiTinh = gioiTinh;
		Tuoi = tuoi;
		TenChuyenBay = tenChuyenBay;
		ThoiGianBay = thoiGianBay;
		SoLuong = soLuong;
		Tien1Ve = tien1Ve;
		TienPhaiTra = tienPhaiTra;
	}

	public String getLoaiVe() {
		return LoaiVe;
	}

	public void setLoaiVe(String loaiVe) {
		LoaiVe = loaiVe;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public String getTenChuyenBay() {
		return TenChuyenBay;
	}

	public void setTenChuyenBay(String tenChuyenBay) {
		TenChuyenBay = tenChuyenBay;
	}

	public int getThoiGianBay() {
		return ThoiGianBay;
	}

	public void setThoiGianBay(int thoiGianBay) {
		ThoiGianBay = thoiGianBay;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public int getTien1Ve() {
		return Tien1Ve;
	}

	public void setTien1Ve(int tien1Ve) {
		Tien1Ve = tien1Ve;
	}

	public int getTienPhaiTra() {
		return TienPhaiTra;
	}

	public void setTienPhaiTra(int tienPhaiTra) {
		TienPhaiTra = tienPhaiTra;
	}

	@Override
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		HoTen = sc.nextLine();
		System.out.println("Nhập giới tính: ");
		GioiTinh = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		Tuoi = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tên chuyến bay: ");
		TenChuyenBay = sc.nextLine();
		System.out.println("Nhập thời gian bay: ");
		ThoiGianBay = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập loại vé: ");
		LoaiVe = sc.nextLine();
		System.out.println("Nhập số lượng vé: ");
		SoLuong = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tiền 1 vé: ");
		Tien1Ve = Integer.parseInt(sc.nextLine());
	}

	public void payableMoney() {
		String seats = "Trung Cap";
		if (this.Tuoi > 6 && (this.ThoiGianBay >= 5 && this.ThoiGianBay <= 19) && this.LoaiVe != seats) {
			this.TienPhaiTra = this.SoLuong * this.Tien1Ve;
			
		}
		if (this.Tuoi > 6 && (this.ThoiGianBay >= 5 && this.ThoiGianBay <= 19) && this.LoaiVe == seats) {
			this.TienPhaiTra = (int) (this.SoLuong * this.Tien1Ve * 0.8);
			System.out.println("Được giảm 20% khi chọn ghế: Trung Cap");
		}
		if (this.Tuoi <= 6 && (this.ThoiGianBay >= 5 && this.ThoiGianBay <= 19) && this.LoaiVe != seats) {
			this.TienPhaiTra = (int) (this.SoLuong * this.Tien1Ve * 0.8);
			System.out.println("Được giảm 20% khi có trẻ em dưới 6 tuổi");
			
		}
		if (this.Tuoi > 6 && ((this.ThoiGianBay >= 20 && this.ThoiGianBay <= 24)
				|| (this.ThoiGianBay >= 0 && this.ThoiGianBay <= 4)) && this.LoaiVe != seats) {
			this.TienPhaiTra = (int) (this.SoLuong * this.Tien1Ve * 0.5);
			System.out.println("Được giảm 50% khi bay trong khoảng từ 20h tối-4h sáng");
			
		}
		if (this.Tuoi > 6 && ((this.ThoiGianBay >= 20 && this.ThoiGianBay <= 24)
				|| (this.ThoiGianBay >= 0 && this.ThoiGianBay <= 4)) && this.LoaiVe == seats) {
			this.TienPhaiTra = (int) (this.SoLuong * this.Tien1Ve * 0.3);
			System.out.println("Được giảm 70% khi bay trong khoảng từ 20h tối - 4h sáng và chọn Loại ghế: Trung Cấp");
			
		}
		if (this.Tuoi <= 6 && ((this.ThoiGianBay >= 20 && this.ThoiGianBay <= 24)
				|| (this.ThoiGianBay >= 0 && this.ThoiGianBay <= 4)) && this.LoaiVe != seats) {

			this.TienPhaiTra = (int) (this.SoLuong * this.Tien1Ve * 0.3);
			System.out.println("Được giảm 70% khi bay trong khoảng từ 20h tối - 4h sáng và Trẻ em nhỏ hơn 6 tuổi");
			
		}
		if (this.Tuoi <= 6 && ((this.ThoiGianBay >= 20 && this.ThoiGianBay <= 24)
				|| (this.ThoiGianBay >= 0 && this.ThoiGianBay <= 4)) && this.LoaiVe == seats) {

			this.TienPhaiTra = (int) (this.SoLuong * this.Tien1Ve * 0.1);
			System.out.println(
					"Duoc giam 90% bay trong khoang thoi gian 20h-4h va Tre em nho hon 6 tuoi + ghe Trung cap");

		}
	}

	@Override
	public void displayData() {
		System.out.printf("Họ và tên: %s\n",this.HoTen);
		System.out.printf("Giới tính: %s\n",this.GioiTinh);
		System.out.printf("Tuổi: %d\n",this.Tuoi);
		System.out.printf("Tên chuyến bay: %s\n",this.TenChuyenBay);
		System.out.printf("Thời gian bay: %dh\n",this.ThoiGianBay);
		System.out.printf("Loại vé: %s\n",this.LoaiVe);
		System.out.printf("Số lượng vé khách mua: %d\n",this.SoLuong);
		System.out.printf("Tiền 1 vé: %d\n",this.Tien1Ve);
		System.out.printf("Tiền khách phải trả là: %d\n",this.TienPhaiTra);
	}

}




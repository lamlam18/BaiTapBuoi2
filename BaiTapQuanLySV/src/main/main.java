package main;

import java.util.Scanner;

import QuanLySinhVien.OOP.QuanLy;
import QuanLySinhVien.OOP.SinhVien;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuanLy quanLy = new QuanLy();
		
		Scanner sc = new Scanner(System.in);
		int luaChon;
		boolean run = true;
		do {
			luaChon = inMenu(sc);
			switch (luaChon) {
			case 1:
				SinhVien sinhVien = new SinhVien();
				sinhVien.nhapThongtTin(sc);
				if (quanLy.themSinhVien(sinhVien)) {
					System.out.println("Thêm sinh viên thành công");
				}
				else {
					System.out.println("Thêm sinh viên thất bại");
				}
					
				
				break;
				
			case 2:
				quanLy.inTatCaThongTin();
				break;
				
			case 3:
				SinhVien max = quanLy.xuatSinhVienTBCao();
				if (max == null) {
					System.out.println("Không có sinh viên trong danh sách");
					break;
				}
				System.out.println("Sinh viên có điểm trung bình cao nhất: ");
				max.inThongTin();
	
				break;
			case 4:
				quanLy.xuatTatCaSVYeu();
	
				break;
			case 5:
				String seach = null;
				System.out.println("Mời nhập tên sinh viên muốn kiếm: ");
				seach = sc.nextLine();
				quanLy.timSVTheoTen(seach);
	
				break;
			case 6:
				String maKiem = null;
				System.out.println("Mời nhập mã sinh viên muốn kiếm: ");
				maKiem = sc.nextLine();
				quanLy.timSVTheoMa(maKiem);
	
				break;
			case 7:
				String maXoa = null;
				System.out.println("Mời nhập mã sinh viên muốn xóa: ");
				maXoa = sc.nextLine();
				if (quanLy.xoaSinhVien(maXoa)) {
					System.out.println("Xóa sinh viên thành công");
				}
				else {
					System.out.println("Xóa sinh viên thất bại");
				}
	
				break;
			case 8:
				run = false;
				System.out.println("Thoát chường trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
				break;
			}
		} while (run);

	}

	private static int inMenu(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("---====MENU QUẢN LÝ SINH VIÊN====---");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xuất tất cả thông tin sinh viên");
		System.out.println("3. Xuất thông tin sinh viên có điểm tb cao nhất");
		System.out.println("4. Xuất tất cả sinh viên có học lực yếu");
		System.out.println("5. Tìm sinh viên theo tên");
		System.out.println("6. Tìm sinh viên theo mã");
		System.out.println("7. Xóa sinh viên theo mã");
		System.out.println("8. Thoát");
		return Integer.parseInt(sc.nextLine());
	}

}

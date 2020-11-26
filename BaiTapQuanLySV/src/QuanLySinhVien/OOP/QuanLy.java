package QuanLySinhVien.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
	//properties
	private ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();

	
	
	//getter-setter
	
	//construstor
	 
	
	//methods
	public boolean themSinhVien(SinhVien sinhVien) {
		// TODO Auto-generated method stub
		if ("".equals(sinhVien.getTen()) || "".equals(sinhVien.getMaSV())) {
			return false;
		}
		if (kiemTraTrungMaSo(sinhVien.getMaSV())) {
			return false;
		}
		return dsSinhVien.add(sinhVien);
	}

	private boolean kiemTraTrungMaSo(String maSV) {
		// TODO Auto-generated method stub
		boolean trungMa = false;
		for (SinhVien sinhVien : dsSinhVien) {
			if (sinhVien.getMaSV().equalsIgnoreCase(maSV)) {
				trungMa = true;
				break;
			}
		}
		return trungMa;
	}

	public void inTatCaThongTin() {
		// TODO Auto-generated method stub
		if (dsSinhVien.size() == 0  ) {
			System.out.println("Cần ít nhất 1 sinh viên để in");
		}
		else {
			for (SinhVien sinhVien : dsSinhVien) {
				sinhVien.inThongTin();
			}
		}
		
	}

	public SinhVien xuatSinhVienTBCao() {
		// TODO Auto-generated method stub
		if (dsSinhVien.size() == 0)
			return null;
		
		SinhVien max = dsSinhVien.get(0);
		
		for (SinhVien sinhVien : dsSinhVien) {
			if(max.tinhDiemTrungBinh() < sinhVien.tinhDiemTrungBinh()) {
				max = sinhVien;
			}
			
		}
		return max;
	}

	public void xuatTatCaSVYeu() {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : dsSinhVien) {
			if (sinhVien.tinhDiemTrungBinh() < 5) {
				sinhVien.inThongTin();
			}
		}
	}

	public void timSVTheoTen(String seach) {
		// TODO Auto-generated method stub
		//kiểm tra coi có mã hay không
		for (SinhVien sinhVien : dsSinhVien) {
			if (seach.equalsIgnoreCase(sinhVien.getTen())) {
				sinhVien.inThongTin();
				break;
			}	
			else {
				System.out.println("Không có sinh viên trong danh sách");
			}
		}
		
			
		
	}

	public void timSVTheoMa(String maKiem) {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : dsSinhVien) {
			if (maKiem.equalsIgnoreCase(sinhVien.getMaSV())) {
				sinhVien.inThongTin();
				break;
			}
			else {
				System.out.println("Không có sinh viên trong danh sách");
			}
		}

		
	}

	public boolean xoaSinhVien(String maXoa) {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : dsSinhVien) {
			if (maXoa.equalsIgnoreCase(sinhVien.getMaSV())) {
				dsSinhVien.remove(sinhVien);
				return true;
			}
		}
			
		
		return false;
	}


	

}

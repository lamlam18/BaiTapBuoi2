package QuanLySinhVien.OOP;

import java.util.Scanner;

public class SinhVien {
	//propeeties
	private String	ten;
	private String	maSV;
	private float	diemToan;
	private float	diemLy;
	private float	diemHoa;
	
	//getter-setter
	public String getTen() {
		return ten;
	}
	
	public String getMaSV(){
		return maSV;
	}
	
	//constructor
	public SinhVien() {
		ten			= "";
		maSV		= "";
		diemToan	= 0;
		diemLy		= 0;
		diemHoa		= 0;
	}
	
	//methods
	public float tinhDiemTrungBinh(){
		return (diemToan + diemLy + diemHoa) / 3;
	}
	
	public void nhapThongtTin(Scanner sc) {
		System.out.println("---====NHẬP THÔNG TIN SINH VIÊN====---");
		System.out.println("Mời nhập tên: ");
		this.ten = sc.nextLine();
		System.out.println("Mời nhập mã sinh viên: ");
		this.maSV = sc.nextLine();
		System.out.println("Mời nhập điểm toán: ");
		this.diemToan = Integer.parseInt(sc.nextLine());
		System.out.println("Mời nhập điểm lý: ");
		this.diemLy = Integer.parseInt(sc.nextLine());
		System.out.println("Mời nhập điểm hóa: ");
		this.diemHoa = Integer.parseInt(sc.nextLine());
	}
	
	public void inThongTin() {
		System.out.println("Tên sinh viên: " + this.ten);
		System.out.println("Mã sinh viên: " + this.maSV);
		System.out.println("Điểm toán: " + this.diemToan);
		System.out.println("Điểm lý: " + this.diemLy);
		System.out.println("Điểm hóa: " + this.diemHoa);
	}
	
	public void xepLoai() {
		if (tinhDiemTrungBinh() < 5 ) {
			System.out.println("Học lực yếu");
		}
		if (tinhDiemTrungBinh() < 6) {
			System.out.println("Học lực trung bình");
		}
		if (tinhDiemTrungBinh() < 7 ) {
			System.out.println("Học lực trung bình khá");
		}
		if (tinhDiemTrungBinh() < 8) {
			System.out.println("Học lực khá");
		}
		if (tinhDiemTrungBinh() < 9) {
			System.out.println("Học lực giỏi");
		}
		else {
			System.out.println("Học lực xuất sắc");
		}
	}
	

}

package bt_benhviendakhoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BenhNhan b1 = new BenhNhan("tuong", "22/2/2000", "viet nam", "101", "2", "01", "1/1/2020", " ", "5");
        System.out.println(b1);
        b1.setThayDoiBacSi("10");
        b1.setThayDoiNgayNhapVien("1/1/2022");
        b1.setThayDoiNgayXuatVien("22/2/2022");
        b1.setThayDoiPhong("02");
        System.out.println(b1);

        Bacsi bacsi = new Bacsi("khoa", "22/3/2000", "viet nam", "5", "202");
        System.out.println(bacsi);
        bacsi.getDanhSachBenhNhan();
        System.out.println(bacsi.getDanhSachBenhNhan());
        bacsi.setChinhSuathongTinBacSi("10", "thach", "3/3/2003", "viet nam");
        bacsi.setDoiKhoa("203");
        System.out.println(bacsi);

        Khoa k1 = new Khoa("202", "Khoa phu san");
        System.out.println(k1);
        k1.getDanhSachBacSi().add(bacsi);
        k1.setSuaTenKhoa("khoa than kinh");
        k1.themBacSi(new Bacsi("huy", "22/5/2000","viet nam", "15", "khoa phu san"));
        k1.xoaBacSi("10");
        System.out.println(k1);
    }
}

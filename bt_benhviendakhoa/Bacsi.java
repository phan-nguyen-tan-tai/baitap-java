package bt_benhviendakhoa;

import java.util.ArrayList;
import java.util.List;

public class Bacsi extends Person {
    private String idBacSi;
    private String idKhoaDM;
    private List<String> danhSachBenhNhan;


    public Bacsi(String ten, String namSinh, String diaChi, String idBacSi, String idKhoaDM) {
        super(ten, namSinh, diaChi);
        this.idBacSi = idBacSi;
        this.idKhoaDM = idKhoaDM;
        this.danhSachBenhNhan = new ArrayList<>();
    }

    public String getIdBacSi() {
        return idBacSi;
    }
    public void setIdBacSi(String idBacSi) {
        this.idBacSi = idBacSi;
    }
    public String getIdKhoaDM() {
        return idKhoaDM;
    }
    public void setIdKhoaDM(String idkhoaDM) {
        this.idKhoaDM = idkhoaDM;
    }

    public List<String> getDanhSachBenhNhan() {
        return danhSachBenhNhan;
    }

    @Override
    public String toString() {
        return "BacSi: " + super.toString() + ", idBacSi: "+idBacSi+ ", idKhoaDM: "+ idKhoaDM
                +", danhSachBenhNhan: "+ danhSachBenhNhan;}

    public void setChinhSuathongTinBacSi(String idBacSi, String ten, String namSinh, String diaChi) {
        super.setTen(ten);
        super.setNamSinh(namSinh);
        super.setDiaChi(diaChi);
        this.idBacSi = idBacSi;

    }
    public void setDoiKhoa(String idKhoaDM){
        this.idKhoaDM = idKhoaDM;
    }
}


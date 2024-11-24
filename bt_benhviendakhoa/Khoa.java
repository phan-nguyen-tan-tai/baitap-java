package bt_benhviendakhoa;

import java.util.ArrayList;
import java.util.List;

public class Khoa {
    private String idKhoa;
    private String tenKhoa;
    private List<Bacsi> danhSachBacSi; //danh sach bac si thuoc khoa

    public Khoa(String idKhoa, String tenKhoa) {
        this.idKhoa = idKhoa;
        this.tenKhoa = tenKhoa;
        this.danhSachBacSi = new ArrayList<Bacsi>();
    }

    public String getIdKhoa(){
        return idKhoa;
    }

    public void setIdKhoa(String idKhoa){
        this.idKhoa = idKhoa;
    }

    public String getTenKhoa(){
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa){
        this.tenKhoa = tenKhoa;
    }

    //getter cho danh sach bac si
    public List<Bacsi> getDanhSachBacSi(){
        return danhSachBacSi;
    }

    //them bac si vao danh sach
    public void themBacSi(Bacsi bacsi){
        danhSachBacSi.add(bacsi);
    }

    //xoa bac si
    public void xoaBacSi(String idBacSi){
        danhSachBacSi.removeIf (bacsi -> bacsi.getIdBacSi() == idBacSi);
    }

    //sua ten khoa
    public void setSuaTenKhoa(String tenKhoa){
        this.tenKhoa = tenKhoa;
    }

    @Override
    public String toString(){
        return "Khoa{ idKhoa: "+ idKhoa + ", Khoa: " + tenKhoa + ", Danh sach bac si: "+ getDanhSachBacSi()+ "}";
    }



}

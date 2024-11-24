package bt_benhviendakhoa;

public class BenhNhan extends Person {
    private String idBenhNhan;
    private String idBenh;
    private String idPhong;
    private String ngayNhapVien;
    private String ngayXuatVien;
    private String idBacSiDM;

    public BenhNhan(String ten, String namSinh, String diaChi, String idBenhNhan, String idBenh, String idPhong, String ngayNhapVien, String ngayXuatVien, String idBacSiDM) {
        super(ten, namSinh, diaChi);
        this.idBenhNhan = idBenhNhan;
        this.idBenh = idBenh;
        this.idPhong = idPhong;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayXuatVien = ngayXuatVien;
        this.idBacSiDM = idBacSiDM;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getIdBenh() {
        return idBenh;
    }

    public void setIdBenh(String idBenh) {
        this.idBenh = idBenh;
    }

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayXuatVien() {
        return ngayXuatVien;
    }

    public void setNgayXuatVien(String ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public String getIdBacSiDM() {
        return idBacSiDM;
    }

    public void setIdBacSiDM(String idBacSiDM) {
        this.idBacSiDM = idBacSiDM;
    }

    @Override
    public String toString() {
        return "BenhNhan: " + super.toString() + "idBenhNhan: " + idBenhNhan + ", idBenh: " + idBenh + ", idPhong: " + idPhong
                + ", ngayNhapVien: " + ngayNhapVien + ", ngayXuatVien: " + ngayXuatVien + ", idBacSiDamNhiem: " + idBacSiDM;
    }

    public void setThayDoiNgayXuatVien(String ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public void setThayDoiNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public void setThayDoiBacSi(String idBacSiDM) {
        this.idBacSiDM = idBacSiDM;
    }
    public void setThayDoiPhong(String idPhong){
        this.idPhong = idPhong;
    }

}
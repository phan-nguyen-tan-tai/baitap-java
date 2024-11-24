package bt_benhviendakhoa;

public class Person {
    private String ten;
    private String namSinh;
    private String diaChi;

    public Person(String ten, String namSinh, String diaChi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String toString() {
        return "Person[ten=" + ten + ", namSinh=" + namSinh + ", diaChi=" + diaChi + "]";
    }
}

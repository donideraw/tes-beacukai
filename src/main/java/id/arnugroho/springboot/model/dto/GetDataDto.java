package id.arnugroho.springboot.model.dto;

public class GetDataDto {
    private Double idMahasiswa;
    private String namaMahasiswa;
    private String namaMataKuliah;
    private Integer nilai;

    public Double getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(Double idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }
}

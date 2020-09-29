package id.arnugroho.springboot.model.dto;

public class InputNilaiDto {
    private Integer idNilai;
    private Integer idMataKuliah;
    private Integer idMahasiswa;
    private Integer nilai;
    private String keterangan;

    public Integer getIdNilai() {
        return idNilai;
    }

    public void setIdNilai(Integer idNilai) {
        this.idNilai = idNilai;
    }

    public Integer getIdMataKuliah() {
        return idMataKuliah;
    }

    public void setIdMataKuliah(Integer idMataKuliah) {
        this.idMataKuliah = idMataKuliah;
    }

    public Integer getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(Integer idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}

package id.arnugroho.springboot.model.dto;

public class AverageNilaiDto {
    private Integer average;
    private Integer idMahasiswa;

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public Integer getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(Integer idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }
}

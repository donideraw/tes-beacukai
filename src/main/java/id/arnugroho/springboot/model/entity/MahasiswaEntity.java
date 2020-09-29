package id.arnugroho.springboot.model.entity;

import javax.persistence.*;

@Entity
@Table(name="tabel_mahasiswa")
public class MahasiswaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mahasiswa")
    private Integer idMahasiswa;

    @Column(name="nama_mahasiswa")
    private String namaMahasiswa;

    @Column(name="alamat_mahasiswa")
    private String alamatMahasiswa;

    public Integer getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(Integer idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getAlamatMahasiswa() {
        return alamatMahasiswa;
    }

    public void setAlamatMahasiswa(String alamatMahasiswa) {
        this.alamatMahasiswa = alamatMahasiswa;
    }
}

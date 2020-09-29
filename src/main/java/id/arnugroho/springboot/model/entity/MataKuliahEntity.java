package id.arnugroho.springboot.model.entity;

import javax.persistence.*;

@Entity
@Table(name="tabel_matakuliah")
public class MataKuliahEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_matakuliah")
    private Integer idMataKuliah;

    @Column(name="nama_matakuliah")
    private String NamaMataKuliah;

    @ManyToOne
    @JoinColumn(name="id_mahasiswa")
    private MahasiswaEntity mahasiswaEntity;

    public Integer getIdMataKuliah() {
        return idMataKuliah;
    }

    public void setIdMataKuliah(Integer idMataKuliah) {
        this.idMataKuliah = idMataKuliah;
    }

    public String getNamaMataKuliah() {
        return NamaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        NamaMataKuliah = namaMataKuliah;
    }

    public MahasiswaEntity getMahasiswaEntity() {
        return mahasiswaEntity;
    }

    public void setMahasiswaEntity(MahasiswaEntity mahasiswaEntity) {
        this.mahasiswaEntity = mahasiswaEntity;
    }
}

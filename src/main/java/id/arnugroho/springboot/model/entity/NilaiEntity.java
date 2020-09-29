package id.arnugroho.springboot.model.entity;

import javax.persistence.*;

@Entity
@Table(name="tabel_nilai")
public class NilaiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_nilai")
    private Integer idNilai;

    @ManyToOne
    @JoinColumn(name="id_mahasiswa")
    private MahasiswaEntity mahasiswaEntity;

    @ManyToOne
    @JoinColumn(name="id_matakuliah")
    private MataKuliahEntity mataKuliahEntity;

    @Column(name="nilai")
    private Integer nilai;

    @Column(name="keterangan")
    private String keterangan;

    public Integer getIdNilai() {
        return idNilai;
    }

    public void setIdNilai(Integer idNilai) {
        this.idNilai = idNilai;
    }

    public MahasiswaEntity getMahasiswaEntity() {
        return mahasiswaEntity;
    }

    public void setMahasiswaEntity(MahasiswaEntity mahasiswaEntity) {
        this.mahasiswaEntity = mahasiswaEntity;
    }

    public MataKuliahEntity getMataKuliahEntity() {
        return mataKuliahEntity;
    }

    public void setMataKuliahEntity(MataKuliahEntity mataKuliahEntity) {
        this.mataKuliahEntity = mataKuliahEntity;
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

package id.arnugroho.springboot.repository;

import id.arnugroho.springboot.model.entity.MahasiswaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepository extends JpaRepository<MahasiswaEntity, Integer> {
    @Query(value="select nama_mahasiswa from tabel_mahasiswa where id_mahasiswa = ?", nativeQuery = true)
    String FindNamaMahasiswaByIdMahasiswa (Integer idMahasiswa);
}

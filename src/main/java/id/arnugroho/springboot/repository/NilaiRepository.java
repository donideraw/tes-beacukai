package id.arnugroho.springboot.repository;

import id.arnugroho.springboot.model.dto.AverageNilaiDto;
import id.arnugroho.springboot.model.entity.NilaiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NilaiRepository extends JpaRepository<NilaiEntity, Integer> {
//    @Query(value = "select avg(nilai),id_mahasiswa from tabel_nilai group by id_mahasiswa", nativeQuery = true)
//    List<AverageNilaiDto> FindAllAverage();

    @Query(value = "select avg(nilai) from tabel_nilai where id_mahasiswa = ?", nativeQuery = true)
    Integer FindAverageById(Integer idMahasiswa);
}

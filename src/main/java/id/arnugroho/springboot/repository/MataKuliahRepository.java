package id.arnugroho.springboot.repository;

import id.arnugroho.springboot.model.entity.MataKuliahEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MataKuliahRepository extends JpaRepository<MataKuliahEntity, Integer> {
    @Query(value="select nama_matakuliah from tabel_matakuliah where id_matakuliah = ?", nativeQuery = true)
    String FindNamaMataKuliahById (Integer idMataKuliah);
}

package id.arnugroho.springboot.controller;

import id.arnugroho.springboot.model.dto.AverageNilaiDto;
import id.arnugroho.springboot.model.dto.GetDataDto;
import id.arnugroho.springboot.model.dto.InputNilaiDto;
import id.arnugroho.springboot.model.entity.MahasiswaEntity;
import id.arnugroho.springboot.model.entity.MataKuliahEntity;
import id.arnugroho.springboot.model.entity.NilaiEntity;
import id.arnugroho.springboot.repository.MahasiswaRepository;
import id.arnugroho.springboot.repository.MataKuliahRepository;
import id.arnugroho.springboot.repository.NilaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/nilai")
public class NilaiController {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Autowired
    private MataKuliahRepository mataKuliahRepository;

    @Autowired
    private NilaiRepository nilaiRepository;

    @PostMapping("/insert")
    public String insert(@RequestBody InputNilaiDto dto) {
        NilaiEntity entity = fromDto(dto);
        nilaiRepository.save(entity);
        return "Nilai berhasil dimasukkan";
    }

    @PutMapping("/update")
    public String update(@RequestBody InputNilaiDto dto) {
        NilaiEntity entity = fromDto(dto);
        entity.setIdNilai(dto.getIdNilai());
        nilaiRepository.save(entity);
        return "Nilai berhasil diganti";
    }

    @DeleteMapping("/delete/{idNilai}")
    public String delete(@PathVariable Integer idNilai) {
        nilaiRepository.deleteById(idNilai);
        return "Nilai berhasil dihapus";
    }

//    @GetMapping("/average/all")
//    public List<AverageNilaiDto> getAllAverage() {
//        List<AverageNilaiDto> dtoList = nilaiRepository.FindAllAverage();
//        return dtoList;
//    }

    @GetMapping("/average/{idMahasiswa}")
    public Integer getAverage(@PathVariable Integer idMahasiswa) {
        return nilaiRepository.FindAverageById(idMahasiswa);
    }

    @GetMapping("/data")
    public List<GetDataDto> getData() {
        List<NilaiEntity> nilaiEntityList = nilaiRepository.findAll();
        List<GetDataDto> dtoList = nilaiEntityList.stream().map(this::toDto).collect(Collectors.toList());
        return dtoList;
    }

    private GetDataDto toDto(NilaiEntity entity) {
        GetDataDto dto = new GetDataDto();
        dto.setIdMahasiswa(entity.getMahasiswaEntity().getIdMahasiswa());
        dto.setNamaMahasiswa(mahasiswaRepository.FindNamaMahasiswaByIdMahasiswa(entity.getMahasiswaEntity().getIdMahasiswa()));
        dto.setNamaMataKuliah(mataKuliahRepository.FindNamaMataKuliahById(entity.getMataKuliahEntity().getIdMataKuliah()));
        dto.setNilai(entity.getNilai());
        return dto;
    }

    private NilaiEntity fromDto(InputNilaiDto dto) {
        NilaiEntity entity = new NilaiEntity();
        MahasiswaEntity mahasiswaEntity = new MahasiswaEntity();
        MataKuliahEntity mataKuliahEntity = new MataKuliahEntity();

        mahasiswaEntity.setIdMahasiswa(dto.getIdMahasiswa());
        mataKuliahEntity.setIdMataKuliah(dto.getIdMataKuliah());

        entity.setMahasiswaEntity(mahasiswaEntity);
        entity.setMataKuliahEntity(mataKuliahEntity);
        entity.setNilai(dto.getNilai());
        entity.setKeterangan(dto.getKeterangan());

        return entity;
    }
}

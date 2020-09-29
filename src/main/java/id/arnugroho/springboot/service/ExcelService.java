package id.arnugroho.springboot.service;

import java.io.IOException;
import java.util.List;

import id.arnugroho.springboot.helper.ExcelHelper;
import id.arnugroho.springboot.model.entity.MahasiswaEntity;
import id.arnugroho.springboot.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//import com.bezkoder.spring.files.excel.helper.ExcelHelper;
//import com.bezkoder.spring.files.excel.model.Tutorial;
//import com.bezkoder.spring.files.excel.repository.TutorialRepository;

@Service
public class ExcelService {
    @Autowired
    MahasiswaRepository repository;

    public void save(MultipartFile file) {
        try {
            List<MahasiswaEntity> tutorials = ExcelHelper.excelToTutorials(file.getInputStream());
            for (int i = 0; i< tutorials.size(); i++) {
                repository.save(tutorials.get(i));
            }

//            repository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }

//    public List<MahasiswaEntity> getAllTutorials() {
//        return repository.findAll();
//    }
}

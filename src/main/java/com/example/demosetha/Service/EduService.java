package com.example.demosetha.Service;

import com.example.demosetha.Model.EduModel;
import com.example.demosetha.Repository.EduRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EduService {

    @Autowired
    private EduRepository eduRepository;
    public void insertEdu(EduModel eduModel){
        eduRepository.save(eduModel);
    }
    public List<EduModel> getEduList(){
        return eduRepository.findAll();
    }
    public void deleteEduId(long eduId){
        eduRepository.deleteById(eduId);
    }
    public void updateOrSaveEdu(EduModel eduModel){
        eduRepository.save(eduModel);
    }
    public EduModel getEduById(long eduId){
        return eduRepository.findById(eduId).get();
    }


}

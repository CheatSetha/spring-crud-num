package com.example.demosetha.Repository;

import com.example.demosetha.Model.EduModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EduRepository extends JpaRepository<EduModel,Long> {
}
package com.example.demosetha.Model;



import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name="tblEducation")
public class EduModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edu_id")
    private long EduId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "from_date",nullable = true)


    private Date fromDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "to_date",nullable = true)

    private Date toDate;
    @Column(name = "country",nullable = true)

    private String country;
    @Column(name = "degree",nullable = true)
    private String degree;
    @Column(name = "program",nullable = true)
    private String program;
    @Column(name = "university",nullable = true)
    private String university;
    @Column(name = "teacher_code",nullable = true)
    private String teacherCode;
    @Column(name = "achievement",nullable = true)
    private String achievement;

    public long getEduId() {
        return EduId;
    }

    public void setEduId(long eduId) {
        EduId = eduId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }
}



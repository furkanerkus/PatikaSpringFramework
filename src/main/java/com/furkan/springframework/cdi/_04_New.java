package com.furkan.springframework.cdi;

import com.furkan.springframework.StudentDTO;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    //üretilen
    @Produces
    public String uretilenData(@New StudentDTO studentDTO) {

        studentDTO = StudentDTO.builder().studentId(0L).studentName("student name").studentSurname("student surname").build();
        return studentDTO.getStudentName();
    }

    @Getter
    @Inject
    private String tuketilenData;
}

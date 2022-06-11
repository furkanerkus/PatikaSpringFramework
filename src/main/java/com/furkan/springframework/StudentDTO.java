package com.furkan.springframework;
//Data Transfer Onject ==> DTO


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private Long studentId;
    private String studentName;
    private String studentSurname;
}

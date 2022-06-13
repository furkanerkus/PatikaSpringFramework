package com.furkan.springframework.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@BenimStereoType
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StereoTypeBean {

    private Long id;
    private String name = "Merhabalar";
    private String trade;
}

package com.babelgroup.renting.entities;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Client {
    private Long id;
    private String dni;
    private String name;
    private String lastnameFirst;
    private String lastnameSecond;
    private Integer rating;
    private Date birthdate;
    private Country country;
    private Province provinceCode;
}

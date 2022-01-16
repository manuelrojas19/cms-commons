package com.manuelr.cms.commons.dto;

import com.manuelr.cms.commons.enums.EmployeeType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends PersonDto {
    private EmployeeType employeeType;
    private Long managerId;
    private String position;

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeType=" + employeeType +
                ", id=" + id +
                ", version=" + version +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}

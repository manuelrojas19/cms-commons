package com.manuelr.cms.commons.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.manuelr.cms.commons.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;

@Getter
@Setter
@ToString
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ManagerDto.class, name = "manager"),
        @JsonSubTypes.Type(value = EmployeeDto.class, name = "employee")
})
public abstract class PersonDto extends RepresentationModel<PersonDto> {

    @JsonIgnore
    private static final long serialVersionUID = 3249888605264654579L;

    @Null
    protected Long id;

    protected Long userId;

    @Null
    protected Long version;

    @NotBlank
    protected String firstName;

    protected String secondName;

    @NotBlank
    protected String firstSurname;

    protected String secondSurname;

    @NotNull
    protected Gender gender;

    @Null
    protected String email;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    protected Date birthday;

    @NotNull
    protected AddressDto address;
}

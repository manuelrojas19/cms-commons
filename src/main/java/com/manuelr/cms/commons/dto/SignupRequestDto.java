package com.manuelr.cms.commons.dto;

import com.manuelr.cms.commons.dto.PersonDto;
import com.manuelr.cms.commons.enums.Role;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class SignupRequestDto {
    @Null
    private Long userId;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private Role role;
    @NotNull
    private PersonDto personData;
}

package com.manuelr.cms.commons.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.manuelr.cms.commons.enums.Role;
import lombok.*;

import java.security.Principal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserData implements Principal {

    private String email;
    private Role role;
    private Long userId;
    private Long personId;

    @Override
    @JsonIgnore
    public String getName() {
        return email;
    }
}

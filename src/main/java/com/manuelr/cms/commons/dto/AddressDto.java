package com.manuelr.cms.commons.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AddressDto implements Serializable {
    private String street;
    private String number;
    private String settlement;
    private String postalCode;
    private String locality;
    private String municipality;
    private String state;
    private String country;
}
